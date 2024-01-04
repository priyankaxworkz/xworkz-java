package com.xxworkz.contentcreator.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class ContentCreatorDto {
	
	private String userName;
	private String password;
	private String email;
	private String website;
	private int page;
	private long contentLength;
	private int amountPaid;
	private String type;

}
