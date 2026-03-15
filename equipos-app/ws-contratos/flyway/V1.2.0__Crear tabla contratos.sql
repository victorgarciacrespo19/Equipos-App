CREATE TABLE contratos
(
    id VARCHAR(9),
    id_jugador VARCHAR(9),
    id_equipo VARCHAR(9),
    fin_contrato VARCHAR(4),
    CONSTRAINT "PK_CONTRATOS" PRIMARY KEY (id),
    CONSTRAINT "FK_CONTRATOS_EQUIPOS"  FOREIGN KEY (id_equipo)  REFERENCES equipos(id),
    CONSTRAINT "FK_CONTRATOS_JUGADORES"  FOREIGN KEY (id_jugador)  REFERENCES jugadores(id),
    CONSTRAINT "NN_FIN_CONTRATO" CHECK ( fin_contrato IS NOT NULL)


);
