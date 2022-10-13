package com.videostreaming.dbcontroller.controller;

import com.videostreaming.dbcontroller.dao.IVidDao;
import com.videostreaming.dbcontroller.dao.VidMetaData;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VideoMetaDataController {
    private final IVidDao vidDao;

    public VideoMetaDataController(IVidDao vidDao) {
        this.vidDao = vidDao;
    }

    @GetMapping("/")
    public List<VidMetaData> getVideos() {
        return vidDao.getVideosMetaData();
    }

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public Boolean addVid(@RequestBody VidMetaData vidMetaData) {
        return vidDao.addVideo(vidMetaData) == 1;
    }
}
