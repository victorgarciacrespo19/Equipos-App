INSERT INTO jugadores (id, nombre, nacionalidad, foto, valor_mercado)
VALUES
    -- Real Madrid
    (nextval('seq_jugadores'), 'Kylian Mbappé', 'Francia', 'https://ui-avatars.com/api/?name=Kylian+Mbappe&size=256', '200M €'),
    (nextval('seq_jugadores'), 'Vinícius Júnior', 'Brasil', 'https://ui-avatars.com/api/?name=Vinicius+Junior&size=256', '150M €'),
    (nextval('seq_jugadores'), 'Jude Bellingham', 'Inglaterra', 'https://ui-avatars.com/api/?name=Jude+Bellingham&size=256', '160M €'),
    (nextval('seq_jugadores'), 'Federico Valverde', 'Uruguay', 'https://ui-avatars.com/api/?name=Federico+Valverde&size=256', '120M €'),

    -- FC Barcelona
    (nextval('seq_jugadores'), 'Lamine Yamal', 'España', 'https://ui-avatars.com/api/?name=Lamine+Yamal&size=256', '150M €'),
    (nextval('seq_jugadores'), 'Pedri', 'España', 'https://ui-avatars.com/api/?name=Pedri&size=256', '120M €'),
    (nextval('seq_jugadores'), 'Robert Lewandowski', 'Polonia', 'https://ui-avatars.com/api/?name=Robert+Lewandowski&size=256', '15M €'),
    (nextval('seq_jugadores'), 'Marcus Rashford', 'Inglaterra', 'https://ui-avatars.com/api/?name=Marcus+Rashford&size=256', '45M €'),

    -- Atlético de Madrid
    (nextval('seq_jugadores'), 'Antoine Griezmann', 'Francia', 'https://ui-avatars.com/api/?name=Antoine+Griezmann&size=256', '20M €'),
    (nextval('seq_jugadores'), 'Julián Álvarez', 'Argentina', 'https://ui-avatars.com/api/?name=Julian+Alvarez&size=256', '100M €'),
    (nextval('seq_jugadores'), 'Pablo Barrios', 'España', 'https://ui-avatars.com/api/?name=Pablo+Barrios&size=256', '70M €'),
    (nextval('seq_jugadores'), 'Álex Baena', 'España', 'https://ui-avatars.com/api/?name=Alex+Baena&size=256', '50M €'),

    -- Athletic Club
    (nextval('seq_jugadores'), 'Nico Williams', 'España', 'https://ui-avatars.com/api/?name=Nico+Williams&size=256', '70M €'),
    (nextval('seq_jugadores'), 'Iñaki Williams', 'Ghana', 'https://ui-avatars.com/api/?name=Inaki+Williams&size=256', '20M €'),
    (nextval('seq_jugadores'), 'Oihan Sancet', 'España', 'https://ui-avatars.com/api/?name=Oihan+Sancet&size=256', '60M €'),
    (nextval('seq_jugadores'), 'Dani Vivian', 'España', 'https://ui-avatars.com/api/?name=Dani+Vivian&size=256', '35M €'),

    -- Real Betis
    (nextval('seq_jugadores'), 'Isco', 'España', 'https://ui-avatars.com/api/?name=Isco&size=256', '10M €'),
    (nextval('seq_jugadores'), 'Antony', 'Brasil', 'https://ui-avatars.com/api/?name=Antony&size=256', '35M €'),
    (nextval('seq_jugadores'), 'Giovani Lo Celso', 'Argentina', 'https://ui-avatars.com/api/?name=Giovani+Lo+Celso&size=256', '12M €'),
    (nextval('seq_jugadores'), 'Cucho Hernández', 'Colombia', 'https://ui-avatars.com/api/?name=Cucho+Hernandez&size=256', '25M €'),

    -- Sevilla FC
    (nextval('seq_jugadores'), 'Alexis Sánchez', 'Chile', 'https://ui-avatars.com/api/?name=Alexis+Sanchez&size=256', '4M €'),
    (nextval('seq_jugadores'), 'Isaac Romero', 'España', 'https://ui-avatars.com/api/?name=Isaac+Romero&size=256', '30M €'),
    (nextval('seq_jugadores'), 'César Azpilicueta', 'España', 'https://ui-avatars.com/api/?name=Cesar+Azpilicueta&size=256', '3M €'),
    (nextval('seq_jugadores'), 'Nemanja Gudelj', 'Serbia', 'https://ui-avatars.com/api/?name=Nemanja+Gudelj&size=256', '6M €'),

    -- Valencia CF
    (nextval('seq_jugadores'), 'José Gayà', 'España', 'https://ui-avatars.com/api/?name=Jose+Gaya&size=256', '12M €'),
    (nextval('seq_jugadores'), 'Javi Guerra', 'España', 'https://ui-avatars.com/api/?name=Javi+Guerra&size=256', '30M €'),
    (nextval('seq_jugadores'), 'Hugo Duro', 'España', 'https://ui-avatars.com/api/?name=Hugo+Duro&size=256', '15M €'),
    (nextval('seq_jugadores'), 'Diego López', 'España', 'https://ui-avatars.com/api/?name=Diego+Lopez+Valencia&size=256', '12M €'),

    -- Villarreal CF
    (nextval('seq_jugadores'), 'Gerard Moreno', 'España', 'https://ui-avatars.com/api/?name=Gerard+Moreno&size=256', '15M €'),
    (nextval('seq_jugadores'), 'Dani Parejo', 'España', 'https://ui-avatars.com/api/?name=Dani+Parejo&size=256', '3M €'),
    (nextval('seq_jugadores'), 'Thomas Partey', 'Ghana', 'https://ui-avatars.com/api/?name=Thomas+Partey&size=256', '12M €'),
    (nextval('seq_jugadores'), 'Alberto Moleiro', 'España', 'https://ui-avatars.com/api/?name=Alberto+Moleiro&size=256', '25M €'),

    -- Real Sociedad
    (nextval('seq_jugadores'), 'Takefusa Kubo', 'Japón', 'https://ui-avatars.com/api/?name=Takefusa+Kubo&size=256', '50M €'),
    (nextval('seq_jugadores'), 'Mikel Oyarzabal', 'España', 'https://ui-avatars.com/api/?name=Mikel+Oyarzabal&size=256', '18M €'),
    (nextval('seq_jugadores'), 'Brais Méndez', 'España', 'https://ui-avatars.com/api/?name=Brais+Mendez&size=256', '20M €'),
    (nextval('seq_jugadores'), 'Ander Barrenetxea', 'España', 'https://ui-avatars.com/api/?name=Ander+Barrenetxea&size=256', '25M €'),

    -- CA Osasuna
    (nextval('seq_jugadores'), 'Ante Budimir', 'Croacia', 'https://ui-avatars.com/api/?name=Ante+Budimir&size=256', '5M €'),
    (nextval('seq_jugadores'), 'Aimar Oroz', 'España', 'https://ui-avatars.com/api/?name=Aimar+Oroz&size=256', '25M €'),
    (nextval('seq_jugadores'), 'Jon Moncayola', 'España', 'https://ui-avatars.com/api/?name=Jon+Moncayola&size=256', '10M €'),
    (nextval('seq_jugadores'), 'Enzo Boyomo', 'Camerún', 'https://ui-avatars.com/api/?name=Enzo+Boyomo&size=256', '20M €'),

    -- Celta de Vigo
    (nextval('seq_jugadores'), 'Iago Aspas', 'España', 'https://ui-avatars.com/api/?name=Iago+Aspas&size=256', '2.5M €'),
    (nextval('seq_jugadores'), 'Óscar Mingueza', 'España', 'https://ui-avatars.com/api/?name=Oscar+Mingueza&size=256', '20M €'),
    (nextval('seq_jugadores'), 'Marcos Alonso', 'España', 'https://ui-avatars.com/api/?name=Marcos+Alonso&size=256', '1M €'),
    (nextval('seq_jugadores'), 'Bryan Zaragoza', 'España', 'https://ui-avatars.com/api/?name=Bryan+Zaragoza&size=256', '15M €'),

    -- Getafe CF
    (nextval('seq_jugadores'), 'Borja Mayoral', 'España', 'https://ui-avatars.com/api/?name=Borja+Mayoral&size=256', '8M €'),
    (nextval('seq_jugadores'), 'Luis Milla', 'España', 'https://ui-avatars.com/api/?name=Luis+Milla&size=256', '10M €'),
    (nextval('seq_jugadores'), 'Mauro Arambarri', 'Uruguay', 'https://ui-avatars.com/api/?name=Mauro+Arambarri&size=256', '6M €'),
    (nextval('seq_jugadores'), 'Diego Rico', 'España', 'https://ui-avatars.com/api/?name=Diego+Rico&size=256', '2M €'),

    -- Girona FC
    (nextval('seq_jugadores'), 'Daley Blind', 'Países Bajos', 'https://ui-avatars.com/api/?name=Daley+Blind&size=256', '1M €'),
    (nextval('seq_jugadores'), 'Axel Witsel', 'Bélgica', 'https://ui-avatars.com/api/?name=Axel+Witsel&size=256', '1.5M €'),
    (nextval('seq_jugadores'), 'Azzedine Ounahi', 'Marruecos', 'https://ui-avatars.com/api/?name=Azzedine+Ounahi&size=256', '20M €'),
    (nextval('seq_jugadores'), 'Arnau Martínez', 'España', 'https://ui-avatars.com/api/?name=Arnau+Martinez&size=256', '20M €'),

    -- RCD Mallorca
    (nextval('seq_jugadores'), 'Vedat Muriqi', 'Kosovo', 'https://ui-avatars.com/api/?name=Vedat+Muriqi&size=256', '10M €'),
    (nextval('seq_jugadores'), 'Sergi Darder', 'España', 'https://ui-avatars.com/api/?name=Sergi+Darder&size=256', '12M €'),
    (nextval('seq_jugadores'), 'Pablo Maffeo', 'Argentina', 'https://ui-avatars.com/api/?name=Pablo+Maffeo&size=256', '8M €'),
    (nextval('seq_jugadores'), 'Antonio Raíllo', 'España', 'https://ui-avatars.com/api/?name=Antonio+Raillo&size=256', '6M €'),

    -- Rayo Vallecano
    (nextval('seq_jugadores'), 'Isi Palazón', 'España', 'https://ui-avatars.com/api/?name=Isi+Palazon&size=256', '3M €'),
    (nextval('seq_jugadores'), 'Jorge de Frutos', 'España', 'https://ui-avatars.com/api/?name=Jorge+de+Frutos&size=256', '12M €'),
    (nextval('seq_jugadores'), 'Andrei Rațiu', 'Rumanía', 'https://ui-avatars.com/api/?name=Andrei+Ratiu&size=256', '18M €'),
    (nextval('seq_jugadores'), 'Pep Chavarría', 'España', 'https://ui-avatars.com/api/?name=Pep+Chavarria&size=256', '10M €'),

    -- Deportivo Alavés
    (nextval('seq_jugadores'), 'Lucas Boyé', 'Argentina', 'https://ui-avatars.com/api/?name=Lucas+Boye&size=256', '5M €'),
    (nextval('seq_jugadores'), 'Antonio Blanco', 'España', 'https://ui-avatars.com/api/?name=Antonio+Blanco&size=256', '10M €'),
    (nextval('seq_jugadores'), 'Carlos Vicente', 'España', 'https://ui-avatars.com/api/?name=Carlos+Vicente&size=256', '7M €'),
    (nextval('seq_jugadores'), 'Jonny Otto', 'España', 'https://ui-avatars.com/api/?name=Jonny+Otto&size=256', '2.5M €'),

    -- RCD Espanyol
    (nextval('seq_jugadores'), 'Javi Puado', 'España', 'https://ui-avatars.com/api/?name=Javi+Puado&size=256', '10M €'),
    (nextval('seq_jugadores'), 'Pol Lozano', 'España', 'https://ui-avatars.com/api/?name=Pol+Lozano&size=256', '6M €'),
    (nextval('seq_jugadores'), 'Edu Expósito', 'España', 'https://ui-avatars.com/api/?name=Edu+Exposito&size=256', '4M €'),
    (nextval('seq_jugadores'), 'Tyrhys Dolan', 'Inglaterra', 'https://ui-avatars.com/api/?name=Tyrhys+Dolan&size=256', '10M €'),

    -- Elche CF
    (nextval('seq_jugadores'), 'Héctor Fort', 'España', 'https://ui-avatars.com/api/?name=Hector+Fort&size=256', '12M €'),
    (nextval('seq_jugadores'), 'Federico Redondo', 'Argentina', 'https://ui-avatars.com/api/?name=Federico+Redondo&size=256', '4M €'),
    (nextval('seq_jugadores'), 'Aleix Febas', 'España', 'https://ui-avatars.com/api/?name=Aleix+Febas&size=256', '4M €'),
    (nextval('seq_jugadores'), 'Álvaro Rodríguez', 'Uruguay', 'https://ui-avatars.com/api/?name=Alvaro+Rodriguez&size=256', '8M €'),

    -- Levante UD
    (nextval('seq_jugadores'), 'Carlos Álvarez', 'España', 'https://ui-avatars.com/api/?name=Carlos+Alvarez&size=256', '15M €'),
    (nextval('seq_jugadores'), 'Roger Brugué', 'España', 'https://ui-avatars.com/api/?name=Roger+Brugue&size=256', '2M €'),
    (nextval('seq_jugadores'), 'Oriol Rey', 'España', 'https://ui-avatars.com/api/?name=Oriol+Rey&size=256', '2M €'),
    (nextval('seq_jugadores'), 'Jeremy Toljan', 'Alemania', 'https://ui-avatars.com/api/?name=Jeremy+Toljan&size=256', '2.2M €'),

    -- Real Oviedo
    (nextval('seq_jugadores'), 'Santi Cazorla', 'España', 'https://ui-avatars.com/api/?name=Santi+Cazorla&size=256', '0.2M €'),
    (nextval('seq_jugadores'), 'Leander Dendoncker', 'Bélgica', 'https://ui-avatars.com/api/?name=Leander+Dendoncker&size=256', '4M €'),
    (nextval('seq_jugadores'), 'Santiago Colombatto', 'Argentina', 'https://ui-avatars.com/api/?name=Santiago+Colombatto&size=256', '3M €'),
    (nextval('seq_jugadores'), 'Alberto Reina', 'España', 'https://ui-avatars.com/api/?name=Alberto+Reina&size=256', '1.5M €');
