CREATE TABLE equipos
(
    id                VARCHAR(9),
    nombre            VARCHAR(100) ,
    estadio           VARCHAR(100),
    ciudad            VARCHAR(50),
    fundacion         VARCHAR(4),
    presupuesto       NUMERIC(12, 2),
    escudo            VARCHAR(200),

    CONSTRAINT "PK_EQUIPOS" PRIMARY KEY (id),
    CONSTRAINT "UQ_EQUIPOS_NOMBRE" UNIQUE (nombre),
    CONSTRAINT "NN_EQUIPOS_NOMBRE" CHECK (nombre IS NOT NULL ),
    CONSTRAINT "NN_EQUIPOS_ESTADIO" CHECK (estadio IS NOT NULL ),
    CONSTRAINT "NN_EQUIPOS_CIUDAD" CHECK (ciudad IS NOT NULL ),
    CONSTRAINT "NN_EQUIPOS_FUNDACION" CHECK (fundacion IS NOT NULL ),
    CONSTRAINT "NN_EQUIPOS_PRESUPUESTO" CHECK (presupuesto IS NOT NULL ),
    CONSTRAINT "NN_EQUIPOS_ESCUDO" CHECK (escudo IS NOT NULL )
);