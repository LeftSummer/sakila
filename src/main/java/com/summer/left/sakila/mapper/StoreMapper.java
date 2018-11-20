package com.summer.left.sakila.mapper;

import com.summer.left.sakila.model.Store;
import com.summer.left.sakila.model.StoreExample;
import org.springframework.stereotype.Repository;

/**
 * StoreMapper继承基类
 */
@Repository
public interface StoreMapper extends MyBatisBaseDao<Store, Byte, StoreExample> {
}