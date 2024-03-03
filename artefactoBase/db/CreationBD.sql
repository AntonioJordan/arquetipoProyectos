--CREATE SCHEMA
CREATE USER jwt_security IDENTIFIED BY 1;

--PERMISOS
ALTER USER jwt_security QUOTA UNLIMITED ON USERS;

--USER CREATION
INSERT INTO JWT_SECURITY.USERS (id, fullName, email, password, created_at, updated_at)
VALUES (1, 'user', 'user@example.com', 'secret', SYSDATE, SYSDATE);