<?xml version="1.0" encoding="UTF-8"?>
<web-app version="2.5" 
	xmlns="http://java.sun.com/xml/ns/javaee" 
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
	xsi:schemaLocation="http://java.sun.com/xml/ns/javaee 
	http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd">
	
	 <welcome-file-list>
    <welcome-file>index.html</welcome-file>
  </welcome-file-list>
   
   <servlet>
    <description>This is the description of my J2EE component</description>
    <display-name>This is the display name of my J2EE component</display-name>
    <servlet-name>CreateServlet</servlet-name>
    <servlet-class>com.javatpoint.CreateServlet</servlet-class>
  </servlet>
  <servlet-mapping>
    <servlet-name>CreateServlet</servlet-name>
    <url-pattern>/CreateServlet</url-pattern>
  </servlet-mapping>
  
   <servlet>
    <description>This is the description of my J2EE component</description>
    <display-name>This is the display name of my J2EE component</display-name>
    <servlet-name>registereduserServlet</servlet-name>
    <servlet-class>com.javatpoint.registereduserServlet</servlet-class>
  </servlet>
  <servlet>
    <description>This is the description of my J2EE component</description>
    <display-name>This is the display name of my J2EE component</display-name>
    <servlet-name>verifyLogin</servlet-name>
    <servlet-class>verifyLogin</servlet-class>
  </servlet>
  <servlet>
    <description>This is the description of my J2EE component</description>
    <display-name>This is the display name of my J2EE component</display-name>
    <servlet-name>VerifyLogin1</servlet-name>
    <servlet-class>com.javatpoint.VerifyLogin1</servlet-class>
  </servlet>
  
  <servlet>
    <description>This is the description of my J2EE component</description>
    <display-name>This is the display name of my J2EE component</display-name>
    <servlet-name>RegisterUser1</servlet-name>
    <servlet-class>com.javatpoint.RegisterUser1</servlet-class>
  </servlet>
  <servlet-mapping>
    <servlet-name>RegisterUser1</servlet-name>
    <url-pattern>/RegisterUser1</url-pattern>
  </servlet-mapping>
 
  
  <servlet>
    <description>This is the description of my J2EE component</description>
    <display-name>This is the display name of my J2EE component</display-name>
    <servlet-name>verifyLogin1</servlet-name>
    <servlet-class>com.javatpoint.verifyLogin1</servlet-class>
  </servlet>
  <servlet>
    <description>This is the description of my J2EE component</description>
    <display-name>This is the display name of my J2EE component</display-name>
    <servlet-name>GetCon</servlet-name>
    <servlet-class>GetCon</servlet-class>
    
   
  </servlet>


  <servlet-mapping>
    <servlet-name>registereduserServlet</servlet-name>
    <url-pattern>/go</url-pattern>
  </servlet-mapping>
  <servlet-mapping>
    <servlet-name>verifyLogin1</servlet-name>
    <url-pattern>/servlet/verifyLogin1</url-pattern>
  </servlet-mapping>
  
  
  <servlet-mapping>
    <servlet-name>VerifyLogin1</servlet-name>
    <url-pattern>/servlet/VerifyLogin1</url-pattern>
  </servlet-mapping>
  <servlet-mapping>
    <servlet-name>verifyLogin1</servlet-name>
    <url-pattern>/servlet/verifyLogin1</url-pattern>
  </servlet-mapping>
  <servlet-mapping>
    <servlet-name>GetCon</servlet-name>
    <url-pattern>/servlet/GetCon</url-pattern>
  </servlet-mapping>
  <servlet-mapping>
    <servlet-name>RegisterUser1</servlet-name>
    <url-pattern>/servlet/RegisterUser1</url-pattern>
  </servlet-mapping>
 



   <listener>
  <listener-class>com.javatpoint.MyListener</listener-class>
  </listener>

  </web-app>
