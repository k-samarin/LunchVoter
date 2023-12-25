INSERT INTO USERS (name, email, password)
VALUES ('User1', 'user1@yandex.ru', '{noop}password'),
       ('User2', 'user2@yandex.ru', '{noop}password'),
       ('Admin', 'admin@gmail.com', '{noop}admin'),
       ('Guest', 'guest@gmail.com', '{noop}guest');

INSERT INTO USER_ROLE (role, user_id)
VALUES ('USER', 1),
       ('ADMIN', 2),
       ('USER', 2);

INSERT INTO RESTAURANT (name, address)
VALUES ('Cuckfield Pantry', 'Oddyness High Street, Haywards Heath RH17 5JU'),
       ('Co-op Food - Cuckfield - Whitemans Green', 'Haywards Heath RH17 5BY'),
       ('Goodevening Thai Restaurant', 'South Street, Cuckfield RH17 5LB'),
       ('Spice Village',''),
       ('The Talbot', 'High Street, RH17');

INSERT INTO MENU (restaurant_id, for_date, description, price)
VALUES (1, '2023-12-01', 'Chicken Tikka', 9.95),
       (1, '2023-12-01', 'Tandoori Mix Grill (Pieces of Chicken Tikka, Lamb Tikka, Tandoori Chicken and Sheek Kebab)', 13.95),
       (2, '2023-12-01', 'Spanish-style chicken hotpot', 8.95),
       (2, '2023-12-01', 'Easy Tikka Masala', 7.95),
       (1, '2023-12-01', 'Chicken Tikka', 9.95),
       (1, '2023-12-01', 'Tandoori Mix Grill (Pieces of Chicken Tikka, Lamb Tikka, Tandoori Chicken and Sheek Kebab)', 13.95),
       (2, '2023-12-02', 'Easy Tikka Masala', 7.95),
       (2, '2023-12-02', 'Chicken, chorizo & cider sizzle', 11.95),
       (3, '2023-12-02', 'Steamed Sea Bass with Ginger and Soya Sauce',16.95),
       (3, '2023-12-02', 'Deep Fried Red Snapper Mixed Herbs',12.95),
       (4, '2023-12-02', 'Tiger Prawns in Red Paenaeng Curry',13.95),
       (5, '2023-12-02', 'Char grilled Giant Size Tiger Prawns',13.95),
       (1, '2023-12-03', 'Chicken Tikka', 9.95),
       (3, '2023-12-03', 'Deep Fried Red Snapper in Sweet Chilli Sauce',12.95),
       (4, '2023-12-03', 'Deep Fri. Red Snapper with Ginger and Spring Onions',12.95),
       (5, '2023-12-03', 'Tiger Prawns With Curry Powder Sauce',13.95),
       (5, '2023-12-03', 'Roasted Chicken Breast In Red Paenaeng Curry',10.95),
       (2, '2023-12-03', 'Duck Paradise',11.95),
       (2, '2023-12-03', 'Fried Tofu in Spicy Chilli Sauce',8.95);

INSERT INTO VOTE (restaurant_id, user_id, date_time)
VALUES (1, 1, '2023-12-01 12:10:15'),
       (1, 2, '2023-12-01 13:10:00'),
       (2, 3, '2023-12-01 08:10:00'),
       (2, 1, '2023-12-02 12:10:15'),
       (3, 2, '2023-12-01 13:10:00'),
       (4, 3, '2023-12-01 08:10:00'),
       (5, 1, '2023-12-02 12:10:15'),
       (5, 2, '2023-12-01 13:10:00');