-- begin PPP_FIRST
create table PPP_FIRST (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    CAT_ID varchar(36),
    --
    primary key (ID)
)^
-- end PPP_FIRST
-- begin PPP_TWO
create table PPP_TWO (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CATEGORY varchar(255),
    --
    primary key (ID)
)^
-- end PPP_TWO
