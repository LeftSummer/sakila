package com.summer.left.sakila.mapper;

import com.summer.left.sakila.model.Actor;
import com.summer.left.sakila.model.ActorExample;
import org.springframework.stereotype.Repository;

/**
 * ActorMapper继承基类
 */
@Repository
public interface ActorMapper extends MyBatisBaseDao<Actor, Short, ActorExample> {
}