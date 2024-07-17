package com.yugabyte.jdbc.sample;

import org.springframework.data.repository.CrudRepository;

public interface CatalogItemRepository extends CrudRepository<CatalogItem, Long> {

}
