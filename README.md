# Cinema app

![cinema hall](https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.openbusiness.ru%2Fbiz%2Fbusiness%2Fkak-otkryt-kinoteatr%2F&psig=AOvVaw2ohPfWZDFIQOVhNr0pUSYV&ust=1630417344688000&source=images&cd=vfe&ved=0CAoQjRxqFwoTCNDElYjw2PICFQAAAAAdAAAAABAN)

This app designed to be a simple simulation of cinema. 

Using this app as a user you can:
* register as a new user
* login if you have been registered
* look for list of films that are shown here
* look at the available sessions of your favorite films at a convenient date
* add tickets for movie session into your shopping cart
* look up into your cart
* complete your order and cet your tickets
* even look for the order history!

From the other side, as an administration worker you can:
* update movies that are shown
* add new cinema halls
* create movie sessions for different dates
* search users by their email

### Implementation details
Project based on famous 3-layered architecture:
1. Data access layer (DAO)
1. Application layer (service)
1. Presentation layer (controllers)

### Technologies:
* Apache Tomcat (v9.0.50)
* MySQL
* JDBC
* Spring core
* Spring web
* Spring security
* Hibernate
* Maven
* Maven Checkstyle Plugin

### Features implemented
* Dto validation (such as email and password validation)
* Password hashing
* DataInitializer class for testing purposes

### Recommendation for setup
1. Configure Apache Tomcat for your IDE
1. Install MySQL and MySQL Workbench
1. Create a schema by using the script from resources/init_db.sql in MySQL Workbench
1. In the /resources/db.properties change the URL, USERNAME and PASSWORD properties to the ones you specified when installing MySQL or you can use the ones that are already present
1. Then you can run Tomcat and log in on login page using "admin@i.ua" email and "admin" password, or "user@i.ua" and "user". Or you can even register yourself by /register endpoint ;)
1. You can use postman to create few movies, cinema halls, movie sessions to test things out. Just don't forget about your rights, you can't do it as a user :)
