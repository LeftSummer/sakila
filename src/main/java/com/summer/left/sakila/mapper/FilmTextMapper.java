package com.summer.left.sakila.mapper;

import com.summer.left.sakila.model.FilmText;
import com.summer.left.sakila.model.FilmTextExample;
import org.springframework.stereotype.Repository;

/**
 * FilmTextMapper继承基类
 */
@Repository
public interface FilmTextMapper extends MyBatisBaseDao<FilmText, Short, FilmTextExample> {
}