-- TABLES
create table if not exists users ( 
   user_id int primary key,
   login varchar(100) not null, 
   password varchar(100) not null,
   creation_at timestamp not null,
   updated_at timestamp null,
   active char(1) not null
);

-- SEQUENCES
create sequence if not exists seq_users start with 1 increment by 50 maxvalue 99999999;

-- CONSTRAINTS
alter table users add constraint users_login_unique unique(login);

-- Function
-- https://medium.com/@callkalpa/user-defined-functions-and-stored-procedures-with-h2-database-a1cbfa510559
-- https://stackoverflow.com/questions/57470794/h2-database-how-to-access-function-created-in-another-alias
DROP ALIAS IF EXISTS SLEEP;
CREATE ALIAS SLEEP FOR "cib.isban.pt.healthapi.dataprovider.h2.CustomFunctions.sleep";