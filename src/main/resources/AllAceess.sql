CREATE TABLE admin(Admin_id Number PRIMARY KEY NOT NULL, Email varchar(100)  NOT NULL,password varchar(50) NOT NULL,type number);
INSERT INTO admin values(1,"adminproject@gmail.com","admin");

CREATE TABLE BUYERS(user_id number PRIMARY KEY NOT NULL,username varchar(100) NOT NULL,user_password varchar(50) NOT NULL,type number,user_address varchar(100) NOT NULL,contact varchar(20) not null,gender varchar(5) not null);
INSERT INTO BUYERS(1,"kirti","kirti","g-95 dilshad colony","9149396562","gender");

CREATE TABLE STATES(state_id number PRIMARY KEY NOT NULL,state_name varchar(100) UNIQUE NOT NULL);
INSERT INTO STATES(1,"Uttar Pradesh");

CREATE TABLE CITY(City_id number(10) PRIMARY KEY NOT NULL,City_name varchar(50) NOT NULL,state_id number NOT NULL);
INSERT Into CITY(1,"Varanasi");

CREATE TABLE PRODUCT(product_id number PRIMARY KEY NOT NULL,product_title varchar(250) NOT NULL,price number(7,2) NOT NULL,product_manufacturing_date date NOT NULL,vat number(7,2) NOT NULL,discount number(7,2) NOT NULL,Stock number NOT NULL);
INSERT INTO PRODUCT(1,"Samsung Galaxy",5600,"1998/5/25",5,25,5);

CREATE TABLE Enquiry(Enquiry_id number PRIMARY KEY NOT NULL,Enquiry_msg varchar(250) NOT NULL,Enquiry_msg_date_time date NOT NULL,Enquiry_type varchar(250) NOT NULL);
INSERT INTO Enquiry(1,"Furniture category not added","2021/09/25","Product");

CREATE TABLE Category(Category_id number PRIMARY KEY NOT NULL,Category_name varchar(100) NOT NULL);
INSERT INTO Category(1,"Electronics");

CREATE TABLE SubCategory(SubCategory_id number PRIMARY KEY NOT NULL,SubCategory_name varchar(100) NOT NULL);
INSERT INTO Category(1,"Mobile");

CREATE TABLE Seller(shopid number not null primary key,shopowner_name varchar(55) not null,password varchar(16) not null,shop_address_city varchar(55) not null,shop_address_pincode number not null,shop_address_state varchar(55) not null,shop_address_contact_number varchar(16) not null,shop_address_email varchar(100) not null unique,shop_name varchar(100) not null,shop_timings varchar(60) not null,shop_website varchar(50) not null);
INSERT INTO Seller(1,"amit","amit","delhi",01122351546,"amitelectronics@gmail.com","hotspot","11:00-20:00","www.amithotspot.com");

CREATE TABLE Feedback(Feedback_id number PRIMARY KEY NOT NULL,Feedback_msg varchar(250) NOT NULL,Feedback_date date NOT NULL,rate number NOT NULL,user_email varchar(50) NOT NULL);
INSERT INTO Feedback(1,"website is nice","2021/09/27","utsav@gmail.com");