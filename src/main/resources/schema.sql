use Videos;
CREATE TABLE IF NOT EXISTS Videos (
    Id int NOT NULL AUTO_INCREMENT,
    vidName varchar(255),
    vidDescription varchar(255),
    url varchar(255),
    publisher varchar(255),
    PRIMARY KEY (Id)
);