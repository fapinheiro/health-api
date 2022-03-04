-- users
-- password: 123
insert into users ( user_id, login, password, creation_at, active) values (seq_users.nextval,'admin@gmail.com','$2a$10$wB0XIhjN9IvPh9cNWNHSHeGv67rbLizId7Lz4lcSjzIJoOQgjnC4a',current_timestamp, 1);
