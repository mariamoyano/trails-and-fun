DROP SCHEMA IF EXISTS users;
CREATE SCHEMA users;
USE users;
DROP TABLE IF EXISTS user;
DROP TABLE IF EXISTS role;

CREATE TABLE user (
	 id BIGINT AUTO_INCREMENT NOT NULL PRIMARY KEY,
     username VARCHAR(255),
     password VARCHAR(255)
	
  );
  CREATE TABLE role (
      id BIGINT AUTO_INCREMENT NOT NULL PRIMARY KEY,
      name VARCHAR(255),
      user_id BIGINT,
      FOREIGN KEY (user_id) REFERENCES user (id)
  ); 
--   INSERT INTO user (username, password) VALUES
-- ("admin","$2a$10$MSzkrmfd5ZTipY0XkuCbAejBC9g74MAg2wrkeu8/m1wQGXDihaX3e"),
-- ("mod", "$2a$10$MSzkrmfd5ZTipY0XkuCbAejBC9g74MAg2wrkeu8/m1wQGXDihaX3e"),
-- ("user", "$2a$10$MSzkrmfd5ZTipY0XkuCbAejBC9g74MAg2wrkeu8/m1wQGXDihaX3e");

-- INSERT INTO role (name, user_id) VALUES
-- ("ADMIN", 1),
-- ("MOD", 2),
-- ("USER", 3);

SELECT * FROM user;
SELECT * FROM role;


