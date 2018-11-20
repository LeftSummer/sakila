package com.summer.left.sakila.mapper;

import com.summer.left.sakila.model.Film;
import com.summer.left.sakila.model.FilmExample;
import org.springframework.stereotype.Repository;

/**
 * FilmMapper继承基类
 */
@Repository
public interface FilmMapper extends MyBatisBaseDao<Film, Short, FilmExample> {
}