package com.jiesai.camera.Utils;

import java.util.UUID;

public class UuidUtil {

	public static synchronized String get32UUID() {
		String uuid = UUID.randomUUID().toString().trim().replaceAll("-", "");
		return uuid;
	}
	
	public static void main(String[] args) {
		System.out.println(get32UUID());
	}
}

