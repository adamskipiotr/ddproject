CREATE SEQUENCE product_catalog_id_seq START 1000 INCREMENT 1;
CREATE SEQUENCE product_id_seq START 1000 INCREMENT 1;
CREATE SEQUENCE variation_id_seq START 1000 INCREMENT 1;
CREATE SEQUENCE shipping_country_id_seq START 1000 INCREMENT 1;
CREATE SEQUENCE certification_id_seq START 1000 INCREMENT 1;
CREATE SEQUENCE currency_id_seq START 1000 INCREMENT 1;


CREATE TABLE IF NOT EXISTS product_catalog
(
    id BIGINT NOT NULL PRIMARY KEY DEFAULT nextval('product_catalog_id_seq')
);

CREATE TABLE IF NOT EXISTS product
(
    product_id BIGINT NOT NULL PRIMARY KEY DEFAULT nextval('product_id_seq'),
    title VARCHAR(255),
    description VARCHAR(255),
    brand VARCHAR(255),
    category VARCHAR(255),
    is_global_listing BOOLEAN,
    product_catalog_id BIGINT
);

CREATE TABLE IF NOT EXISTS product__available_currencies
(
    product_id BIGINT,
    available_currency_id BIGINT
);

CREATE TABLE IF NOT EXISTS product__shipping_countries
(
    product_id BIGINT,
    shipping_country_id BIGINT
);

CREATE TABLE IF NOT EXISTS variation
(
    id BIGINT NOT NULL PRIMARY KEY DEFAULT nextval('variation_id_seq'),
    "size" VARCHAR(255),
    color VARCHAR(255),
    material VARCHAR(255),
    sku VARCHAR(255),
    price DOUBLE PRECISION,
    inventory_quantity INTEGER,
    product_product_id BIGINT
);

CREATE TABLE IF NOT EXISTS shipping_country
(
    id BIGINT NOT NULL PRIMARY KEY DEFAULT nextval('shipping_country_id_seq'),
    name VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS certification
(
    id BIGINT NOT NULL PRIMARY KEY DEFAULT nextval('certification_id_seq'),
    issuer VARCHAR(255),
    certification_date TIMESTAMP,
    valid_date TIMESTAMP,
    product_product_id BIGINT -- field related to mapping, fix name later
);

CREATE TABLE IF NOT EXISTS currency
(
    id BIGINT NOT NULL PRIMARY KEY DEFAULT nextval('currency_id_seq'),
    name VARCHAR(255)
);