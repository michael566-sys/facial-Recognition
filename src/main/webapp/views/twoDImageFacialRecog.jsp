 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>2D图片人脸识别</title>
</head>
<body>

 <ol>
	2D图片人脸识别
	<form action="twoDImageFacialRecog" method="post">     
	 <ol>
			<li>输入图片文件路径名:</li> <input type='text'
			name="inputImageAddress"><br>
				
			<li>输入xml形式的训练集:</li> <input type='text'
			name="xml"><br>	
			
			<li>输入存储图片文件路径名:</li> <input type='text'
			name="outputImageAddress"><br>
			
			<input type="submit"> <br><br>	
	</ol>
	
	</form><hr>
</ol>	

</body>
</html> 
