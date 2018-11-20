package com.summer.left.sakila.mapper;

import com.summer.left.sakila.model.CustomerList;
import com.summer.left.sakila.model.CustomerListExample;
import org.springframework.stereotype.Repository;

/**
 * CustomerListMapper继承基类
 */
@Repository
public interface CustomerListMapper extends MyBatisBaseDao<CustomerList, CustomerList, CustomerListExample> {
}