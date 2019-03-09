package com.prashanth.spring.reactive.mysql;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;


public interface OrderRepository extends ReactiveCrudRepository<Order, Long>{

}
