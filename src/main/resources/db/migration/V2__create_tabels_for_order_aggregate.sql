CREATE TYPE order_status as ENUM ('PENDING','CONFIRMED','SHIPPED', 'DELIVERED', 'CANCELLED', 'RETURNED');

CREATE SEQUENCE shipping_detail_id_seq START 1000 INCREMENT 1;
CREATE SEQUENCE product_id_seq START 1000 INCREMENT 1;
CREATE SEQUENCE variation_id_seq START 1000 INCREMENT 1;
CREATE SEQUENCE shipping_country_id_seq START 1000 INCREMENT 1;
CREATE SEQUENCE certification_id_seq START 1000 INCREMENT 1;
CREATE SEQUENCE currency_id_seq START 1000 INCREMENT 1;


CREATE TABLE IF NOT EXISTS 'order'
(
    id BIGINT NOT NULL PRIMARY KEY DEFAULT nextval('order_id_seq'),
);

CREATE TABLE IF NOT EXISTS order_item
(
    id BIGINT NOT NULL PRIMARY KEY DEFAULT nextval('order_item_id_seq'),
    title VARCHAR(255),
    description VARCHAR(255),
    brand VARCHAR(255),
    category VARCHAR(255)
    isGlobalListing BOOLEAN,
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
    postalCode VARCHAR(255),
    shippingMethod VARCHAR(255),
    estimatedDeliveryDate DATE,
    realDeliveryDate DATE,

);
