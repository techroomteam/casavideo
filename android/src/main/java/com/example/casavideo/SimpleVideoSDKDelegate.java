package com.example.casavideo;

import java.util.List;

import us.zoom.sdk.ZoomVideoSDKAudioHelper;
import us.zoom.sdk.ZoomVideoSDKAudioRawData;
import us.zoom.sdk.ZoomVideoSDKChatHelper;
import us.zoom.sdk.ZoomVideoSDKChatMessage;
import us.zoom.sdk.ZoomVideoSDKDelegate;
import us.zoom.sdk.ZoomVideoSDKLiveStreamHelper;
import us.zoom.sdk.ZoomVideoSDKLiveStreamStatus;
import us.zoom.sdk.ZoomVideoSDKPasswordHandler;
import us.zoom.sdk.ZoomVideoSDKPhoneFailedReason;
import us.zoom.sdk.ZoomVideoSDKPhoneStatus;
import us.zoom.sdk.ZoomVideoSDKRecordingStatus;
import us.zoom.sdk.ZoomVideoSDKShareHelper;
import us.zoom.sdk.ZoomVideoSDKShareStatus;
import us.zoom.sdk.ZoomVideoSDKUser;
import us.zoom.sdk.ZoomVideoSDKUserHelper;
import us.zoom.sdk.ZoomVideoSDKVideoHelper;

public class SimpleVideoSDKDelegate implements ZoomVideoSDKDelegate {

    @Override
    public void onSessionJoin() {

    }

    @Override
    public void onSessionLeave() {

    }

    @Override
    public void onError(int errorCode) {
        
    } {

    }

    @Override
    public void onUserJoin(ZoomVideoSDKUserHelper userHelper, List<ZoomVideoSDKUser> userList) {

    }

    @Override
    public void onUserLeave(ZoomVideoSDKUserHelper userHelper, List<ZoomVideoSDKUser> userList) {

    }

    @Override
    public void onUserVideoStatusChanged(ZoomVideoSDKVideoHelper videoHelper, List<ZoomVideoSDKUser> userList) {

    }

    @Override
    public void onUserAudioStatusChanged(ZoomVideoSDKAudioHelper audioHelper, List<ZoomVideoSDKUser> userList) {

    }

    @Override
    public void onUserShareStatusChanged(ZoomVideoSDKShareHelper shareHelper, ZoomVideoSDKUser userInfo, ZoomVideoSDKShareStatus status) {

    }

    @Override
    public void onLiveStreamStatusChanged(ZoomVideoSDKLiveStreamHelper liveStreamHelper, ZoomVideoSDKLiveStreamStatus status) {

    }

    @Override
    public void onChatNewMessageNotify(ZoomVideoSDKChatHelper chatHelper, ZoomVideoSDKChatMessage messageItem) {

    }

    @Override
    public void onUserHostChanged(ZoomVideoSDKUserHelper userHelper, ZoomVideoSDKUser userInfo) {

    }

    @Override
    public void onUserManagerChanged(ZoomVideoSDKUser user) {

    }

    @Override
    public void onUserNameChanged(ZoomVideoSDKUser user) {

    }

    @Override
    public void onUserActiveAudioChanged(ZoomVideoSDKAudioHelper audioHelper, List<ZoomVideoSDKUser> list) {
        
    }

    @Override
    public void onSessionNeedPassword(ZoomVideoSDKPasswordHandler handler) {
        
    }

    @Override
    public void onSessionPasswordWrong(ZoomVideoSDKPasswordHandler handler) {
        
    }

    @Override
    public void onMixedAudioRawDataReceived(ZoomVideoSDKAudioRawData rawData) {
        
    }

    @Override
    public void onOneWayAudioRawDataReceived(ZoomVideoSDKAudioRawData rawData, ZoomVideoSDKUser user) {
        
    }

    @Override
    public void onShareAudioRawDataReceived(ZoomVideoSDKAudioRawData rawData) {
        
    }

    @Override
    public void onCommandReceived(ZoomVideoSDKUser sender, String strCmd) {
        
    }

    @Override
    public void onCommandChannelConnectResult(boolean isSuccess) {

    }

    @Override
    public void onCloudRecordingStatus(ZoomVideoSDKRecordingStatus status) {
        
    }

    @Override
    public void onHostAskUnmute() {

    }

    @Override
    public void onInviteByPhoneStatus(ZoomVideoSDKPhoneStatus status, ZoomVideoSDKPhoneFailedReason reason) {
        
    }
}
