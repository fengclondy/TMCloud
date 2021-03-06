/*
 * Copyright (c) 重庆交通大学.信息科学与工程学院.
 */

package io.github.wesleysugarfree.tmcloud.provider.song.dao.mapper;

import io.github.wesleysugarfree.tmcloud.provider.song.dao.domain.Song;

import java.util.List;

public interface SongMapperExt {
    List<Song> selectSelective(Song record);
}