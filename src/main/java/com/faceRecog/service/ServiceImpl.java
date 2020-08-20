package com.faceRecog.service;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfRect;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.highgui.HighGui;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import org.opencv.objdetect.CascadeClassifier;
import org.opencv.videoio.VideoCapture;
import org.opencv.videoio.Videoio;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements ServiceInf{
	
	@Override
	public String twoDImageFacialRecog(String inputImageAddress, String xml, String outputImageAddress) {
		System.out.println("ServiceImpl twoDImageFacialRecog run already");
		//1.加载opencv库（done）
    	System.loadLibrary (Core.NATIVE_LIBRARY_NAME); 
    	
    	//2.调用opencv库里的图片 转化成mat进行操作
    	Mat mat = Imgcodecs.imread(inputImageAddress); 
    	System.out.println(mat);//prints: Mat [ -1*-1*CV_8UC1, isCont=false, isSubmat=false, nativeObj=0x7fbd82c0b8c0, dataAddr=0x0 ]     	
 
    	//3.调用opencv库方法识别图片中人脸坐标
			//用cascadeclassifer加载已学习的haar, 先建csascadeclassifer（）在.load(pathname)也可以
    	CascadeClassifier faceDetector = new CascadeClassifier (xml);
  
    	MatOfRect faceDetections = new MatOfRect(); 
    	
    	//run the detectMultiScale method, passing the received image 
    	//and the MatOfRect（which is faceDetections) as parameters. 
    	// This is where the cascade detector is run
    	faceDetector.detectMultiScale(mat, faceDetections); 
    
    	for ( Rect rect : faceDetections.toArray() ) {
    		
    		Imgproc.rectangle(mat, new Point (rect.x, rect.y), new Point(rect.x + rect.width, rect.y + rect.height),
    				new Scalar ( 0, 255, 0 ), 10 );
    		
    	}
        Imgcodecs.imwrite(outputImageAddress, mat); 
        return outputImageAddress; 
		 
	}
	
	public String getVideoFromCamera() {
	        //1 如果要从摄像头获取视频 则要在 VideoCapture 的构造方法写 0
    		System.loadLibrary (Core.NATIVE_LIBRARY_NAME); 
	    	VideoCapture capture = new VideoCapture();
	        capture.open(0);
	        capture.set(Videoio.CAP_PROP_FRAME_WIDTH,320);
			capture.set(Videoio.CAP_PROP_FRAME_HEIGHT,240);
			System.out.println("ServiceImpl getVideoFromCamera run already");
			return "yes";
	    }
	
	
	

}
