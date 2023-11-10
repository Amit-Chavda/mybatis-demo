CREATE SEQUENCE IF NOT EXISTS departments_id_seq;

CREATE TABLE departments
(
   id bigint NOT NULL DEFAULT nextval('departments_id_seq') PRIMARY KEY,
   name VARCHAR(255) NOT NULL,
   code VARCHAR(255) NOT NULL
);



CREATE SEQUENCE IF NOT EXISTS employees_id_seq;

CREATE TABLE employees
(
   id bigint NOT NULL DEFAULT nextval('employees_id_seq') PRIMARY KEY,
   first_name VARCHAR(255) NOT NULL,
   last_name VARCHAR(255) NOT NULL,
   email_address VARCHAR(255) NOT NULL,
   department_id bigint,
   FOREIGN KEY (department_id) REFERENCES departments(id)
);