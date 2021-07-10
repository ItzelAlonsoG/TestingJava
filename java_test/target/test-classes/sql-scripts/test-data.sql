
CREATE TABLE IF NOT EXISTS movies (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(50) NOT NULL,
  minutes INT NOT NULL,
  genre VARCHAR(50) NOT NULL,
  director VARCHAR (80) NOT NULL
);

insert into movies (name, minutes, genre,director) values
    ('Dark Knight', 152, 'ACTION','Kevin'),
    ('Memento', 113, 'THRILLER','Itzel'),
    ('Matrix', 136, 'ACTION','Dante'),
    ('Super 9', 112, 'THRILLER','Dante'),
    ('Super man', 112, 'ACTION','Itzel');