INSERT IGNORE INTO vets VALUES (1, 'Alex', 'Yevchenko');
INSERT IGNORE INTO vets VALUES (2, 'Helen', 'Boyko');
INSERT IGNORE INTO vets VALUES (3, 'Victoria', 'Boyko');
INSERT IGNORE INTO vets VALUES (4, 'Roman', 'Kondrash');
INSERT IGNORE INTO vets VALUES (5, 'Andrew', 'Fok');
INSERT IGNORE INTO vets VALUES (6, 'Alexander', 'Ohorodniy');

INSERT IGNORE INTO specialties VALUES (1, 'radiology');
INSERT IGNORE INTO specialties VALUES (2, 'surgery');
INSERT IGNORE INTO specialties VALUES (3, 'dentistry');

INSERT IGNORE INTO vet_specialties VALUES (2, 1);
INSERT IGNORE INTO vet_specialties VALUES (3, 3);
INSERT IGNORE INTO vet_specialties VALUES (4, 2);
INSERT IGNORE INTO vet_specialties VALUES (5, 1);

INSERT IGNORE INTO types VALUES (1, 'cat');
INSERT IGNORE INTO types VALUES (2, 'dog');
INSERT IGNORE INTO types VALUES (3, 'snake');
INSERT IGNORE INTO types VALUES (4, 'bird');
INSERT IGNORE INTO types VALUES (5, 'hamster');

INSERT IGNORE INTO owners VALUES (1, 'Pavel', 'Savenko', '18 Grinchenko St.', 'Kyiv', '0506879452');
INSERT IGNORE INTO owners VALUES (2, 'Eliz', 'Abysova', '248 Hrushevskogo St.', 'Kyiv', '0675289478');


INSERT IGNORE INTO pets VALUES (1, 'Leo', '2015-09-07', 1, 1);
INSERT IGNORE INTO pets VALUES (2, 'Basil', '2012-08-06', 3, 2);
