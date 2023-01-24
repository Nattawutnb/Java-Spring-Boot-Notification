package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.PushNotificationRequest;
import com.example.model.PushNotificationResponse;
import com.example.service.pushNotificationService;

@RestController
public class PushNotificationController {

	private pushNotificationService notificationService;

	public PushNotificationController(pushNotificationService notificationService) {
		this.notificationService = notificationService;

	}

	@PostMapping("/notification/token")
	public ResponseEntity sendTokenNotification(@RequestBody PushNotificationRequest request) {
		notificationService.sendPushNotificationToToken(request);
		return new ResponseEntity<>(new PushNotificationResponse(HttpStatus.OK.value(), "Notification has been sent"),
				HttpStatus.OK);

	}

}
