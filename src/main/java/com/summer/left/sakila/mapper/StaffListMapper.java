package com.summer.left.sakila.mapper;

import com.summer.left.sakila.model.StaffList;
import com.summer.left.sakila.model.StaffListExample;
import org.springframework.stereotype.Repository;

/**
 * StaffListMapper继承基类
 */
@Repository
public interface StaffListMapper extends MyBatisBaseDao<StaffList, StaffList, StaffListExample> {
}