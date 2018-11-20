package com.summer.left.sakila.mapper;

import com.summer.left.sakila.model.FilmList;
import com.summer.left.sakila.model.FilmListExample;
import org.springframework.stereotype.Repository;

/**
 * FilmListMapper继承基类
 */
@Repository
public interface FilmListMapper extends MyBatisBaseDao<FilmList, FilmList, FilmListExample> {
}