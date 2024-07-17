package com.yugabyte.jdbc.sample;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Catalog {

    private @Id Long id;
    private String name;
    private String description;
    private Double amount;
    private Integer quantity;

}
