package com.faceRecog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.faceRecog.service.ServiceInf;

@Controller
public class controller {
	
	@Autowired
	private ServiceInf userservice; 
	
	@RequestMapping("/")
	public String home() {
		System.out.println("home run already");
		return "home";
	}
	
	@RequestMapping("/twoDImageFacialRecog")
	public String twoDImageFacialRecog() {
		System.out.println("twoDImageFacialRecog run already");
		return "twoDImageFacialRecog";
	}
	
	@RequestMapping("/videoFacialRecog")
	public String videoFacialRecog() {
		System.out.println("videoFacialRecog run already");
		return "videoFacialRecog";
	}
	
	
	@PostMapping("twoDImageFacialRecog") 
	public String twoDImageFacialRecog ( @RequestParam String inputImageAddress, 
			@RequestParam String xml, @RequestParam String outputImageAddress, Model m) {
		
		System.out.println("twoDImageFacialRecog run already");
			
		String str = new String () ; 
		str = userservice.twoDImageFacialRecog(inputImageAddress, xml, outputImageAddress) ;
  				
  				
  		m.addAttribute("result", str) ; 
		
		return "result"; 
	}
	
	
	@PostMapping("getVideoFromCamera") 
	public String getVideoFromCamera() {
		userservice.getVideoFromCamera() ; 
		return "result"; 
	}
	
	

}
