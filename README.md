# How to Connect MongoDB Atlas with Spring-boot Framework

Heyy Coders!!! My name is Shashwat Sharma and in this repository we will learn how to connect your data base which is in MongoDB Atlas to Spring-boot which is a framework in JAVA.

## Follow these Steps

## Spring initializer

- The link to start Spring-Boot use this link :- https://start.spring.io/
- It is Maven Project, Packaging is JAR and java version is 11
- Dependencies used are Spring Web, Spring Data MongoDB and Spring Boot Dev Tools.
- name and artifact depends on you
- Open pom.xml file using IntelliJ IDE

## Cloud MongoDB Atlas

- Go on https://www.mongodb.com/cloud ; Sign Up or Login if you have 
![](pics/img1.png)
- Click on new project
- Follow the steps
- Clusters usually take 2-5 mins to get build
- Something will show up
![](pics/img2.png) 
- Click on Build a Database
- You will see a dashboard like this
![](pics/img3.png)
- If you see this click on Browse Collections
- Click add my own data
![](pics/img4.png)
- Name the database and collection name according to your choice
- You will see dashboard again
- Click on Connect
![](pics/img5.png)
- For add a connection ip address click on allow access from anywhere
- create a database user and *remeber the username and password will be needed afterwards*
- now click choose connection method
- click connect your application
![](pics/img6.png)
- copy the link from the clipboard

## Code
- I created the project name as customer data
- Just have a look at the project directory
![](pics/img7.png)
- The file with yellow dash is your model. It contains the fields you want.
- The file with orange dash is your modelRepository. It use to extend mongo repository. *This is an Interface file *
- The file with green dash is your main File.
- The file with white tick is use for server port and the link you got while connecting will be used here.

If you have any doubts please feel to message me on LinkedIn : https://www.linkedin.com/in/shashwat-sharma-79221218a/
