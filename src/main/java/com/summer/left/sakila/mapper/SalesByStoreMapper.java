package com.summer.left.sakila.mapper;

import com.summer.left.sakila.model.SalesByStore;
import com.summer.left.sakila.model.SalesByStoreExample;
import org.springframework.stereotype.Repository;

/**
 * SalesByStoreMapper继承基类
 */
@Repository
public interface SalesByStoreMapper extends MyBatisBaseDao<SalesByStore, SalesByStore, SalesByStoreExample> {
}