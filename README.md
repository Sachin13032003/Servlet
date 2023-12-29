<h2>Servlet</h2>
<p> Servlet is server side Technology. servlet provides a model of communication between a web user request and the application or program on the web server.As a component servlet is a program which is executed in web server and responsible for dynamic content generation.</p>
<p>javax.servlet and javax.servlet.http packages contains the classes and interfaces for servlet API. These packages are the standard part of Java’s enterprise edition.
javax.servlet contains a number of classes and interfaces which are mainly used by servlet container.
javax.servlet.http contains a number of classes and interfaces which are mainly used by http protocol.</p>
<h2>Life Cycle</h2>
<p>Servlet life cycle steps:
Load Servlet Class.
Create Servlet instance.
Call init() method.
Call service() method.
Call destoy() method.

<img src="https://imgs.search.brave.com/rIK7K_U-fKF8LNlkwWUNfEeIXTD-z-wYTTVdSMSev3c/rs:fit:860:0:0/g:ce/aHR0cHM6Ly9kMWpu/eDliYThzNmo5ci5j/bG91ZGZyb250Lm5l/dC9ibG9nL3dwLWNv/bnRlbnQvdXBsb2Fk/cy8yMDE5LzAxLzIt/Mi5wbmc" height="500px" width ="500px">
  
<b>1. Load Servlet Class:</b> Web container loads the servlet when the first request is received. This step is executed only once at the time of first request.

<b>2. Create Servlet instance: </b>After loading the servlet class web container creates the servlet instance. Only one instance is created for a servlet and all concurrent requests are executed on the same servlet instance.

<b>3. Call init() method:</b> After creating the servlet instance web container calls the servlet’s init method. This method is used to initialize the servlet before processing first request. It is called only once by the web container.

<b>4. Call service() method:</b> After initialization process web container calls service method. Service method is called for every request. For every request servlet creates a separate thread.

<b>5.Call destoy() method:</b> This method is called by web container before removing the servlet instance. Destroy method asks servlet to releases all the resources associated with it. It is called only once by the web container when all threads of the servlet have exited or in a timeout case.</p>
<h2>Creation of a servlet</h2>
<h4>>Steps to create the servlet using Tomcat server</h4>
<p>Create a directory structure
1. Create a Servlet
2. Compile the Servlet
3. Create a deployment descriptor
4. Start the server and deploy the application


The servlet example can be created by three ways:

1. By implementing Servlet interface,
2. By inheriting GenericServlet class, (or)
3. By inheriting HttpServlet class

The mostly used approach is by extending HttpServlet because it provides http request specific method such as doGet(), doPost(), doHead() etc.

Here, we are going to use apache tomcat server in this example. The steps are as follows:

1. Create a directory structure</br>
2. Create a Servlet</br>
3. Compile the Servlet</br>
4. Create a deployment descriptor</br>
5. Start the server and deploy the project</br>
6. Access the servlet</br>

<b>1)Create a directory structures</b></br>
The directory structure defines that where to put the different types of files so that web container may get the information and respond to the client.</br>

The Sun Microsystem defines a unique standard to be followed by all the server vendors. Let's see the directory structure that must be followed to create the servlet.

<img src= "https://static.javatpoint.com/images/directory.JPG" height="500px" width ="500px">

     directory structure of servlet
     
As you can see that the servlet class file must be in the classes folder. The web.xml file must be under the WEB-INF folder.</br>

<b>2)Create a Servlet
There are three ways to create the servlet.</br>
1. By implementing the Servlet interface</br>
2. By inheriting the GenericServlet class</br>
3. By inheriting the HttpServlet class</br>

The HttpServlet class is widely used to create the servlet because it provides methods to handle http requests such as doGet(), doPost, doHead() etc.
In this example we are going to create a servlet that extends the HttpServlet class. In this example, we are inheriting the HttpServlet class and providing the implementation of the doGet() method. Notice that get request is the default request.</br>
<b>Code Example :- </b></br>

<b>DemoServlet.java
import javax.servlet.http.*;  
import javax.servlet.*;  
import java.io.*;  
public class DemoServlet extends HttpServlet{  
public void doGet(HttpServletRequest req,HttpServletResponse res)  
throws ServletException,IOException  
{  
res.setContentType("text/html");//setting the content type  
PrintWriter pw=res.getWriter();//get the stream to write the data  
  
//writing html in the stream  
pw.println("<html><body>");  
pw.println("Welcome to servlet");  
pw.println("</body></html>");  
  
pw.close();//closing the stream  
}}  </b></br>
<b>3)Compile the servlet</b></br>
For compiling the Servlet, jar file is required to be loaded. Different Servers provide different jar files:</br>

Jar file	Server
1) servlet-api.jar	- Apache Tomcat
2) weblogic.jar -	Weblogic
3) javaee.jar	- Glassfish
4) javaee.jar	- JBoss

Two ways to load the jar file</br>
1. set classpath</br>
2. paste the jar file in JRE/lib/ext folder</br>
Put the java file in any folder. After compiling the java file, paste the class file of servlet in WEB-INF/classes directory.</br>

<b>4)Create the deployment descriptor (web.xml file)</b></br>
The deployment descriptor is an xml file, from which Web Container gets the information about the servet to be invoked.</br>

The web container uses the Parser to get the information from the web.xml file. There are many xml parsers such as SAX, DOM and Pull.</br>

There are many elements in the web.xml file. Here is given some necessary elements to run the simple servlet program.</br>


<p>web.xml file

<web-app> 
  
servlet
  
servlet-name sonoojaiswal  servlet-name

servlet-class  DemoServlet   servlet-class

servlet
  
servlet-mapping  </br>
servlet-name sonoojaiswal servlet-name>  </br>
url-pattern   /welcome  url-pattern </br>
servlet-mapping   </br>
  
web-app  </br>
Description of the elements of web.xml file</br></p>
There are too many elements in the web.xml file. Here is the illustration of some elements that is used in the above web.xml file. The elements are as follows:</br>


web-app represents the whole application.</br>
servlet tag is sub element of <web-app> and represents the servlet.</br>
servlet-name tagis sub element of <servlet> represents the name of the servlet.</br>
servlet-class tag is sub element of <servlet> represents the class of the servlet.</br>
servlet-mapping tag is sub element of <web-app>. It is used to map the servlet.</br>
url-pattern  tag is sub element of <servlet-mapping>. This pattern is used at client side to invoke the servlet.</br>
<b>5)Start the Server and deploy the project</b></br>
To start Apache Tomcat server, double click on the startup.bat file under apache-tomcat/bin directory.</br>

