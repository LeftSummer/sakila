package com.summer.left.sakila.mapper;

import com.summer.left.sakila.model.Payment;
import com.summer.left.sakila.model.PaymentExample;
import org.springframework.stereotype.Repository;

/**
 * PaymentMapper继承基类
 */
@Repository
public interface PaymentMapper extends MyBatisBaseDao<Payment, Short, PaymentExample> {
}