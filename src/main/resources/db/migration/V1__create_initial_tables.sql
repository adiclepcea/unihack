
CREATE TABLE observers(
	observers_id INTEGER AUTO_INCREMENT,
	name varchar(100),
	phone varchar(100),
	email varchar(200),
	PRIMARY KEY (observers_id)
);

CREATE TABLE ships(
	ships_id INTEGER AUTO_INCREMENT,
	name varchar(100),
	country varchar(100),
	captain varchar(100),
	PRIMARY KEY (ships_id)
);

CREATE TABLE observations(
	observations_id INTEGER AUTO_INCREMENT,
	latitude DECIMAL(10,5),
	longitude DECIMAL(10,5),
	observers_id INTEGER NOT NULL,
	ships_id INTEGER NOT NULL,
	PRIMARY KEY (observations_id),
	FOREIGN KEY (observers_id) REFERENCES observers(observers_id),
	FOREIGN KEY (ships_id) REFERENCES ships(ships_id)
);
