package com.shink.model.dao;

import com.shink.model.entity.Customer;
import com.shink.model.entity.Goods;
import com.shink.model.entity.Order;

import java.util.List;

public interface CustomerDao {
    Customer getById(Long id);
    Long create(String name, String phoneNumber);
    Long update (Customer customer);
    Boolean deleteById(Long id);
}
