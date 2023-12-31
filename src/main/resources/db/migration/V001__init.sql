CREATE TABLE city (
  id BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
  country varchar(50) NOT NULL,
  "map" varchar(100) NOT NULL,
  "name" varchar(100) NOT NULL,
  state varchar(100) NOT NULL,
  CONSTRAINT city_pkey PRIMARY KEY (id)
);

CREATE TABLE hotel (
  id BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
  "city_id" BIGINT NOT NULL,
  name varchar(100) NOT NULL,
  address varchar(100) NOT NULL,
  zip varchar(30) NOT NULL,
  CONSTRAINT hotel_pkey PRIMARY KEY (id)
);

ALTER TABLE hotel ADD CONSTRAINT fk_hotel_city FOREIGN KEY ("city_id") REFERENCES city (id);