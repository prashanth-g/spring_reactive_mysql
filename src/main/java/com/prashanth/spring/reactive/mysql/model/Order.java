package com.prashanth.spring.reactive.mysql.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Table;

@Table("orders")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    private Long id;

    private String fn;

}
