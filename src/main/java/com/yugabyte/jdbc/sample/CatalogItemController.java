package com.yugabyte.jdbc.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatalogItemController {

    @Autowired
    CatalogItemRepository catalogRepository;

    @GetMapping("/catalog/items")
    public Iterable<CatalogItem> getAllCatalogItems() {

        return catalogRepository.findAll();
    }
}
