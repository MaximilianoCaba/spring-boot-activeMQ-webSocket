package com.guru.api.notification.enums;

public enum CountryEnum {

	AR(1,"00054"),
	CL(2,"00056"),
	PE(3,"00051"),
	CO(4,"00057"),
	SV(5,"00503"),
	EC(6,"00593"),
	GU(7,"00502"),
	PA(8,"00507"),
	NI(9,"00505"),
	HO(10,"00504"),
	DO(11,"00001");

	private Integer code;
	private String areaCode;

	private CountryEnum(Integer code, String areaCode) {
		this.code = code;
		this.areaCode = areaCode;
	}

	public Integer getCode() {
		return code;
	}

	public String getAreaCode() {
		return areaCode;
	}

}
