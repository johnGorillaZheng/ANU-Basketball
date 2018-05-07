CREATE SCHEMA `anubasketball` ;

CREATE TABLE `anubasketball`.`competition_manager`(
	pk_id int auto_increment,
    gmt_create date not null,
    gmt_modified date not null,
	uk_username varchar(20) not null unique,
    first_name varchar(20),
    last_name varchar(20),
	password varchar(20) not null,
	primary key (pk_id));

CREATE TABLE `anubasketball`.`competition` (
	pk_id int auto_increment,
    gmt_create date not null,
    gmt_modified date not null,
    competition_name varchar(50) not null,
    logo_location text,
    season year not null,
    gender varchar(10) not null,
    manager_id int not null,
    primary key (pk_id),
    foreign key(manager_id)references competition_manager(pk_id),
    check(competition_loop>0),
    check(gender='male' or gender='female' or gender='mix')
    );
    
CREATE TABLE `anubasketball`.`team` (
	pk_id int auto_increment,
    gmt_create date not null,
    gmt_modified date not null,
    uk_teamname varchar(50) not null unique,
    logo_location text,
    primary key (pk_id)
);

CREATE TABLE `anubasketball`.`record`(
	pk_teamid int,
    gmt_create date not null,
    gmt_modified date not null,
    pk_competitionid int,
    gameplayed int default 0,
    won int default 0,
    draw int default 0,
    lose int default 0,
    primary key(pk_competitionid,pk_teamid),
    foreign key(pk_competitionid)references competition(pk_id),
    foreign key(pk_teamid)references team(pk_id)
);

CREATE TABLE `anubasketball`.`person`(
	pk_id int auto_increment,
    gmt_create date not null,
    gmt_modified date not null,
    person_name varchar(100) not null,
    gender varchar(10) not null,
    logo_location text,
    primary key (pk_id),
    check(gender='male' or gender='female')
);

CREATE TABLE `anubasketball`.`role_in_team`(
	pk_personid int,
    pk_teamid int,
    gmt_create date not null,
    gmt_modified date not null,
    role varchar(10) not null,
    primary key(pk_personid,pk_teamid),
    foreign key(pk_personid)references person(pk_id),
    foreign key(pk_teamid)references team(pk_id),
    check(role='player' or role='coach')
);

CREATE TABLE `anubasketball`.`basketball_match`(
	pk_id int auto_increment,
    gmt_create date not null,
    gmt_modified date not null,
    round int not null,
    match_date datetime,
    location text,
    home_team_score int default 0,
    guest_team_score int default 0,
    competition_id int not null,
    primary key (pk_id),
    foreign key (competition_id) references competition(pk_id),
    check(round>=1),
    check(home_team_score>=0),
    check(guest_team_score>=0)
);


CREATE TABLE `anubasketball`.`role_in_match`(
	pk_personid int,
    pk_matchid int,
    gmt_create date not null,
    gmt_modified date not null,
    role varchar(10) not null,
    primary key(pk_personid,pk_matchid),
    foreign key(pk_personid)references person(pk_id),
    foreign key(pk_matchid)references basketball_match(pk_id),
    check(role='player' or role='duty' or role='referee')
);

CREATE TABLE `anubasketball`.`teamside`(
	pk_teamid int,
    pk_matchid int,
    gmt_create date not null,
    gmt_modified date not null,
    pk_is_host bool,
    primary key(pk_teamid, pk_matchid,pk_is_host),
    foreign key (pk_teamid) references team(pk_id),
    foreign key (pk_matchid) references basketball_match(pk_id)
)

