CREATE TABLE members (
  id INT PRIMARY KEY,
  name VARCHAR(250),
  roles VARCHAR,
  username varchar,
  password varchar
);

 
create table books (
    id uuid PRIMARY KEY,
    title varchar,
    author varchar, 
    category varchar,
    status varchar,
    rack int
);