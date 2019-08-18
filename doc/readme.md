# MysQL Database:
use new_schema;
DROP TABLE IF EXISTS books;
CREATE TABLE books (
  id int(11) NOT NULL,
  name varchar(300) NOT NULL,
  price int(11) NOT NULL
);

INSERT INTO books (id, name, price) VALUES
(1, 'High Performance MySQL', 200),
(2, 'MySQL High Availability', 150),
(3, 'MySQL Cookbook', 100);