CREATE TYPE order_status as ENUM ('PENDING','CONFIRMED','SHIPPED', 'DELIVERED', 'CANCELLED', 'RETURNED');

CREATE SEQUENCE order_id_seq START 1000 INCREMENT 1;
CREATE SEQUENCE order_item_id_seq START 1000 INCREMENT 1;
CREATE SEQUENCE payment_method_id_seq START 1000 INCREMENT 1;
CREATE SEQUENCE shipping_detail_id_seq START 1000 INCREMENT 1;

CREATE TABLE IF NOT EXISTS "order"
(
    id BIGINT NOT NULL PRIMARY KEY DEFAULT nextval('order_id_seq'),
    order_status VARCHAR(255),
    order_date TIMESTAMP,
    total_cost NUMERIC,
    payment_method_id BIGINT
);

CREATE TABLE IF NOT EXISTS order_item
(
    id BIGINT NOT NULL PRIMARY KEY DEFAULT nextval('order_item_id_seq'),
    sku VARCHAR(255),
    name VARCHAR(255),
    price NUMERIC,
    quantity INTEGER,
    order_id BIGINT
);

CREATE TABLE IF NOT EXISTS payment_method
(
    id BIGINT NOT NULL PRIMARY KEY DEFAULT nextval('payment_method_id_seq'),
    method VARCHAR(255),
    details VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS shipping_detail
(
    id BIGINT NOT NULL PRIMARY KEY DEFAULT nextval('shipping_detail_id_seq'),
    address VARCHAR(255),
    city VARCHAR(255),
    state VARCHAR(255),
    country VARCHAR(255),
    postal_code VARCHAR(255),
    shipping_method VARCHAR(255),
    estimated_delivery_date TIMESTAMP,
    real_delivery_date TIMESTAMP
);