package com.wallpaper.app.dao;

import com.wallpaper.app.pojo.Picture;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface PictureMapper {
    int deleteByPrimaryKey(Integer picId);

    int insert(Picture record);

    Picture selectByPrimaryKey(Integer picId);

    List<Picture> selectAllAsc();

    List<Picture> selectAllDesc();

    int updateByPrimaryKey(Picture record);
}