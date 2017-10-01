#! /bin/sh
export PGPASSWORD="$2";

psql -d postgres -U $1 -c "DROP DATABASE IF EXISTS $3";
psql -U $1 -c "DROP ROLE IF EXISTS $4";