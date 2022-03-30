package com.example.casavideo.cmd;

import com.example.casavideo.IListener;

public interface CmdHandler extends IListener {
    void onCmdReceived(CmdRequest request);
}
