CREATE TABLE user (
    username char(25) PRIMARY KEY not null,
    firstname char(15)   NOT NULL,
    lastname char(15) NOT NULL,
    password char(15) NOT NULL check ( length(password) >= 8 )
);

CREATE TABLE role(
  id bigserial primary key,
  roleName char(20)
);

CREATE TABLE project (
    id bigserial primary key,
    title varchar(100)
);

CREATE TABLE userOwns(
    username char(25),
    project_id int,
    primary key(username, project_id),
    foreign key (username) references user(username),
    foreign key (project_id) references project(id)
);

CREATE TABLE projectParticipating(
    username char(25),
    project_id int,
    primary key(username, project_id),
    foreign key (username) references user(username),
    foreign key (project_id) references project(id)
);

CREATE TABLE projectScrumMaster(
    username char(25),
    project_id int,
    primary key(username, project_id),
    foreign key (username) references user(username),
    foreign key (project_id) references project(id)
);
