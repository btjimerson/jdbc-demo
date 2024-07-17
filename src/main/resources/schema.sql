DROP TABLE IF EXISTS catalog_item;

CREATE TABLE catalog_item(id BIGINT, name TEXT, description TEXT, amount DECIMAL, quantity INTEGER, PRIMARY KEY (id));
