package com.example.casavideo.feedback.model;

import com.example.casavideo.cmd.FeedbackType;

public class FeedbackResultItem {
    public FeedbackResultItem(FeedbackType feedbackType) {
        this.feedbackType = feedbackType;
    }
    public FeedbackType feedbackType;
    public int percent;
    public int responseCount;
    public String title;
    public int iconResId;
}
