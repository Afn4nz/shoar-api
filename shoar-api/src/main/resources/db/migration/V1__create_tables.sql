CREATE TABLE category
(
    id bigint IDENTITY,
    name_ar NVARCHAR(255),
    name_en VARCHAR(255),
    thumbnail VARCHAR(255),
    PRIMARY KEY (id)
)
    GO

CREATE TABLE consultant
(
    id bigint IDENTITY,
    name NVARCHAR(255),
    category_id bigint NOT NULL CONSTRAINT CONSULTANT_REFERENCES_CATEGORY REFERENCES category,
    position NVARCHAR(255),
    thumbnail VARCHAR(255),
    PRIMARY KEY (id)
)
    GO