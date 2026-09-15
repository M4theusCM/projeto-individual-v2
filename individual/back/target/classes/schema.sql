CREATE TABLE IF NOT EXISTS veiculos  (
    id INT PRIMARY KEY AUTO_INCREMENT,
    marca VARCHAR(50),
    modelo VARCHAR(100),
    ano DATE,
    cor VARCHAR(30),
    quilometragem INT,

    tipoVeiculo VARCHAR(50),
    tipoCombustivel VARCHAR(50),
    tipoCambio VARCHAR(50),
    qtdPorta INT,

    preco DECIMAL(12, 2),
    estadoVeiculo VARCHAR(50),
    impulsionarAnuncio BOOLEAN,
    emailContato VARCHAR(150),
    numeroContato VARCHAR(20),

    infosAdd VARCHAR(500)
);

CREATE TABLE IF NOT EXISTS tiposCarros(
  id INT PRIMARY KEY AUTO_INCREMENT,
  tipoVeiculo VARCHAR(50)
);


INSERT INTO tiposCarros (tipoVeiculo)
VALUES ('Hatch'),
       ('Sedan'),
       ('SUV'),
       ('Pickup'),
       ('Esportivo'),
       ('Conversível');