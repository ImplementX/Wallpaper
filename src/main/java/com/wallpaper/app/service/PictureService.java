package com.wallpaper.app.service;

import com.wallpaper.app.pojo.Picture;

import java.util.List;

public interface PictureService {

    List<Picture> listPicturesDesc();

    List<Picture> listPicturesAsc();

}
