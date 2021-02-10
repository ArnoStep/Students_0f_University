-- begin UNIVERSITY_STUDENT
create table UNIVERSITY_STUDENT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FIRST_NAME varchar(255) not null,
    LAST_NAME varchar(255) not null,
    PATRONYMIC varchar(255),
    GROUP_ID varchar(36) not null,
    DATE_OF_BIRTH date not null,
    --
    primary key (ID)
)^
-- end UNIVERSITY_STUDENT
-- begin UNIVERSITY_GROUP
create table UNIVERSITY_GROUP (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NUMBER_ varchar(255) not null,
    FACULTY varchar(255) not null,
    --
    primary key (ID)
)^
-- end UNIVERSITY_GROUP
