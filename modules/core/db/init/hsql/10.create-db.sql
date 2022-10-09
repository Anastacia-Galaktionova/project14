-- begin PROJECT14_REPORT
create table PROJECT14_REPORT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    REPORT_NAME varchar(255) not null,
    REPORT_TYPE_ID varchar(36),
    --
    primary key (ID)
)^
-- end PROJECT14_REPORT
-- begin PROJECT14_REPORT_TYPE
create table PROJECT14_REPORT_TYPE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    REPORT_TYPE_NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end PROJECT14_REPORT_TYPE
