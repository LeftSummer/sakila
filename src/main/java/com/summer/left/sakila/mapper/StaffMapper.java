package com.summer.left.sakila.mapper;

import com.summer.left.sakila.model.Staff;
import com.summer.left.sakila.model.StaffExample;
import org.springframework.stereotype.Repository;

/**
 * StaffMapper继承基类
 */
@Repository
public interface StaffMapper extends MyBatisBaseDao<Staff, Byte, StaffExample> {
}