package com.xworkz.pancard.runner;

import java.util.Scanner;

import com.xworkz.pancard.dto.PancardDto;
import com.xworkz.pancard.repository.PanCardRepository;
import com.xworkz.pancard.repository.PancardRepsotioryImplementation;
import com.xworkz.pancard.service.PanCardService;
import com.xworkz.pancard.service.PancardServiceImplementation;

public class PanCardRunner {
	
	public static void main(String[] args) {
		
//		PancardDto dto=new PancardDto("neha",966543321234l,"neha@gmail",8765432112l,"murdeswara","HzPX245634","S@#&*azza1");
////		dto.setAdharNumber(966543321234l);
////		dto.setCotactNumber(8765432112l);
////		dto.setEmail("neha@gmail");
////		dto.setPanNumber("HzPX245634");
////		dto.setPassword("S@#&*azza1");
////		dto.setPresentAddress("murdeswara");
////		dto.setUserName("neha");
//	PancardDto dto2=new PancardDto("nikitha",988765543321l,"nikitha@gmail",6754324534l,"heble","Azpx567847","Y@#&*azza1");
//		
////		dto2.setEmail("nikitha@gmail");
////		dto2.setAdharNumber(988765543321l);
////		dto2.setCotactNumber(6754324534l);
////		dto2.setPanNumber("Azpx567847");
////		dto2.setPresentAddress("heble");
////		dto2.setUserName("nikitha");
////		dto2.setPassword("Y@#&*azza1");
////		
//	
//		System.out.println(dto.toString());
//		
//		PanCardRepository repository=new PancardRepsotioryImplementation();
//		
//		PanCardService service=new PancardServiceImplementation(repository);
//		
//		service.validateAndSave(dto);
//		//service.validateAndSave(dto);
//		service.validateAndSave(dto2);
//		
//		//updated method
//		String email="nikitha@gmail";
//		PancardDto dto1=new PancardDto();
//		dto1.setEmail("nikitha2@gmail");
//		service.update(email, dto1);
//		service.read();
//		
//		service.delete("nikitha2@gmail");
//		//service.read();
		
		
     Scanner sc=new Scanner(System.in);
     String userName;
     System.out.println("enter your name");
    userName=sc.next();
    long adharNumber;
    System.out.println("enter adhar number");
    adharNumber=sc.nextLong();
    String email;
    System.out.println("enter email");
     email=sc.next();
     long cotactNumber;
     System.out.println("enter contact number");
      cotactNumber=sc.nextLong();
      String presentAddress;
      System.out.println("enter present address");
       presentAddress=sc.next();
       String panNumber;
       System.out.println("enter the pan number");
       panNumber=sc.next();
       
       String password;
       System.out.println("enter password");
        password=sc.next();
     sc.close();
     
     
		
		
	}

}
