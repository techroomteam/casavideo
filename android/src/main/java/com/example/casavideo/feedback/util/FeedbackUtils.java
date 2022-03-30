package com.example.casavideo.feedback.util;

import com.example.casavideo.cmd.CmdFeedbackPushRequest;
import com.example.casavideo.cmd.CmdFeedbackSubmitRequest;
import com.example.casavideo.cmd.CmdHelper;
import com.example.casavideo.cmd.FeedbackType;

public class FeedbackUtils {
    public static void submitFeedback(FeedbackType type) {
        CmdFeedbackSubmitRequest request = new CmdFeedbackSubmitRequest();
        request.feedbackType = type;
        CmdHelper.getInstance().sendCommand(request);
    }

    public static void pushFeedback() {
        CmdFeedbackPushRequest request = new CmdFeedbackPushRequest();
        CmdHelper.getInstance().sendCommand(request);
    }
}
