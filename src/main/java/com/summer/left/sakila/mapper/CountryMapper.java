package com.summer.left.sakila.mapper;

import com.summer.left.sakila.model.Country;
import com.summer.left.sakila.model.CountryExample;
import org.springframework.stereotype.Repository;

/**
 * CountryMapper继承基类
 */
@Repository
public interface CountryMapper extends MyBatisBaseDao<Country, Short, CountryExample> {
}