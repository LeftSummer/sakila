package com.summer.left.sakila.mapper;

import com.summer.left.sakila.model.FilmActor;
import com.summer.left.sakila.model.FilmActorExample;
import com.summer.left.sakila.model.FilmActorKey;
import org.springframework.stereotype.Repository;

/**
 * FilmActorMapper继承基类
 */
@Repository
public interface FilmActorMapper extends MyBatisBaseDao<FilmActor, FilmActorKey, FilmActorExample> {
}