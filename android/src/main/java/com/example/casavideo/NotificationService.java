package com.example.casavideo;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import us.zoom.sdk.ZoomVideoSDK;


public class NotificationService extends Service {

    @Override
    public void onCreate() {
        super.onCreate();
        Notification notification = NotificationMgr.getConfNotification();
        if (null != notification) {
            startForeground(NotificationMgr.PT_NOTICICATION_ID, notification);
        } else {
            stopSelf();
        }
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        ZoomVideoSDK.getInstance().getShareHelper().stopShare();
        ZoomVideoSDK.getInstance().leaveSession(false);
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onTaskRemoved(Intent rootIntent) {
        NotificationMgr.removeConfNotification();
        stopSelf();
        ZoomVideoSDK.getInstance().getShareHelper().stopShare();
        ZoomVideoSDK.getInstance().leaveSession(false);
    }

}
