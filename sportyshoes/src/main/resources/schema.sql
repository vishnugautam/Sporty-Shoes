create table shoelist (
	id bigint primary key auto_increment,
	shoename varchar(45),
	description varchar(45),
	price bigint, 
	size varchar(45),
	usergroup varchar(45),
	color varchar(45)
);