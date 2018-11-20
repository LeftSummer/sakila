package com.summer.left.sakila.mapper;

import com.summer.left.sakila.model.Customer;
import com.summer.left.sakila.model.CustomerExample;
import org.springframework.stereotype.Repository;

/**
 * CustomerMapper继承基类
 */
@Repository
public interface CustomerMapper extends MyBatisBaseDao<Customer, Short, CustomerExample> {
}