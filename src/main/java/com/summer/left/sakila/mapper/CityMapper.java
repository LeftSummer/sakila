package com.summer.left.sakila.mapper;

import com.summer.left.sakila.model.City;
import com.summer.left.sakila.model.CityExample;
import org.springframework.stereotype.Repository;

/**
 * CityMapper继承基类
 */
@Repository
public interface CityMapper extends MyBatisBaseDao<City, Short, CityExample> {
}