INSERT INTO Menu_items(name, description, category, price, stock_number)
VALUES ('Hamdog',
        'If a hot dog and a burger had a child. A very ugly child.',
        'Appetizers', 4.99, 25);

INSERT INTO Menu_items(name, description, category, price, stock_number)
VALUES ('Dry Chicken Noodle Soup',
        'You get some powder, a glass of water and a pinch of salt. You do the rest',
        'Main Dishes', 6.99, 20);

INSERT INTO Menu_items(name, description, category, price, stock_number)
VALUES ('Existentialism Sandwich',
        'A plate of nothing, or perhaps... everything? You can forge your own reality',
        'Appetizers', 5.99, 10);

INSERT INTO Menu_items(name, description, category, price, stock_number)
VALUES ('The Optimist',
        'A half full glass of spring water.',
        'Drinks', 0.5, 100);

INSERT INTO Menu_items(name, description, category, price, stock_number)
VALUES ('The Pessimist',
        'A half empty glass of spring water, you debbie downer.',
        'Drinks', 0.5, 100);

INSERT INTO Menu_items(name, description, category, price, stock_number)
VALUES ('π-zza',
        'A delicious theorem prover kit, complete with the toppings of your choice',
        'Main Dishes', 9.99, 25);

INSERT INTO Menu_items(name, description, category, price, stock_number)
VALUES ('D-I-Why?',
        'You get a chance to join the chef and make anything you want, however you want it',
        'Main Dishes', 21.99, 25);

INSERT INTO Menu_items(name, description, category, price, stock_number)
VALUES ('Caligula''s Salad',
        'Named after the lesser known, but equally important Roman emperor.',
        'Salads', 4.99, 25);

INSERT INTO Menu_items(name, description, category, price, stock_number)
VALUES ('Boorgir',
        'Dont you dare say it...',
        'Main Dishes', 5.50, 100);

INSERT INTO Tables(capacity, is_available)
VALUES (4, True);

INSERT INTO Tables(capacity, is_available)
VALUES (5, True);

INSERT INTO Tables(capacity, is_available)
VALUES (5, True);

INSERT INTO Tables(capacity, is_available)
VALUES (6, True);

INSERT INTO Tables(capacity, is_available)
VALUES (8, True);

INSERT INTO Tables(capacity, is_available)
VALUES (2, True);

INSERT INTO Tables(capacity, is_available)
VALUES (4, True);

INSERT INTO Tables(capacity, is_available)
VALUES (4, True);

INSERT INTO Tables(capacity, is_available)
VALUES (4, True);

INSERT INTO Tables(capacity, is_available)
VALUES (6, True);


call create_booking(2,
                    '2021-12-9',
                    16,
                    'John F. Kennedy',
                    5);

call create_booking(5,
                    '2021-12-11',
                    9,
                    'Abraham Lincoln',
                    7);

call create_booking(3,
                    '2021-12-12',
                    15,
                    'James Garfield',
                    5);

call create_booking(1,
                    '2021-12-9',
                    16,
                    'William McKinley',
                    3);

call create_booking(1,
                    '2021-12-10',
                    16,
                    'William McKinley',
                    3);

