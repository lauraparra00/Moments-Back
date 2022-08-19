INSERT
INTO
  users
  (user_Name, avatar)
VALUES
  ('Laura', 'avatar');

INSERT
INTO
  climber
  (title, description, url, photographer_id)
VALUES
  ('Llac Puigcerda', 'pepito', 'https://img4.viajar.elperiodico.com/9c/c4/cf/puigcerda-cataluna-1201x846.jpg
', 1);

INSERT
INTO
  climber
  (title, description, url, photographer_id)
VALUES
  ('Monte Urgull', 'Donosti', 'https://media.izi.travel/efafe600-15e9-4327-b3f2-9294beff9c57/1fd066e9-5093-49d6-b19f-7558ab671cc6_800x600.jpg', 1);
INSERT
INTO
  climber
  (title, description, url, photographer_id)
VALUES
  ('Montserrat', 'El Bages', 'https://www.barcelona-tourist-guide.com/images/ext/attractions/montserrat/L550/montserrat-barcelona-29.jpg', 1);
INSERT
INTO
  climber
  (title, description, url, photographer_id)
VALUES
  ('Vilada', 'El Berguedà', 'https://www.rutespirineus.cat/images/ruta-pels-entorns-de-vilada-bergueda/1280x960/ruta-pels-entorns-de-vilada-bergueda-04.jpg', 1);
INSERT
INTO
  climber
  (title, description, url, photographer_id)
VALUES
  ('Siurana', 'Serra de Prades', 'http://caminsdellegenda.cat/wp-content/uploads/2018/01/siurana_3-1080x675.jpg', 1);



INSERT
INTO
  comments
  (comment, climber_id, photographer_id)
VALUES
  ('Montanya per fer escalada', 3, 1);


INSERT
INTO
  comments
  (comment, climber_id, photographer_id)
VALUES
  ('Montanya al pais Basc', 2, 1);