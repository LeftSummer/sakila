package com.summer.left.sakila.mapper;

import com.summer.left.sakila.model.Address;
import com.summer.left.sakila.model.AddressExample;
import org.springframework.stereotype.Repository;

/**
 * AddressMapper继承基类
 */
@Repository
public interface AddressMapper extends MyBatisBaseDao<Address, Short, AddressExample> {
}