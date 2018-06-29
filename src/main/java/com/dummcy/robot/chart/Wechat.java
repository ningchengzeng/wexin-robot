package com.dummcy.robot.chart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dummcy.robot.chart.controller.LoginController;
import com.dummcy.robot.chart.core.MsgCenter;
import com.dummcy.robot.chart.face.IMsgHandlerFace;

public class Wechat {
	private static final Logger LOG = LoggerFactory.getLogger(Wechat.class);
	private IMsgHandlerFace msgHandler;

	public Wechat(IMsgHandlerFace msgHandler) {
		System.setProperty("jsse.enableSNIExtension", "false"); // 防止SSL错误
		this.msgHandler = msgHandler;

		// 登陆
		LoginController login = new LoginController();
		login.login();
	}

	public void start() {
		LOG.info("+++++++++++++++++++开始消息处理+++++++++++++++++++++");
		new Thread(()-> MsgCenter.handleMsg(msgHandler)).start();
	}

}
