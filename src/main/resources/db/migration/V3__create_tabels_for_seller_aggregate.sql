CREATE SEQUENCE seller_id_seq START 1000 INCREMENT 1;
CREATE SEQUENCE seller_profile_id_seq START 1000 INCREMENT 1;
CREATE SEQUENCE seller_statistics_id_seq START 1000 INCREMENT 1;


CREATE TABLE IF NOT EXISTS seller
(
    id BIGINT NOT NULL PRIMARY KEY DEFAULT nextval('seller_id_seq')
);

CREATE TABLE IF NOT EXISTS seller_profile
(
    id BIGINT NOT NULL PRIMARY KEY DEFAULT nextval('seller_profile_id_seq'),
    name VARCHAR(255),
    email VARCHAR(255),
    phone_number VARCHAR(255),
    address VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS seller_statistics
(
    id BIGINT NOT NULL PRIMARY KEY DEFAULT nextval('seller_statistics_id_seq'),
    total_sales INTEGER,
    total_reviews INTEGER,
    average_rating DOUBLE PRECISION
);