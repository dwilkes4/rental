CREATE TABLE image (
    id serial primary key,
    name VARCHAR(20),
    image_size bigint,
    image_data bytea,
    property_id bigint references property(id)
)
