-- TODO You don't need to run this when you have pulled the latest database file

create table project
(
    id    integer
        primary key autoincrement,
    title varchar(100)
);

create table productBacklog
(
    id         integer
        primary key,
    userStory  varchar(200) not null,
    project_id integer      not null
        references project (id),
    priority   varchar(8)   not null,
    check (priority IN ('low', 'high', 'critical'))
);

create table role
(
    id   integer
        primary key autoincrement,
    name varchar(30)
);

create table sprint
(
    id         integer
        primary key autoincrement,
    project_id int
        references project,
    name       text default 'New Sprint' not null,
    startDate  text default (date('now')),
    endDate    text                      not null
);

create table storyInSprint
(
    sprint    int
        references sprint,
    userStory int
        references productBacklog,
    primary key (sprint, userStory)
);

create table user
(
    username  varchar(25) not null
        primary key,
    firstname varchar(15) not null,
    lastname  varchar(15) not null,
    password  varchar(15) not null,
    role_id   int         not null
        references role,
    check (length(password) >= 8)
);

create table projectMeeting
(
    id         integer
        primary key autoincrement,
    project_id int
        references sprint,
    note       varchar(300),
    author     varchar(25)
        references user
);

create table sprintBacklog
(
    id         integer
        primary key autoincrement,
    sprint_id  integer       not null
        references sprint,
    assignee   text
        references user,
    body       text          not null,
    storyPoint integer,
    status     int default 0 not null,
    check (status in (0, 1))
);

create table sprintMeeting
(
    id        integer
        primary key autoincrement,
    sprint_id int
        references sprint,
    note      varchar(300),
    author    varchar(25)
        references user
);

create table worksOn
(
    username   varchar(25)
        references user,
    project_id int
        references project,
    primary key (username, project_id)
);

