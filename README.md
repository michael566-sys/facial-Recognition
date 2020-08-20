# facial-Recognition-Project-at-Cheng-Zhi-Hai-Tu
Use Spring Boot MVC, OpenCV to create an Appliation that recognizes human faces on a imported 2D Image. 
Originally a camera recognition was aimed to be developed, but due to the inability for eclipse to access camera on MacBook, the functionality was aborted.

# Usage
-step1: download haarcascade_frontalface_alt.xml from github repository<br />
-step2: download any image from internet with human face on it<br />
-step3: once export the project to eclipse, run the project on eclipse as Spring Boot App<br />
-step4: go to http://localhost:8080/ on internet<br />
-step5: enter <br />1. the pathname of the image that you want to recognize, <br />2. the pathname of the haarcascade_frontalface_alt.xml, <br />
3. the pathname of the directory that you want to save the recognized image to <br /> into the respective blanks<br />
-step6: new recogized image will be save to the pathname and new image will mark out face with a blue square
