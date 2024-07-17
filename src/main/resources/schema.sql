DROP TABLE IF EXISTS catalog_items;

CREATE TABLE catalog_items(id BIGINT, name TEXT, description TEXT, amount DECIMAL, quantity INTEGER, PRIMARY KEY (id));
