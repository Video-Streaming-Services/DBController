package com.videostreaming.dbcontroller.services;


import com.videostreaming.dbcontroller.repositories.VidMetaDataRepository;
import com.videostreaming.dbcontroller.vidMetaData.VidMetaData;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class VidMetaDataService {
    private final VidMetaDataRepository vidMetaDataRepository;

    public List<VidMetaData> getVideosMetaData(){
        return vidMetaDataRepository.findAll();
    }

    public int saveVidMetaData(VidMetaData vidMetaData){
        try{
            vidMetaDataRepository.save(vidMetaData);
        }catch (Exception e){
            System.out.println(e.getMessage());
            return 0;
        }
        return 1;
    }
}
