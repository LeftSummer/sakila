package com.summer.left.sakila.mapper;

import com.summer.left.sakila.model.SalesByFilmCategory;
import com.summer.left.sakila.model.SalesByFilmCategoryExample;
import org.springframework.stereotype.Repository;

/**
 * SalesByFilmCategoryMapper继承基类
 */
@Repository
public interface SalesByFilmCategoryMapper extends MyBatisBaseDao<SalesByFilmCategory, SalesByFilmCategory, SalesByFilmCategoryExample> {
}