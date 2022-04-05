# spring_task
backend java, crud basico

## Installación
base de datos:
```sh
CREATE DATABASE taskdb;
USE taskdb;
CREATE TABLE tarea
(
	id INT AUTO_INCREMENT PRIMARY KEY,
    tarea varchar(200),
    finalizado bool
);
