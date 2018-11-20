package com.summer.left.sakila.mapper;

import com.summer.left.sakila.model.NicerButSlowerFilmList;
import com.summer.left.sakila.model.NicerButSlowerFilmListExample;
import org.springframework.stereotype.Repository;

/**
 * NicerButSlowerFilmListMapper继承基类
 */
@Repository
public interface NicerButSlowerFilmListMapper extends MyBatisBaseDao<NicerButSlowerFilmList, NicerButSlowerFilmList, NicerButSlowerFilmListExample> {
}