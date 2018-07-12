CREATE TABLE staff (staff_id serial PRIMARY KEY,staff_name VARCHAR(100),cluster_id INT,salary INT, current_hotel_id INT);

CREATE TABLE manager(manager_id serial PRIMARY  KEY,manager_name VARCHAR(100),username VARCHAR(100),password VARCHAR(100),hotel_id INT);

CREATE TABLE clusters(cluster_id serial PRIMARY KEY,cluster_name VARCHAR(100));

 CREATE TABLE hotels(hotel_id serial PRIMARY KEY, hotel_name VARCHAR(100),manager_id INT,total_rooms INT,current_rooms INT,current_staff INT,ratio FLOAT,cluster_id INT);

