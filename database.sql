CREATE DATABASE employee;
USE employee;

CREATE TABLE department (
    department_id INT PRIMARY KEY,
    department_name VARCHAR(255) NOT NULL
);

CREATE TABLE employee (
    employee_id INT PRIMARY KEY,
    employee_name VARCHAR(255) NOT NULL,
    salary DECIMAL(10, 2) NOT NULL,
    department_id INT,
    FOREIGN KEY (department_id) REFERENCES department(department_id)
);

SELECT e.employee_id, e.employee_name, d.department_name
FROM employee e
JOIN department d ON e.department_id = d.department_id;

SELECT employee_id, employee_name, salary
FROM employee
ORDER BY salary DESC;

SELECT d.department_name, AVG(e.salary) AS average_salary
FROM department d
JOIN employee e ON d.department_id = e.department_id
GROUP BY d.department_name;