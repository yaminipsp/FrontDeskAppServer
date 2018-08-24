# FrontDeskAppServer

This is a Front Desk Application. It has two main modules. They are:
		
		- User Registration - Adding a user and their corresponding details in the system during the first time of their visit.
		- Receipt Creation	- Creating a Receipt for their donation and the service details in the system.

# Tools and Technologies used:
------------------------------

	IDE 					- Spring Tool Suite (STS)
	Project Structure 		- Spring Intitializr
	Build Tool 				- Maven
	Programming Language	- Java
	API's & Frameworks		- REST API, Spring Boot, Hibernate
	Database				- H2

# Backend:
----------	
Microservices Details:
-----------------------

	- USER Service
		- View All user
		- Search User by ID, Name, Phone & Email
		- View Last 100 User.
				- Yet to implement.

				
	- RECEIPT Service
		- Create Receipt
		- View Receipt by ID
				- Receipt details pops up with the corresponding user details for whom the receipt was created.
		- View Last 100 receipts
				- Yet to implement	
		- Email Service - To Email the receipt to the user.
							- Yet to implement
	
		- Print Service - To send the receipt to printer.
							- Yet to implement
							

# Front-End:
------------
The client part of the application is yet to be implemented.

Tech Stack:
-----------
	Angular 5. 

Architecture Plan:
------------------
	
	-	Using Angular CLI create a client project
	- 	Components Planned
				- Add User
				- List Users
				- View User
				- Create RECEIPT
				- List Receipts
				- View Receipt
