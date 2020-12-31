create table soups
(
    id          int generated always as identity,
    name        varchar(50),
    description varchar(50),
    primary key (id)
);