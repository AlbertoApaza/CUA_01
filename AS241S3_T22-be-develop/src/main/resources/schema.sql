-- Active: 1748313349077@@127.0.0.1@14033@model@dbo
CREATE TABLE product (
    id_product int IDENTITY(1,1) PRIMARY KEY,
    product_name varchar(100)  NOT NULL,
    product_description varchar(100)  NOT NULL,
    expiration_date date  NOT NULL,
    unit_if_measure varchar(3) NOT NULL,
    product_price decimal(10,2)  NOT NULL,
    admission_date date  NOT NULL,
    current_stock char(100)  NOT NULL,
    state char(1)  DEFAULT 'A'
);

-- Table: Customer
CREATE TABLE Customer (
    customer_id int  NOT NULL IDENTITY(1, 1),
    customer_name varchar(50)  NOT NULL,
    last_name varchar(100)  NOT NULL,
    customer_address varchar(200)  NOT NULL,
    phone char(9)  NOT NULL,
    email varchar(200)  NOT NULL,
    doc_number varchar(13)  NOT NULL,
    state char(1)  NOT NULL,
    document_type varchar(10)  NOT NULL,
    CONSTRAINT Customer_pk PRIMARY KEY  (customer_id)
);

CREATE TABLE Employee (
    employee_id INT IDENTITY(1,1) PRIMARY KEY,
    document_type CHAR(3) NOT NULL CHECK (document_type IN ('DNI', 'CNE')),
    document_number VARCHAR(20) NOT NULL,
    first_name VARCHAR(150) NOT NULL,
    last_name VARCHAR(150) NULL,
    phone_number CHAR(9) NOT NULL,
    gmail VARCHAR(200) NOT NULL,
    hire_date DATE NOT NULL,
    state CHAR(1) NOT NULL DEFAULT 'A' CHECK (state IN ('A', 'I')),

    CONSTRAINT chk_document_number CHECK (
        (document_type = 'DNI' AND document_number LIKE '[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]' AND LEN(document_number) = 8)
        OR
        (document_type = 'CNE' AND document_number NOT LIKE '%[^0-9]%' AND LEN(document_number) BETWEEN 9 AND 20)
    ),
    CONSTRAINT chk_first_name CHECK (
        first_name NOT LIKE '%[^a-zA-ZáéíóúÁÉÍÓÚñÑ ]%'
    ),
    CONSTRAINT chk_last_name CHECK (
        last_name IS NULL OR last_name NOT LIKE '%[^a-zA-ZáéíóúÁÉÍÓÚñÑ ]%'
    ),
    CONSTRAINT chk_phone_number CHECK (
        phone_number LIKE '[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]'
    ),
    CONSTRAINT chk_gmail CHECK (
        gmail LIKE '%@%.%'
    )
);

    
   




Select * from Customer;
select * from product

select * from employee

drop Table Employee