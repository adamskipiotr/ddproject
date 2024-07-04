CREATE TYPE order_status as ENUM ('PENDING','CONFIRMED','SHIPPED', 'DELIVERED', 'CANCELLED', 'RETURNED');

CREATE SEQUENCE product_catalog_id_seq START 1000 INCREMENT 1;
CREATE SEQUENCE product_id_seq START 1000 INCREMENT 1;
CREATE SEQUENCE variation_id_seq START 1000 INCREMENT 1;
CREATE SEQUENCE shipping_country_id_seq START 1000 INCREMENT 1;
CREATE SEQUENCE certification_id_seq START 1000 INCREMENT 1;
CREATE SEQUENCE currency_id_seq START 1000 INCREMENT 1;


CREATE TABLE IF NOT EXISTS product_catalog
(
    id BIGINT NOT NULL PRIMARY KEY DEFAULT nextval('product_catalog_id_seq'),
);

CREATE TABLE IF NOT EXISTS product
(
    id BIGINT NOT NULL PRIMARY KEY DEFAULT nextval('product_id_seq'),
    title VARCHAR(255),
    description VARCHAR(255),
    brand VARCHAR(255),
    category VARCHAR(255)
    isGlobalListing BOOLEAN,
);

CREATE TABLE IF NOT EXISTS variation
(
    id BIGINT NOT NULL PRIMARY KEY DEFAULT nextval('variation_id_seq'),
    'size' VARCHAR(255),
    color VARCHAR(255),
    material VARCHAR(255),
    sku VARCHAR(255),
    price DOUBLE,
    inventoryQuantity INTEGER
);

CREATE TABLE IF NOT EXISTS shipping_country
(
    id BIGINT NOT NULL PRIMARY KEY DEFAULT nextval('shipping_country_id_seq'),
    name VARCHAR(255),
);

CREATE TABLE IF NOT EXISTS certification
(
    id BIGINT NOT NULL PRIMARY KEY DEFAULT nextval('certification_id_seq'),
    issuer VARCHAR(255),
    certificationDate DATE,
    validDate DATE
);

CREATE TABLE IF NOT EXISTS currency
(
    id BIGINT NOT NULL PRIMARY KEY DEFAULT nextval('currency_id_seq'),
    name VARCHAR(255),
);