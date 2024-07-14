
CREATE SEQUENCE buyer_id_seq START 1000 INCREMENT 1;
CREATE SEQUENCE buyer_profile_id_seq START 1000 INCREMENT 1;
CREATE SEQUENCE order_history_id_seq START 1000 INCREMENT 1;
CREATE SEQUENCE search_preference_id_seq START 1000 INCREMENT 1;

CREATE TABLE IF NOT EXISTS buyer
(
    id BIGINT NOT NULL PRIMARY KEY DEFAULT nextval('buyer_id_seq')
);

CREATE TABLE IF NOT EXISTS buyer_profile
(
    id BIGINT NOT NULL PRIMARY KEY DEFAULT nextval('buyer_profile_id_seq'),
    name VARCHAR(255),
    email VARCHAR(255),
    phone_number VARCHAR(255),
    address VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS buyer_order_history
(
    id BIGINT NOT NULL PRIMARY KEY DEFAULT nextval('order_history_id_seq')
);

CREATE TABLE IF NOT EXISTS search_preference
(
    id BIGINT NOT NULL PRIMARY KEY DEFAULT nextval('search_preference_id_seq'),
    name VARCHAR(255),
    eco_friendly_filter_enabled BOOLEAN
);

CREATE TABLE IF NOT EXISTS preferences (
    search_preference_id BIGINT NOT NULL,
    value VARCHAR(255),
    PRIMARY KEY (search_preference_id, value),
    FOREIGN KEY (search_preference_id) REFERENCES search_preference(id)
);
