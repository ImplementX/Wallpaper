package com.wallpaper.app.controller;

import com.google.gson.Gson;
import com.wallpaper.app.pojo.Picture;
import com.wallpaper.app.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.RequestWrapper;
import java.util.List;

@Controller
public class PictureController {
    @Autowired
    PictureService pictureService;

    @RequestMapping("popularList")
    @ResponseBody
    public String getImageAsc(){
        List<Picture> picturesList =  pictureService.listPicturesAsc();
        Gson gson = new Gson();
        return gson.toJson(picturesList);
    }

    @RequestMapping("latestList")
    @ResponseBody
    public String getImageDesc(){
        List<Picture> picturesList =  pictureService.listPicturesDesc();
        Gson gson = new Gson();
        return gson.toJson(picturesList);
    }
}
