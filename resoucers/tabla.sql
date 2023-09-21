DROP TABLE IF EXISTS `client`;
CREATE TABLE `proyecto_coder`.`client` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(75) NOT NULL,
  `last_name` VARCHAR(75) NOT NULL,
  `doc_number` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`)
  );

DROP TABLE IF EXISTS `invoice`;
CREATE TABLE entregable_3/entregable_3/.invoice(
  	id INT NOT NULL AUTO_INCREMENT,
      client_id INT NOT NULL,
      created_at DATE NOT NULL,
      total DOUBLE NOT NULL,
      PRIMARY KEY (id),
      FOREIGN KEY (client_id) REFERENCES entregable_3(id)
  );

DROP TABLE IF EXISTS `product`;
CREATE TABLE entregable_3(
  id INT NOT NULL AUTO_INCREMENT,
  `description` VARCHAR(150) NOT NULL,
  `code` VARCHAR(50) NOT NULL,
  stock INT NOT NULL,
  price DOUBLE NOT NULL,
  PRIMARY KEY (id)
  );

DROP TABLE IF EXISTS `invoice_detail`;
CREATE TABLE entregable_3.invoice_detail (
      id INT NOT NULL AUTO_INCREMENT,
      invoice_id INT NOT NULL,
      amount INT NOT NULL,
      product_id INT NOT NULL,
      price DOUBLE NOT NULL,
      PRIMARY KEY (id),
      FOREIGN KEY (invoice_id) REFERENCES entregable_3.invoice(id),
      FOREIGN KEY (product_id) REFERENCES entregable_3.product(id)
  );