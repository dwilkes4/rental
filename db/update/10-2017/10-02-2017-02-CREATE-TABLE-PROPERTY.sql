CREATE TABLE property (
    id serial primary key,
    name VARCHAR(20),
    owner_id bigint references owner(id)
)
