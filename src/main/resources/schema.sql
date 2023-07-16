CREATE SEQUENCE PET_SEQUENCE START WITH 1000000001 INCREMENT BY 1;

CREATE TABLE user (
                      id INT PRIMARY KEY AUTO_INCREMENT,
                      username VARCHAR(50) NOT NULL,
                      firstname VARCHAR(255) NOT NULL,
                      lastname VARCHAR(255) NOT NULL,
                      password VARCHAR(255) NOT NULL,
                      role VARCHAR(50)
);

CREATE TABLE pet (
                     id int DEFAULT NEXTVAL('PET_SEQUENCE') PRIMARY KEY,
                     name varchar(50) NOT NULL,
                     type varchar(50) NOT NULL,
                     color varchar(50) NOT NULL,
                     country varchar(50),
                     owner INT NOT NULL,
                     FOREIGN KEY (owner) REFERENCES user(id)
);

INSERT INTO user (username, firstname, lastname, password, role) VALUES
                                                                     ('user1','John', 'Doe', '$2a$12$jnf74aHyOXPNyfmfuhE.2.sSZti.7A31eBb4pnYYfRPxf3/CFrXjG', 'user'),
                                                                     ('user2','Emma', 'Johnson', '$2a$12$/cMX6fOFVntpIIkKpU98T.xm3jPU5V2h3WFpfn/YsppBs6qm26S8O', 'admin'),
                                                                     ('user3','Michael', 'Davis', '$2a$12$6DA/MJUd9CWHwdXj80mYJ.Y0h8uAn5lfXrAr9DtAJUHBjH1lHa/1y', 'USER');

INSERT INTO pet (name, type, color, country, owner) VALUES
                                                        ('Fluffy', 'Cat', 'White', 'Latvia', 1),
                                                        ('Buddy', 'Dog', 'Golden', NULL, 2),
                                                        ('Max', 'Dog', 'Black', 'Lithuania', 1),
                                                        ('Luna', 'Cat', 'Gray', 'Sweden', 3),
                                                        ('Charlie', 'Dog', 'Brown', NULL, 2),
                                                        ('Milo', 'Cat', 'Orange', 'Latvia', 1),
                                                        ('Bella', 'Dog', 'White', 'Finland', 3),
                                                        ('Oscar', 'Cat', 'Black', 'Estonia', 2),
                                                        ('Lucy', 'Dog', 'Spotted', NULL, 1),
                                                        ('Simba', 'Cat', 'Golden', 'Sweden', 2);


