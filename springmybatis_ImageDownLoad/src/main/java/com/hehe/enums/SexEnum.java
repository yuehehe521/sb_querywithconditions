//package com.hehe.enums;
//
//public enum SexEnum {
//	MALE(1,"男"),
//	FEMALE(2,"女");
//
//	private int id;
//	private String name;
//
//	SexEnum(int id,String name){
//		this.id = id;
//		this.name = name;
//	}
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public static SexEnum getEnumbyId(int id) {
//		for (SexEnum sex : SexEnum.values()) {
//			if (sex.getId() == id) {
//				return sex;
//			}
//		}
//		return null;
//	}
//}
