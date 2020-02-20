

CREATE SEQUENCE public.company_id_seq;
CREATE TABLE public.company(
                id BIGINT NOT NULL DEFAULT nextval('public.company_id_seq'),
                company_name VARCHAR(250) NOT NULL,
				company_serial BIGINT ,
				SIREN BIGINT ,
				SIRET BIGINT NOT NULL,
				address_id BIGINT,
				serialized_properties TEXT,
                CONSTRAINT company_pk PRIMARY KEY (id)
);

CREATE SEQUENCE public.address_id_seq;
CREATE TABLE public.address (
                id BIGINT NOT NULL DEFAULT nextval('public.address_id_seq'),
                street VARCHAR(250) ,
                code VARCHAR(250) ,
                city VARCHAR(250) ,
                country VARCHAR(250) ,
                CONSTRAINT address_pk PRIMARY KEY (id)
);

CREATE SEQUENCE public.group_id_seq;
CREATE TABLE public.user_group (
                id BIGINT NOT NULL DEFAULT nextval('public.group_id_seq'),
                user_group_name VARCHAR(250) ,
				group_activity_id BIGINT ,
                company_id BIGINT NOT NULL,
                serialized_properties TEXT,
                CONSTRAINT group_pk PRIMARY KEY (id)
);

CREATE SEQUENCE public.group_activity_id_seq;
CREATE TABLE public.group_activity (
                id BIGINT NOT NULL DEFAULT nextval('public.group_activity_id_seq'),
                group_activity_name VARCHAR(250) ,
                serialized_properties TEXT,
                CONSTRAINT group_activity_pk PRIMARY KEY (id)
);

CREATE SEQUENCE public.user_account_id_seq;
CREATE TABLE public.user_account (
                id BIGINT NOT NULL DEFAULT nextval('public.user_account_id_seq'),
                login VARCHAR(50) NOT NULL,
				f_name VARCHAR(50),
				l_name VARCHAR(50),
				email VARCHAR(50) ,
				phone_number VARCHAR(50),
                password_hash VARCHAR(50),
				creation_mode VARCHAR(50),
                serialized_properties TEXT,
				address_id BIGINT ,
				user_function_id BIGINT ,
				group_id BIGINT,
				CONSTRAINT user_account_pk PRIMARY KEY (id)
);

CREATE SEQUENCE public.user_function_id_seq;
CREATE TABLE public.user_function (
                id BIGINT NOT NULL DEFAULT nextval('public.address_id_seq'),
                function_name VARCHAR(250) NOT NULL,
                CONSTRAINT user_function_pk PRIMARY KEY (id)
);

CREATE SEQUENCE public.project_id_seq;
CREATE TABLE public.project (
                id BIGINT NOT NULL DEFAULT nextval('public.project_id_seq'),
                title VARCHAR(250) NOT NULL,
                description VARCHAR(1000),
                creation_timestamp TIMESTAMP NOT NULL,
                lock_expiration_timestamp TIMESTAMP,
				serialized_properties TEXT,
                CONSTRAINT project_pk PRIMARY KEY (id)
);


CREATE TABLE public.project_user_account_map (
                project_id BIGINT NOT NULL,
                user_account_id BIGINT NOT NULL,
                CONSTRAINT project_user_account_map_pk PRIMARY KEY (project_id, user_account_id)
);

ALTER TABLE public.user_group ADD CONSTRAINT group_activity_fk
FOREIGN KEY (group_activity_id)
REFERENCES public.group_activity (id)
ON DELETE CASCADE
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.user_group ADD CONSTRAINT company_fk
FOREIGN KEY (company_id)
REFERENCES public.company (id)
ON DELETE CASCADE
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.company ADD CONSTRAINT address_fk
FOREIGN KEY (address_id)
REFERENCES public.address (id)
ON DELETE CASCADE
ON UPDATE NO ACTION
NOT DEFERRABLE;


ALTER TABLE public.user_account ADD CONSTRAINT address_fk
FOREIGN KEY (address_id)
REFERENCES public.address (id)
ON DELETE CASCADE
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.user_account ADD CONSTRAINT user_function_fk
FOREIGN KEY (user_function_id)
REFERENCES public.user_function (id)
ON DELETE CASCADE
ON UPDATE NO ACTION
NOT DEFERRABLE;


ALTER TABLE public.user_account ADD CONSTRAINT group_fk
FOREIGN KEY (group_id)
REFERENCES public.user_group (id)
ON DELETE CASCADE
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.project_user_account_map ADD CONSTRAINT project_project_user_map_fk
FOREIGN KEY (project_id)
REFERENCES public.project (id)
ON DELETE CASCADE
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.project_user_account_map ADD CONSTRAINT user_account_project_user_map_fk
FOREIGN KEY (user_account_id)
REFERENCES public.user_account (id)
ON DELETE CASCADE
ON UPDATE NO ACTION
NOT DEFERRABLE;