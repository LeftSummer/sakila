package com.summer.left.sakila.mapper;

import com.summer.left.sakila.model.Inventory;
import com.summer.left.sakila.model.InventoryExample;
import org.springframework.stereotype.Repository;

/**
 * InventoryMapper继承基类
 */
@Repository
public interface InventoryMapper extends MyBatisBaseDao<Inventory, Integer, InventoryExample> {
}