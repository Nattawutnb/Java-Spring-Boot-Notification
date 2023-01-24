package com.example.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PushNotificationRequest {

	private String title;
	private String message;
	private String topic;
	private String token;

}
