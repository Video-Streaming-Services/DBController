package com.videostreaming.dbcontroller.controller;


import com.videostreaming.dbcontroller.services.VidMetaDataService;
import com.videostreaming.dbcontroller.vidMetaData.VidMetaData;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@AllArgsConstructor
public class VidMetaDataController {
    private final VidMetaDataService vidMetaDataService;

    @GetMapping("/")
    public List<VidMetaData> getVideos() {
        return vidMetaDataService.getVideosMetaData();
    }

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public Boolean addVid(@RequestBody VidMetaData vidMetaData) {
        return vidMetaDataService.saveVidMetaData(vidMetaData) == 1;
    }
}
