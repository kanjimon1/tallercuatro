CREATE DATABASE IF NOT EXISTS gestion_horas_extras;

CREATE USER 'admin'@'localhost' IDENTIFIED BY '5n4i3m2d1a';
GRANT ALL PRIVILEGES ON gestion_horas_extras.* TO 'admin'@'localhost';
FLUSH PRIVILEGES;

