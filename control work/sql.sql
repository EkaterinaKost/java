DROP DATABASE IF EXISTS finalwork; 
CREATE DATABASE finalwork; 
USE finalwork; 
CREATE TABLE animal(
	id INT NOT NULL AUTO_INCREMENT, 
    type Varchar(20) NOT NULL, 
    PRIMARY KEY(id)
    );
CREATE TABLE Domestic_animals (
	id INT NOT NULL AUTO_INCREMENT, 
	class VARCHAR(50) NOT NULL, 
	id_animal INT, PRIMARY KEY (id)
    );
CREATE INDEX animals_domestic ON Domestic_animals (id_animal);
CREATE TABLE Dogs (
	id INT NOT NULL AUTO_INCREMENT, 
	name VARCHAR(50) NOT NULL, 
	decree VARCHAR(200), 
	birthdate Date NOT NULL, 
	id_home INT, 
	PRIMARY KEY (id)
	);
CREATE INDEX home_dogs ON Dogs (id_home);
CREATE TABLE Cats (
	id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    decree VARCHAR(200), 
    birthdate Date NOT NULL, 
    id_home INT, 
    PRIMARY KEY (id)
    );
CREATE INDEX home_cats ON Cats (id_home);
CREATE TABLE Hamsters (
	id INT NOT NULL AUTO_INCREMENT, 
    name VARCHAR(50) NOT NULL, 
    decree VARCHAR(200), 
    birthdate Date NOT NULL, 
    id_home INT, 
    PRIMARY KEY (id)
    );
CREATE INDEX home_hamsters ON Hamsters (id_home);   
CREATE TABLE Pack_animals (
	id INT NOT NULL AUTO_INCREMENT, 
    class VARCHAR(50) NOT NULL, 
    id_animal INT, 
    PRIMARY KEY (id)
	);
 CREATE INDEX animals_pack ON Pack_animals (id_animal);
 CREATE TABLE Horses (
	id INT NOT NULL AUTO_INCREMENT, 
    name VARCHAR(50) NOT NULL, 
    decree VARCHAR(200), 
    birthdate Date NOT NULL, 
    id_pack INT,
    PRIMARY KEY (id)
    );
 CREATE INDEX pack_horses ON Horses(id_pack);
 CREATE TABLE Camels (
	id INT NOT NULL AUTO_INCREMENT, 
    name VARCHAR(50) NOT NULL, 
    decree VARCHAR(200), 
    birthdate Date NOT NULL, 
    id_pack INT, 
    PRIMARY KEY (id)
    );
 CREATE INDEX pack_camels ON Camels(id_pack);
 CREATE TABLE Donkeys (
	id INT NOT NULL AUTO_INCREMENT, 
    name VARCHAR(50) NOT NULL, 
    decree VARCHAR(200), 
    birthdate Date NOT NULL, 
    id_pack INT, 
    PRIMARY KEY (id)
    );
 CREATE INDEX pack_donkeys ON Donkeys(id_pack);
 ALTER TABLE Domestic_animals 
	ADD CONSTRAINT animal_to_home 
	FOREIGN KEY (id_animal) 
    REFERENCES animal (id) ON DELETE RESTRICT ON UPDATE RESTRICT 
    ;
ALTER TABLE Cats 
	ADD CONSTRAINT home_to_cat 
    FOREIGN KEY (id_home) 
    REFERENCES Domestic_animals (id) ON DELETE RESTRICT ON UPDATE RESTRICT
    ;
ALTER TABLE Dogs 
	ADD CONSTRAINT home_to_dog 
    FOREIGN KEY (id_home) 
    REFERENCES Domestic_animals (id) ON DELETE RESTRICT ON UPDATE RESTRICT
    ;
ALTER TABLE Hamsters 
	ADD CONSTRAINT home_to_hamster
    FOREIGN KEY (id_home) 
    REFERENCES Domestic_animals (id) ON DELETE RESTRICT ON UPDATE RESTRICT
    ;
ALTER TABLE Pack_animals 
	ADD CONSTRAINT animal_to_pack
    FOREIGN KEY (id_animal) 
    REFERENCES animal (id) ON DELETE RESTRICT ON UPDATE RESTRICT
    ;
ALTER TABLE Camels 
	ADD CONSTRAINT pack_to_camel 
    FOREIGN KEY (id_pack)
    REFERENCES Pack_animals (id) ON DELETE RESTRICT ON UPDATE RESTRICT
    ;
ALTER TABLE Horses 
	ADD CONSTRAINT pack_to_horse 
    FOREIGN KEY (id_pack) 
    REFERENCES Pack_animals (id) ON DELETE RESTRICT ON UPDATE RESTRICT
    ;
ALTER TABLE Donkeys 
	ADD CONSTRAINT pack_to_donkey 
    FOREIGN KEY (id_pack) 
    REFERENCES Pack_animals (id) ON DELETE RESTRICT ON UPDATE RESTRICT
    ;
INSERT INTO Pack_animals (class, id_animal) VALUES ('Pack', 1);
INSERT INTO Camels (name, decree, birthdate, id_pack)
	VALUES 
	('Горбунок', 'вперед', '2021-10-02', 1),
    ('Саксаул', 'ложись', '2020-01-11', 1),
    ('Грен', 'стоять', '2021-04-05', 1);
SELECT * FROM Camels;
INSERT INTO Donkeys (name, decree, birthdate, id_pack) 
	VALUES 
    ('Упрямый', 'вперед', '2019-09-01', 1),
    ('Ушастый', 'ложись', '2022-01-13', 1), 
    ('Малыш', 'стоять', '2019-02-12', 1);
SELECT * FROM Donkeys;
INSERT INTO Horses (name, decree, birthdate, id_pack) 
	VALUES
    ('Белый', 'вперед', '2019-09-01', 1), 
    ('Гнедой', 'ложись', '2018-12-19', 1), 
    ('Резвый', 'стоять', '2022-06-05', 1);
SELECT * FROM Horses;
INSERT INTO Domestic_animals (class, id_animal) VALUES ('Domestic', 1);
INSERT INTO Cats (name, decree, birthdate, id_home)
	VALUES 
    ('Кексик', 'вперед', '2022-05-01', 1), 
    ('Барсик', 'ложись', '2023-11-30', 1), 
    ('Бася', 'стоять', '2020-04-05', 1);
SELECT * FROM Cats;
INSERT INTO Dogs (name, decree, birthdate, id_home) 
	VALUES 
    ('Чак', 'вперед', '2023-10-01', 1),
    ('Буся', 'ложись', '2020-11-12', 1),
    ('Пушок', 'стоять', '2019-02-12', 1);
INSERT INTO Hamsters (name, decree, birthdate, id_home) 
	VALUES 
    ('Хома', 'forward', '2019-09-01', 1), 
    ('Рома', 'lie down', '2021-10-25', 1),
    ('Маша', 'stand', '2022-11-25', 1);
SELECT * FROM Hamsters;
DELETE FROM Camels;
SELECT name, decree, birthdate, id_pack 
	FROM Horses 
    UNION SELECT name, decree, birthdate, id_pack
    FROM Horses;
CREATE TABLE Young (
	id INT NOT NULL,
    name VARCHAR(50), 
    birthdate DATE, 
    decree VARCHAR(200), 
    age VARCHAR(50)
    );
INSERT INTO Young (id, name, decree, birthdate, age)
	SELECT id, cat_name, decree, birthdate, 
    CONCAT(CAST(TIMESTAMPDIFF(YEAR, birthdate, NOW()) AS CHAR), "yar", CAST(MOD(TIMESTAMPDIFF(MONTH, birthdate, NOW()), 12) AS CHAR), "month")
    AS age FROM Cats WHERE TIMESTAMPDIFF(MONTH, birthdate, NOW()) BETWEEN 12 AND 36;
INSERT INTO Young (id, name, decree, birthdate, age) 
	SELECT id, hamster_name, decree, birthdate, 
    CONCAT(CAST(TIMESTAMPDIFF(YEAR, birthdate, NOW()) AS CHAR), "yar", CAST(MOD(TIMESTAMPDIFF(MONTH, birthdate, NOW()), 12) AS CHAR), "month") 
    AS age FROM Hamsters WHERE TIMESTAMPDIFF(MONTH, birthdate, NOW()) BETWEEN 12 AND 36;
INSERT INTO Young (id, name, decree, birthdate, age) 
	SELECT id, horse_name, decree, birthdate, 
    CONCAT(CAST(TIMESTAMPDIFF(YEAR, birthdate, NOW()) AS CHAR), "yar", CAST(MOD(TIMESTAMPDIFF(MONTH, birthdate, NOW()), 12) AS CHAR), "month") 
    AS age FROM Horses WHERE TIMESTAMPDIFF(MONTH, birthdate, NOW()) BETWEEN 12 AND 36;
INSERT INTO Young (id, name, decree, birthdate, age) 
	SELECT id, donkey_name, decree, birthdate,
    CONCAT(CAST(TIMESTAMPDIFF(YEAR, birthdate, NOW()) AS CHAR), "yar", CAST(MOD(TIMESTAMPDIFF(MONTH, birthdate, NOW()), 12) AS CHAR), "month") 
    AS age FROM Donkeys WHERE TIMESTAMPDIFF(MONTH, birthdate, NOW()) BETWEEN 12 AND 36;
