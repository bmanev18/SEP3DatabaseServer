CREATE TABLE user
(
    username  varchar(25) PRIMARY KEY not null,
    firstname varchar(15)             NOT NULL,
    lastname  varchar(15)             NOT NULL,
    password  varchar(15)             NOT NULL check ( length(password) >= 8 ),
    role_id   int                     not null references role (id)
);

CREATE TABLE project
(
    id    integer primary key,
    title varchar(100)
);

create table role
(
    id   integer primary key,
    name varchar(30)
);

create table worksOn
(
    username   varchar(25) references user (username),
    project_id int references project (id),
    primary key (username, project_id)
);
