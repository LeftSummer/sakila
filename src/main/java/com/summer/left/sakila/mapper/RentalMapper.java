package com.summer.left.sakila.mapper;

import com.summer.left.sakila.model.Rental;
import com.summer.left.sakila.model.RentalExample;
import org.springframework.stereotype.Repository;

/**
 * RentalMapper继承基类
 */
@Repository
public interface RentalMapper extends MyBatisBaseDao<Rental, Integer, RentalExample> {
}