package com.videostreaming.dbcontroller.vidMetaData;

import lombok.AllArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Table(
        name = "videos",
        uniqueConstraints = {
                @UniqueConstraint(name = "vid_url_unique" , columnNames = "url")
        }
)
@Entity
@AllArgsConstructor
@ToString
public class VidMetaData {
    @Id
    private int id;
    @Column(
            nullable = false
    )
    private String vidName;
    private String vidDescription;
    @Column(
            nullable = false
    )
    private String url;
    @Column(
            nullable = false
    )
    private String publisher;

    public VidMetaData() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVidName() {
        return vidName;
    }

    public void setVidName(String vidName) {
        this.vidName = vidName;
    }

    public String getVidDescription() {
        return vidDescription;
    }

    public void setVidDescription(String vidDescription) {
        this.vidDescription = vidDescription;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
