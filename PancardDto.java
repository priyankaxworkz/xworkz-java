package com.xworkz.pancard.dto;

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
public class PancardDto {
	
	private String userName;
	private long adharNumber;
	private String email;
	private long cotactNumber;
	private String presentAddress;
	private String panNumber;
	private String password;
	

}
