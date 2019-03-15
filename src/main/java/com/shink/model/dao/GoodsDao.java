package com.shink.model.dao;

import com.shink.model.entity.Customer;
import com.shink.model.entity.Goods;
import com.shink.model.entity.Order;

import java.util.List;

public interface GoodsDao {
    Goods getById(Long id);
    Long create(Goods goods);
    Long update (Goods goods);
    Boolean deleteById(Long id);
}
