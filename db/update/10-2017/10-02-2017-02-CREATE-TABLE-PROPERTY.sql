CREATE TABLE property (
    id serial primary key,
    name VARCHAR(20),
    owner int references owner(id)
)