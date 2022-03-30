package com.example.casavideo.util;

import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;

import org.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import com.github.chrisbanes.photoview.BuildConfig;

public class JWTUtil {

    private static final int USER_IDENTITY_LENGTH_LIMIT = 15;

    final static String TAG = JWTUtil.class.getSimpleName();

    final static long EXPIRED_TIME = 3600 * 4;

    private static final String apiKey = "";

    private static final String apiSecret = "";
    //for sdk user to bind zoom id with app userId.
    public static String customIdentity="test_"+ Build.MODEL;


    public static String createJWTAccessToken(String topic) {

        int version = BuildConfig.VERSION_CODE;
        long iat = System.currentTimeMillis() / 1000;
        long exp = iat + EXPIRED_TIME;

        if (TextUtils.isEmpty(apiKey) || TextUtils.isEmpty(apiSecret) || TextUtils.isEmpty(topic)) {
            return "";
        }

        if (customIdentity != null && (customIdentity.length() > USER_IDENTITY_LENGTH_LIMIT)) {
            Log.e(TAG, "the user_identity " + customIdentity + " exceeds the 15 character limit, and it will be trimming to " + customIdentity.substring(0, USER_IDENTITY_LENGTH_LIMIT));
            customIdentity = customIdentity.substring(0, USER_IDENTITY_LENGTH_LIMIT);
        }

        JSONObject headerObject = new JSONObject();
        JSONObject payLoadObject = new JSONObject();
        try {
            payLoadObject.put("app_key", apiKey);
            payLoadObject.put("version", version);
            payLoadObject.put("iat", iat);
            payLoadObject.put("exp", exp);
            payLoadObject.put("user_identity",customIdentity);
            payLoadObject.put("tpc",topic);
        } catch (Exception e) {
            Log.e(TAG, e.toString());
        }

        try {
            headerObject.put("alg", "HS256");
            headerObject.put("typ", "JWT");
        } catch (Exception e) {
            Log.e(TAG, e.toString());
        }

        String payload = payLoadObject.toString();
        String header = headerObject.toString();

        try {
            String headerBase64Str = Base64.encodeToString(header.getBytes("utf-8"), Base64.NO_WRAP | Base64.NO_PADDING | Base64.URL_SAFE);
            String payloadBase64Str = Base64.encodeToString(payload.getBytes("utf-8"), Base64.NO_WRAP | Base64.NO_PADDING | Base64.URL_SAFE);
            final Mac mac = Mac.getInstance("HmacSHA256");
            SecretKeySpec secretKeySpec = new SecretKeySpec(apiSecret.getBytes(), "HmacSHA256");
            mac.init(secretKeySpec);

            byte[] digest = mac.doFinal((headerBase64Str + "." + payloadBase64Str).getBytes());

            String token = headerBase64Str + "." + payloadBase64Str + "." + Base64.encodeToString(digest, Base64.NO_WRAP | Base64.NO_PADDING | Base64.URL_SAFE);

            Log.d(JWTUtil.class.getName(), "createJWTAccessToken:" + token);

            return token;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        }
        return null;
    }


}
