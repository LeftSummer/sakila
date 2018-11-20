package com.summer.left.sakila.mapper;

import com.summer.left.sakila.model.Language;
import com.summer.left.sakila.model.LanguageExample;
import org.springframework.stereotype.Repository;

/**
 * LanguageMapper继承基类
 */
@Repository
public interface LanguageMapper extends MyBatisBaseDao<Language, Byte, LanguageExample> {
}