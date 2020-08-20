package com.faceRecog.service;

public interface ServiceInf {
	
	String twoDImageFacialRecog (String inputImageAddress, String xml, String outputImageAddress) ;
	
	String getVideoFromCamera(); 

}
