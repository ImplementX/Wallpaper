package com.wallpaper.app.service.impl;

import com.wallpaper.app.dao.PictureMapper;
import com.wallpaper.app.pojo.Picture;
import com.wallpaper.app.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PictureServiceImpl implements PictureService{
    @Autowired
    PictureMapper pictureMapper;

    public List<Picture> listPicturesAsc(){
       return pictureMapper.selectAllAsc();
    }

    public List<Picture> listPicturesDesc(){
        return pictureMapper.selectAllDesc();
    }
}
