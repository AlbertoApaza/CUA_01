-- Active: 1748313349077@@127.0.0.1@14033@model@dbo

INSERT INTO product 
(product_name, product_description, expiration_date, unit_if_measure, product_price, admission_date, current_stock)
    VALUES
    ('Fertilizante NPK 15-15-15', 'Fertilizante granulado balanceado para uso general en cultivos', '2026-12-31', 'KG', 25.50,'2024-05-20', '500'),
    ('Urea 46%', 'Fertilizante nitrogenado de alta concentración para crecimiento vegetativo', '2027-06-30', 'KG', 18.75, '2024-05-15', '1200'),
    ('Fosfato Diamónico (DAP)', 'Fertilizante fosforado y nitrogenado para etapas iniciales del cultivo', '2026-09-15', 'KG', 32.00, '2024-05-22', '750'),
    ('Sulfato de Potasio', 'Fuente de potasio y azufre para mejorar la calidad de frutos', '2027-03-01', 'KG', 28.90, '2024-05-18', '300'),
    ('Abono Orgánico Compostado', 'Mejora la estructura del suelo y aporta nutrientes lentamente', '2025-11-30', 'KG', 12.00, '2024-05-10', '2000');


INSERT INTO Customer (customer_name, last_name, customer_address, phone, email, doc_number, state, document_type)
VALUES 
('Luis', 'Ramírez López', 'Av. Grau 123, Lima', '987654321', 'luis.ramirez@example.com', '12345678', 'A', 'DNI'),
('María', 'Torres Vega', 'Calle Real 456, Arequipa', '912345678', 'maria.torres@example.com', '87654321', 'A', 'DNI'),
('José', 'Pérez Sánchez', 'Jr. Ayacucho 789, Cusco', '998877665', 'jose.perez@example.com', '11223344', 'I', 'DNI'),
('Carla', 'Fernández Ríos', 'Av. Bolognesi 321, Trujillo', '911223344', 'carla.fernandez@example.com', '44556677', 'A', 'DNI'),
('Juan', 'Morales Díaz', 'Calle Libertad 987, Piura', '933221100', 'juan.morales@example.com', '66778899', 'I', 'DNI');


INSERT INTO Employee
(document_type, document_number, first_name, last_name, phone_number, gmail, hire_date, state)
VALUES
('DNI', '12345678', 'Luis', 'Sánchez', '987654321', 'luis.sanchez@mail.com', '2023-01-15', 'A'),
('CNE', '12345678901', 'Ana', 'Paredes', '912345678', 'ana.paredes@mail.com', '2022-11-10', 'A'),
('DNI', '87654321', 'Renato', 'Díaz', '999888777', 'renato.diaz@mail.com', '2021-07-22', 'I'),
('CNE', '987654321234', 'Marta', 'Chacón', '955667788', 'marta.chacon@mail.com', '2024-02-05', 'A'),
('DNI', '11223344', 'Carlos', 'Yupanqui', '911000999', 'carlos.yupanqui@mail.com', '2023-03-30', 'A'),
('CNE', '123456789012345678', 'Elena', 'Flores', '922334455', 'elena.flores@mail.com', '2024-04-01', 'I'),
('DNI', '33445566', 'José', 'Quispe', '933445566', 'jose.quispe@mail.com', '2023-05-10', 'A'),
('CNE', '9876543210987', 'María', 'Torres', '944556677', 'maria.torres@mail.com', '2023-07-20', 'A'),
('DNI', '55667788', 'Pedro', 'Gómez', '955667788', 'pedro.gomez@mail.com', '2023-08-15', 'A'),
('CNE', '123456789012345', 'Juana', 'Rodríguez', '966778899', 'juana.rodriguez@mail.com', '2023-09-05', 'A');

select * from product


select * from Customer

select * from Employee