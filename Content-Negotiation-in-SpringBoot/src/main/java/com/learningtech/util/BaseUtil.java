package com.learningtech.util;

import java.sql.Timestamp;
import java.util.UUID;

import com.learningtech.entity.BaseEntity;

public interface BaseUtil {
	
	public static  void created(BaseEntity model ) {
		System.out.println("timestamp "+getTimeStamp());
		model.setCreatedAt(getTimeStamp());
		model.setCreatedBy("Admin");
	}
	
	public static void update(BaseEntity model) {
		model.setUpdatedAt(getTimeStamp());
		model.setUpdatedBy("Admin");
	}
	
	private static Timestamp getTimeStamp() {
		return new Timestamp(System.currentTimeMillis()) ;
//		String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date());
//		return  Timestamp.valueOf(timeStamp);
	}
	
	public static String getId() {
		String uniqueID = UUID.randomUUID().toString();
		return uniqueID.replaceAll("[^0-9a-zA-Z]", "");
	}

}
