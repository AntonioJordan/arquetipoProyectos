GRANT SELECT ON V_$SESSION TO JWT_SECURITY;

CREATE SEQUENCE cliente_sequence START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE producto_sequence START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE factura_sequence START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE facturas_item_sequence START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE usuario_sequence START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE role_sequence START WITH 1 INCREMENT BY 1;


-- Crear tabla clientes
CREATE TABLE JWT_SECURITY.clientes (
    id NUMBER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    nombre VARCHAR2(50),
    apellido VARCHAR2(50),
    email VARCHAR2(100),
    create_at DATE,
    foto BLOB
);

-- Crear tabla productos
CREATE TABLE JWT_SECURITY.productos (
    id NUMBER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    nombre VARCHAR2(100),
    precio NUMBER,
    create_at DATE
);

-- Crear tabla facturas
CREATE TABLE JWT_SECURITY.facturas (
    id NUMBER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    descripcion VARCHAR2(255),
    observacion VARCHAR2(255),
    cliente_id NUMBER,
    create_at DATE,
    FOREIGN KEY (cliente_id) REFERENCES clientes(id)
);

-- Crear tabla facturas_items
CREATE TABLE JWT_SECURITY.facturas_items (
    id NUMBER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    cantidad NUMBER,
    factura_id NUMBER,
    producto_id NUMBER,
    FOREIGN KEY (factura_id) REFERENCES facturas(id),
    FOREIGN KEY (producto_id) REFERENCES productos(id)
);

-- Crear tabla usuarios
CREATE TABLE JWT_SECURITY.users (
    id NUMBER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    username VARCHAR2(50) UNIQUE,
    password VARCHAR2(100),
    enabled NUMBER
);

-- Crear tabla authorities
CREATE TABLE JWT_SECURITY.authorities (
    id NUMBER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    user_id NUMBER,
    authority VARCHAR2(50),
    FOREIGN KEY (user_id) REFERENCES users(id)
);


/* Populate tables */

-- Insertar clientes
INSERT INTO JWT_SECURITY.clientes (nombre, apellido, email, create_at, foto) VALUES('Andres', 'Guzman', 'profesor@bolsadeideas.com', TO_DATE('2017-08-01', 'YYYY-MM-DD'), EMPTY_BLOB());
INSERT INTO JWT_SECURITY.clientes (nombre, apellido, email, create_at, foto) VALUES('John', 'Doe', 'john.doe@gmail.com', TO_DATE('2017-08-02', 'YYYY-MM-DD'), EMPTY_BLOB());
-- Continuar con las demás inserciones de clientes, asegurándote de usar TO_DATE para las fechas y EMPTY_BLOB() para campos BLOB vacíos en Oracle SQL.

-- Insertar productos
INSERT INTO JWT_SECURITY.productos (nombre, precio, create_at) VALUES('Panasonic Pantalla LCD', 259990, SYSDATE);
INSERT INTO JWT_SECURITY.productos (nombre, precio, create_at) VALUES('Sony Camara digital DSC-W320B', 123490, SYSDATE);
-- Continuar con las demás inserciones de productos, utilizando SYSDATE para la fecha y hora actuales en Oracle SQL.

-- Insertar facturas
INSERT INTO JWT_SECURITY.facturas (descripcion, observacion, cliente_id, create_at) VALUES('Factura equipos de oficina', null, 1, SYSDATE);
-- Continuar con las demás inserciones de facturas, utilizando SYSDATE para la fecha y hora actuales en Oracle SQL.

-- Insertar usuarios con sus roles
INSERT INTO JWT_SECURITY.users (username, password, enabled) VALUES ('andres','$2a$10$O9wxmH/AeyZZzIS09Wp8YOEMvFnbRVJ8B4dmAMVSGloR62lj.yqXG',1);
INSERT INTO JWT_SECURITY.users (username, password, enabled) VALUES ('admin','$2a$10$DOMDxjYyfZ/e7RcBfUpzqeaCs8pLgcizuiQWXPkU35nOhZlFcE9MS',1);

INSERT INTO JWT_SECURITY.authorities (user_id, authority) VALUES (1,'ROLE_USER');
INSERT INTO JWT_SECURITY.authorities (user_id, authority) VALUES (2,'ROLE_ADMIN');
INSERT INTO JWT_SECURITY.authorities (user_id, authority) VALUES (2,'ROLE_USER');
