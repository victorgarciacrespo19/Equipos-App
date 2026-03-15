INSERT INTO contratos (id, id_jugador, id_equipo, fin_contrato)
VALUES
    -- Real Madrid (equipo 15) | jugadores 1-4
    (nextval('seq_contratos'), 1,  15, 2029),
    (nextval('seq_contratos'), 2,  15, 2028),
    (nextval('seq_contratos'), 3,  15, 2029),
    (nextval('seq_contratos'), 4,  15, 2028),

    -- FC Barcelona (equipo 7) | jugadores 5-8
    (nextval('seq_contratos'), 5,  7,  2028),
    (nextval('seq_contratos'), 6,  7,  2027),
    (nextval('seq_contratos'), 7,  7,  2028),
    (nextval('seq_contratos'), 8,  7,  2027),

    -- Atlético de Madrid (equipo 2) | jugadores 9-12
    (nextval('seq_contratos'), 9,  2,  2027),
    (nextval('seq_contratos'), 10, 2,  2029),
    (nextval('seq_contratos'), 11, 2,  2028),
    (nextval('seq_contratos'), 12, 2,  2027),

    -- Athletic Club (equipo 1) | jugadores 13-16
    (nextval('seq_contratos'), 13, 1,  2028),
    (nextval('seq_contratos'), 14, 1,  2027),
    (nextval('seq_contratos'), 15, 1,  2028),
    (nextval('seq_contratos'), 16, 1,  2027),

    -- Real Betis (equipo 14) | jugadores 17-20
    (nextval('seq_contratos'), 17, 14, 2027),
    (nextval('seq_contratos'), 18, 14, 2028),
    (nextval('seq_contratos'), 19, 14, 2027),
    (nextval('seq_contratos'), 20, 14, 2027),

    -- Sevilla FC (equipo 18) | jugadores 21-24
    (nextval('seq_contratos'), 21, 18, 2026),
    (nextval('seq_contratos'), 22, 18, 2028),
    (nextval('seq_contratos'), 23, 18, 2026),
    (nextval('seq_contratos'), 24, 18, 2027),

    -- Valencia CF (equipo 19) | jugadores 25-28
    (nextval('seq_contratos'), 25, 19, 2027),
    (nextval('seq_contratos'), 26, 19, 2028),
    (nextval('seq_contratos'), 27, 19, 2027),
    (nextval('seq_contratos'), 28, 19, 2027),

    -- Villarreal CF (equipo 20) | jugadores 29-32
    (nextval('seq_contratos'), 29, 20, 2027),
    (nextval('seq_contratos'), 30, 20, 2026),
    (nextval('seq_contratos'), 31, 20, 2027),
    (nextval('seq_contratos'), 32, 20, 2028),

    -- Real Sociedad (equipo 17) | jugadores 33-36
    (nextval('seq_contratos'), 33, 17, 2028),
    (nextval('seq_contratos'), 34, 17, 2027),
    (nextval('seq_contratos'), 35, 17, 2027),
    (nextval('seq_contratos'), 36, 17, 2027),

    -- CA Osasuna (equipo 3) | jugadores 37-40
    (nextval('seq_contratos'), 37, 3,  2026),
    (nextval('seq_contratos'), 38, 3,  2028),
    (nextval('seq_contratos'), 39, 3,  2027),
    (nextval('seq_contratos'), 40, 3,  2027),

    -- RC Celta (equipo 4) | jugadores 41-44
    (nextval('seq_contratos'), 41, 4,  2026),
    (nextval('seq_contratos'), 42, 4,  2028),
    (nextval('seq_contratos'), 43, 4,  2026),
    (nextval('seq_contratos'), 44, 4,  2027),

    -- Getafe CF (equipo 8) | jugadores 45-48
    (nextval('seq_contratos'), 45, 8,  2027),
    (nextval('seq_contratos'), 46, 8,  2027),
    (nextval('seq_contratos'), 47, 8,  2026),
    (nextval('seq_contratos'), 48, 8,  2026),

    -- Girona FC (equipo 9) | jugadores 49-52
    (nextval('seq_contratos'), 49, 9,  2026),
    (nextval('seq_contratos'), 50, 9,  2026),
    (nextval('seq_contratos'), 51, 9,  2028),
    (nextval('seq_contratos'), 52, 9,  2027),

    -- RCD Mallorca (equipo 13) | jugadores 53-56
    (nextval('seq_contratos'), 53, 13, 2027),
    (nextval('seq_contratos'), 54, 13, 2027),
    (nextval('seq_contratos'), 55, 13, 2026),
    (nextval('seq_contratos'), 56, 13, 2026),

    -- Rayo Vallecano (equipo 11) | jugadores 57-60
    (nextval('seq_contratos'), 57, 11, 2026),
    (nextval('seq_contratos'), 58, 11, 2027),
    (nextval('seq_contratos'), 59, 11, 2028),
    (nextval('seq_contratos'), 60, 11, 2027),

    -- Deportivo Alavés (equipo 5) | jugadores 61-64
    (nextval('seq_contratos'), 61, 5,  2027),
    (nextval('seq_contratos'), 62, 5,  2027),
    (nextval('seq_contratos'), 63, 5,  2026),
    (nextval('seq_contratos'), 64, 5,  2026),

    -- RCD Espanyol (equipo 12) | jugadores 65-68
    (nextval('seq_contratos'), 65, 12, 2027),
    (nextval('seq_contratos'), 66, 12, 2026),
    (nextval('seq_contratos'), 67, 12, 2026),
    (nextval('seq_contratos'), 68, 12, 2027),

    -- Elche CF (equipo 6) | jugadores 69-72
    (nextval('seq_contratos'), 69, 6,  2027),
    (nextval('seq_contratos'), 70, 6,  2026),
    (nextval('seq_contratos'), 71, 6,  2027),
    (nextval('seq_contratos'), 72, 6,  2026),

    -- Levante UD (equipo 10) | jugadores 73-76
    (nextval('seq_contratos'), 73, 10, 2028),
    (nextval('seq_contratos'), 74, 10, 2027),
    (nextval('seq_contratos'), 75, 10, 2026),
    (nextval('seq_contratos'), 76, 10, 2027),

    -- Real Oviedo (equipo 16) | jugadores 77-80
    (nextval('seq_contratos'), 77, 16, 2026),
    (nextval('seq_contratos'), 78, 16, 2027),
    (nextval('seq_contratos'), 79, 16, 2027),
    (nextval('seq_contratos'), 80, 16, 2026);

COMMIT;
