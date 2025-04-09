CREATE TABLE guests (
    id_guest int IDENTITY(1,1) NOT NULL,
    user_id int  NOT NULL,
    name varchar(60)  NOT NULL,
    surname varchar(60)  NOT NULL,
    identity_document varchar(20)  NOT NULL,
    document_type char(3)  NOT NULL,
    cellphone char(9)  NULL,
    email varchar(50)  NOT NULL,
    CONSTRAINT huesped_pk PRIMARY KEY  (id_guest)
);

CREATE TABLE userWeb (
    id_user int IDENTITY(1,1) NOT NULL,
    username varchar(50)  NOT NULL,
    password varchar(25)  NOT NULL,
    email varchar(60)  NOT NULL,
    role char(1)  NOT NULL,
    status char(1)  NOT NULL,
    CONSTRAINT user_pk PRIMARY KEY  (id_user)
);

