use videos;
CREATE TABLE IF NOT EXISTS videos (
    Id int NOT NULL AUTO_INCREMENT,
    vidName varchar(255) NOT NULL,
    vidDescription varchar(255),
    url varchar(255) NOT NULL,
    publisher varchar(255) NOT NULL,
    PRIMARY KEY (Id),
    CONSTRAINT vid_url_unique unique (url)
);