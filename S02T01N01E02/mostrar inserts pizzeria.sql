USE Pizzeria;

SELECT * FROM categoria;

-- INSERT INTO `categoria` VALUES (1, 'pizza');
-- INSERT INTO `categoria` VALUES (2, 'hamburgueses');
-- INSERT INTO `categoria` VALUES (3, 'begudes')

SELECT * FROM productes;

-- INSERT INTO `productes` VALUES (1, 'pepperoni', 'tomate, mozzarella, pepperoni', 'www.link.invent/asdkasf', 12.2, 1);
-- INSERT INTO `productes` VALUES (2, 'bacon', 'burguer, bacon, tomate', 'www.link.invent/asakasf', 9.2, 2);
-- INSERT INTO `productes` VALUES (3, 'coca-cola', '33cl', 'www.link.invent/asdksasf', 2.5, 3)

SELECT * FROM adreça;

-- INSERT INTO `adreça`VALUES (1, 'Carlit, 1', 17054,  'Bolvir', 'Girona', 972345797);
-- INSERT INTO `adreça`VALUES (2, 'Castell, 1', 17054,  'Ger', 'Girona', 972345788);
-- INSERT INTO `adreça`VALUES (3, 'Carles, 1', 17054,  'Bolvir', 'Girona', 972345744);
-- INSERT INTO `adreça`VALUES (4, 'Cal Pere, 1', 17054,  'Fontanals', 'Girona', 972345735);

SELECT * FROM botiga;

-- INSERT INTO `botiga`VALUES (1, 'Botiga Bolvir', 1)

SELECT * FROM empleat;

-- INSERT INTO `empleat`VALUES (1, 'Carlos', 'Lopez Sánchez', 972765432, '47656753M', 'cuina', 1,1);
-- INSERT INTO `empleat`VALUES (2, 'Carla', 'Lopez Sánchez', 972765431, '47656752M', 'repartidor', 1,1);

SELECT * FROM client;

-- INSERT INTO `client`VALUES (1, 'Adria', 'Cervilla' , 2);
-- INSERT INTO `client`VALUES (2, 'Carles', 'Chia' , 3);
-- INSERT INTO `client`VALUES (3, 'Isidre', 'Bonet' , 4);

SELECT * FROM comanda;

-- INSERT INTO `comanda`VALUES (1, now(), now(), 'recollida', 1, 2, 1, 1, 1, 12.2)
-- INSERT INTO `comanda`VALUES (2, now(), now(), 'recollida', 1, 2, 1, 1, 1, 9.2)
-- INSERT INTO `comanda`VALUES (3, now(), now(), 'domicili', 2, 3, 2, 1, 1, 23.9)

SELECT * FROM comanda_has_productes;

-- INSERT INTO `comanda_has_productes`VALUES (1, 1, 1);
-- INSERT INTO `comanda_has_productes`VALUES (2, 2, 1);
-- INSERT INTO `comanda_has_productes`VALUES (3, 1, 1);
-- INSERT INTO `comanda_has_productes`VALUES (3, 2, 1);
-- INSERT INTO `comanda_has_productes`VALUES (3, 3, 1)





 