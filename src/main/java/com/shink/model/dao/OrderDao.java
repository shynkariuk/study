package com.shink.model.dao;

import com.shink.model.entity.Customer;
import com.shink.model.entity.Goods;
import com.shink.model.entity.Order;

import java.util.List;

public interface OrderDao {
    Order getById(Long id);
    Long create(Customer customer, List<Goods> goods);
    Long update (Order order);
    Boolean deleteById(Long id);

}
