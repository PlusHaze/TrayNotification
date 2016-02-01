package com.github.plushaze.traynotification.notification;

public enum NotificationTypes implements NotificationType {

	INFORMATION("/images/info.png", "#2C54AB"),
	NOTICE("/images/notice.png", "#8D9695"),
	SUCCESS("/images/success.png", "#009961"),
	WARNING("/images/warning.png", "#E23E0A"),
	ERROR("/images/error.png", "#CC0033");

	private final String resource;
	private final String paintHex;

	NotificationTypes(String resource, String paintHex) {
		this.resource = resource;
		this.paintHex = paintHex;
	}

	@Override
	public String resource() {
		return resource;
	}

	@Override
	public String paintHex() {
		return paintHex;
	}

}
