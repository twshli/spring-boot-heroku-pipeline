-- liquibase formatted sql

-- changeset shli:1

CREATE TABLE IF NOT EXISTS STUDENT (
  sid SERIAL NOT NULL,
  name VARCHAR(64) NOT NULL,
  age INTEGER DEFAULT 25,
  PRIMARY KEY (sid)
);

INSERT INTO STUDENT
  (name, age)
VALUES
  ('sh1', 23);

-- changeset shli:2

INSERT INTO STUDENT
  (name, age)
VALUES
  ('sh2', 21);

-- changeset tw:3

INSERT INTO STUDENT
  (name)
VALUES
  ('tw3');

