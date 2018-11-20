package com.summer.left.sakila.mapper;

import com.summer.left.sakila.model.FilmCategory;
import com.summer.left.sakila.model.FilmCategoryExample;
import com.summer.left.sakila.model.FilmCategoryKey;
import org.springframework.stereotype.Repository;

/**
 * FilmCategoryMapper继承基类
 */
@Repository
public interface FilmCategoryMapper extends MyBatisBaseDao<FilmCategory, FilmCategoryKey, FilmCategoryExample> {
}