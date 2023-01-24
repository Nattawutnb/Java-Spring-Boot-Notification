package com.example.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.example.model.PushNotificationRequest;

@Service
public class pushNotificationService {

	private Logger logger = LoggerFactory.getLogger(pushNotificationService.class);

	private FCMService fcmService;

	public pushNotificationService(FCMService fcmService) {
		this.fcmService = fcmService;

	}

	public void sendPushNotificationToToken(PushNotificationRequest request) {
		try {
			fcmService.sendMessageToToken(request);
		} catch (Exception e) {
			logger.error(e.getMessage());
		}

	}

//	private Map<String, String> getSampleloadData() {
//		Map<String, String> pushData = new HashMap<>();
//		pushData.put("messageId", "msgid");
//		pushData.put("text", "txt");
//		pushData.put("user", "pankaj singh");
//		return pushData;
//	}

}
