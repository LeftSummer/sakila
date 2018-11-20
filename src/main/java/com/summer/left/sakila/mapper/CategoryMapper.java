package com.summer.left.sakila.mapper;

import com.summer.left.sakila.model.Category;
import com.summer.left.sakila.model.CategoryExample;
import org.springframework.stereotype.Repository;

/**
 * CategoryMapper继承基类
 */
@Repository
public interface CategoryMapper extends MyBatisBaseDao<Category, Byte, CategoryExample> {
}