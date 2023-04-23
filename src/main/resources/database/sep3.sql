CREATE TABLE user (
    username char(25) PRIMARY KEY not null,
    firstname char(15)   NOT NULL,
    lastname char(15) NOT NULL,
    password char(15) NOT NULL check ( length(password) >= 8 )
);