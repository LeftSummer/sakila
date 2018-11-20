package com.summer.left.sakila.mapper;

import com.summer.left.sakila.model.ActorInfo;
import com.summer.left.sakila.model.ActorInfoExample;
import org.springframework.stereotype.Repository;

/**
 * ActorInfoMapper继承基类
 */
@Repository
public interface ActorInfoMapper extends MyBatisBaseDao<ActorInfo, ActorInfo, ActorInfoExample> {
}