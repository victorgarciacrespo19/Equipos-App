CREATE TABLE jugadores
(
    id             VARCHAR(9),
    nombre           VARCHAR(100),
    nacionalidad     VARCHAR(50),
    foto             VARCHAR(200),
    valor_mercado    VARCHAR(10),
    CONSTRAINT "PK_JUGADORES" PRIMARY KEY (id),
    CONSTRAINT "NN_JUGADORES_NOMBRE" CHECK (nombre IS NOT NULL),
    CONSTRAINT "UQ_JUGADORES_NOMBRE" UNIQUE (nombre),
    CONSTRAINT "NN_JUGADORES_NACIONALIDAD" CHECK (nacionalidad IS NOT NULL),
    CONSTRAINT "NN_JUGADORES_VALOR_MERCADO" CHECK (valor_mercado IS NOT NULL)

);