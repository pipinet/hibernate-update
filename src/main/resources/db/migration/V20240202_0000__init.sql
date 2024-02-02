create extension if not exists "uuid-ossp";
CREATE TABLE IF NOT EXISTS role
(
    id          VARCHAR(36) PRIMARY KEY NOT NULL DEFAULT uuid_generate_v4(),
    name        VARCHAR(100)            NOT NULL,
    attributes  JSONB                   NOT NULL DEFAULT '{}'::jsonb
-- ,
--     permissions VARCHAR(100)[]                   DEFAULT ARRAY []::character varying[] NOT NULL
);

insert into role (id, name, attributes)
values ('role1', 'role1', '{"code": "1"}':: jsonb),
       ('role2', 'role2', '{"code": "1"}':: jsonb),
       ('role3', 'role3', '{"code": "1"}':: jsonb);
