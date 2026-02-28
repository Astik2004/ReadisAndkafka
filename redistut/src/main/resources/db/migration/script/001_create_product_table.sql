--liquibase formatted sql
--changeset astik:1_create
CREATE TABLE IF NOT EXISTS product (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    description VARCHAR(500),
    price DOUBLE
);