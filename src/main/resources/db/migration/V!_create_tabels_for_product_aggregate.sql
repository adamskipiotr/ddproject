CREATE SEQUENCE product_catalog_id_seq START 1000 INCREMENT 1;
CREATE SEQUENCE product_id_seq START 1000 INCREMENT 1;
CREATE SEQUENCE variation_id_seq START 1000 INCREMENT 1;
CREATE SEQUENCE shipping_country_id_seq START 1000 INCREMENT 1;
CREATE SEQUENCE certification_id_seq START 1000 INCREMENT 1;
CREATE SEQUENCE currency_id_seq START 1000 INCREMENT 1;


CREATE TABLE IF NOT EXISTS product_catalog
(
    id BIGINT NOT NULL PRIMARY KEY DEFAULT nextval('product_id_seq'),
    title VARCHAR(255),
    description VARCHAR(255),
    brand VARCHAR(255),
    category VARCHAR(255)
    isGlobalListing BOOLEAN,
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
    id BIGINT NOT NULL PRIMARY KEY DEFAULT nextval('product_id_seq'),
    title VARCHAR(255),
    description VARCHAR(255),
    brand VARCHAR(255),
    category VARCHAR(255)
    isGlobalListing BOOLEAN,
);

CREATE TABLE IF NOT EXISTS shipping_country
(
    id BIGINT NOT NULL PRIMARY KEY DEFAULT nextval('product_id_seq'),
    title VARCHAR(255),
    description VARCHAR(255),
    brand VARCHAR(255),
    category VARCHAR(255)
    isGlobalListing BOOLEAN,
);

CREATE TABLE IF NOT EXISTS certification
(
    id BIGINT NOT NULL PRIMARY KEY DEFAULT nextval('product_id_seq'),
    title VARCHAR(255),
    description VARCHAR(255),
    brand VARCHAR(255),
    category VARCHAR(255)
    isGlobalListing BOOLEAN,
);

CREATE TABLE IF NOT EXISTS currency
(
    id BIGINT NOT NULL PRIMARY KEY DEFAULT nextval('product_id_seq'),
    title VARCHAR(255),
    description VARCHAR(255),
    brand VARCHAR(255),
    category VARCHAR(255)
    isGlobalListing BOOLEAN,
);