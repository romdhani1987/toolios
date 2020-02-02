CREATE SEQUENCE public.user_id_seq;
CREATE TABLE public.user (
                id BIGINT NOT NULL DEFAULT nextval('public.user_id_seq'),
                login VARCHAR(50) NOT NULL,
				fname VARCHAR(50) ,
				lname VARCHAR(50) ,
				email VARCHAR(50) NOT NULL,
				number VARCHAR(50) ,
                password_hash VARCHAR NOT NULL,
                serialized_properties TEXT,
                CONSTRAINT user_pk PRIMARY KEY (id)
);

CREATE SEQUENCE public.private String address_id_seq;
CREATE TABLE public.address (
                id BIGINT NOT NULL DEFAULT nextval('public.address_id_seq'),
                street VARCHAR(250) NOT NULL,
                code VARCHAR(250) NOT NULL,
                city VARCHAR(250) NOT NULL,
                country VARCHAR(250) NOT NULL,
                CONSTRAINT address_pk PRIMARY KEY (id)
);


CREATE SEQUENCE public.private String project_id_seq;
CREATE TABLE public.project (
                id BIGINT NOT NULL DEFAULT nextval('public.project_id_seq'),
                title VARCHAR(250) NOT NULL,
                description VARCHAR(1000),
                creation_timestamp TIMESTAMP NOT NULL,
                lock_expiration_timestamp TIMESTAMP,
                serialized_properties TEXT,
                author_id BIGINT,
				supervisor_id BIGINT,
                CONSTRAINT project_pk PRIMARY KEY (id)
);

CREATE SEQUENCE public.private String action_id_seq;
CREATE TABLE public.action (
                id BIGINT NOT NULL DEFAULT nextval('public.action_id_seq'),
                title VARCHAR(250) NOT NULL,
                description VARCHAR(1000),
                creation_timestamp TIMESTAMP NOT NULL,
                lock_expiration_timestamp TIMESTAMP,
                serialized_properties TEXT,
                author_id BIGINT,
			    CONSTRAINT action_pk PRIMARY KEY (id)
);