CREATE TABLE IF NOT EXISTS folders
(
    name VARCHAR(60) PRIMARY KEY
);

CREATE TABLE IF NOT EXISTS files
(
    name VARCHAR(60),
    content  VARCHAR(60),
    folder VARCHAR(60),
    primary key (name, folder),
    foreign key (folder) references folders (name)
);