package com.prashanth.spring.reactive.mysql;

import com.prashanth.spring.reactive.mysql.model.Order;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;


public interface OrderRepository extends ReactiveCrudRepository<Order, Long>{

}
