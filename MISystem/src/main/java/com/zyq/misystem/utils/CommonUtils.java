package com.zyq.misystem.utils;

import java.util.UUID;

public class CommonUtils {
	private CommonUtils() {
		
	}
	
	public static String getRandId() {
		UUID uuid = UUID.randomUUID();
		String id = uuid.toString().replace("-", "").substring(0, 11);
		return id;
	}
}
