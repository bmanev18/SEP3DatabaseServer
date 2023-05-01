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

--
create table productBacklog
(
    id        integer primary key autoincrement,
    userStory varchar(200) not null
);

create table sprint
(
    id integer primary key autoincrement,
    project_id references project (id)
);

create table storyInSprint
(
    sprint    int references sprint (id),
    userStory int references productBacklog (id),
    primary key (sprint, userStory)
);

create table sprintBacklog
(
    id   integer primary key autoincrement,
    task varchar(100)
);

create table projectMeeting
(
    id         integer primary key autoincrement,
    project_id int references sprint (id),
    note       varchar(300),
    author     varchar(25) references user (username)
);

create table sprintMeeting
(
    id        integer primary key autoincrement,
    sprint_id int references sprint (id),
    note      varchar(300),
    author    varchar(25) references user (username)
);
