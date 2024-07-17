package com.yugabyte.jdbc.sample;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Table(name = "catalog_items")
public class CatalogItem {

    private @Id Long id;
    private String name;
    private String description;
    private Double amount;
    private Integer quantity;

}
