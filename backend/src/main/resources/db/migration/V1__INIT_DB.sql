CREATE TABLE apartment
(
    id          UUID                        NOT NULL,
    name        VARCHAR(255),
    description VARCHAR(255),
    created_at  TIMESTAMP WITHOUT TIME ZONE NOT NULL,
    updated_at  TIMESTAMP WITHOUT TIME ZONE NOT NULL,
    CONSTRAINT pk_apartment PRIMARY KEY (id)
);