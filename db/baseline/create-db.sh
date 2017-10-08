#! /bin/sh
export PGPASSWORD="$2";

psql -d postgres -U $1 -c "CREATE DATABASE $3 WITH ENCODING 'UTF8'";
psql -U $1 -c "CREATE ROLE $4 WITH LOGIN PASSWORD '$5'";
psql -U $1 -c "GRANT ALL PRIVILEGES ON DATABASE $3 TO $4";
psql -d $3 -U $1 -c "GRANT SELECT, INSERT, UPDATE, DELETE ON ALL TABLES IN SCHEMA public TO $4";
psql -d $3 -U $1 -c "alter default privileges in schema public grant all on tables to $4";
psql -d $3 -U $1 -c "alter default privileges in schema public grant all on sequences to $4";


