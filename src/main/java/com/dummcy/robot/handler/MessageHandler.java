package com.dummcy.robot.handler;

import com.dummcy.robot.chart.beans.BaseMsg;
import com.dummcy.robot.chart.face.IMsgHandlerFace;
import org.springframework.stereotype.Component;

@Component
public class MessageHandler implements IMsgHandlerFace {

    @Override
    public String textMsgHandle(BaseMsg msg) {
        return null;
    }

    @Override
    public String picMsgHandle(BaseMsg msg) {
        return null;
    }

    @Override
    public String voiceMsgHandle(BaseMsg msg) {
        return null;
    }

    @Override
    public String viedoMsgHandle(BaseMsg msg) {
        return null;
    }

    @Override
    public String nameCardMsgHandle(BaseMsg msg) {
        return null;
    }

    @Override
    public void sysMsgHandle(BaseMsg msg) {

    }

    @Override
    public String verifyAddFriendMsgHandle(BaseMsg msg) {
        return null;
    }

    @Override
    public String mediaMsgHandle(BaseMsg msg) {
        return null;
    }
}
