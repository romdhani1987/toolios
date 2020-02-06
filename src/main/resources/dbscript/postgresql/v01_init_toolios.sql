CREATE SEQUENCE public.user_id_seq;
CREATE TABLE public.user_account (
                id BIGINT NOT NULL DEFAULT nextval('public.user_id_seq'),
                login VARCHAR(50) NOT NULL,
				f_name VARCHAR(50),
				l_name VARCHAR(50),
				email VARCHAR(50) NOT NULL,
				phone_number VARCHAR(50),
                password_hash VARCHAR(50) NOT NULL,
				creation_mode VARCHAR(50),
                serialized_properties TEXT,
				address_id BIGINT NOT NULL,
				user_function_id BIGINT NOT NULL,
				user_responsibility_id BIGINT NOT NULL,
				group_id BIGINT NOT NULL,
				serialized_properties TEXT,
                CONSTRAINT user_pk PRIMARY KEY (id)
);


CREATE SEQUENCE public.private String address_id_seq;
CREATE TABLE public.address (
                id BIGINT NOT NULL DEFAULT nextval('public.address_id_seq'),
                street VARCHAR(250) ,
                code VARCHAR(250) ,
                city VARCHAR(250) ,
                country VARCHAR(250) ,
                CONSTRAINT address_pk PRIMARY KEY (id)
);

CREATE SEQUENCE public.private String user_function_id_seq;
CREATE TABLE public.user_function (
                id BIGINT NOT NULL DEFAULT nextval('public.address_id_seq'),
                name VARCHAR(250) NOT NULL,
                CONSTRAINT user_function_pk PRIMARY KEY (id)
);

CREATE SEQUENCE public.private String group_id_seq;
CREATE TABLE public.user_group (
                id BIGINT NOT NULL DEFAULT nextval('public.group_id_seq'),
                name VARCHAR(250) ,
				group_activity_id NOT NULL,
                company_id BIGINT NOT NULL,
                serialized_properties TEXT,
                CONSTRAINT group_pk PRIMARY KEY (id)
);


CREATE SEQUENCE public.private String group_activity_id_seq;
CREATE TABLE public.group_activity (
                id BIGINT NOT NULL DEFAULT nextval('public.group_activity_id_seq'),
                name VARCHAR(250) NOT NULL,
                serialized_properties TEXT,
                CONSTRAINT address_pk PRIMARY KEY (id)
);


CREATE SEQUENCE public.private String company_id_seq;
CREATE TABLE public.company(
                id BIGINT NOT NULL DEFAULT nextval('public.company_id_seq'),
                name VARCHAR(250) NOT NULL,
				serial BIGINT NOT NULL,
				SIREN BIGINT NOT NULL,
				SIRET BIGINT NOT NULL,
				address_id BIGINT,
				serialized_properties TEXT,
                CONSTRAINT company_pk PRIMARY KEY (id)
);


CREATE SEQUENCE public.private String user_responsibility_id_seq;
CREATE TABLE public.user_responsibility (
                id BIGINT NOT NULL DEFAULT nextval('public.user_responsibility_id_seq'),
                name VARCHAR(250) NOT NULL,
				start_timestamp TIMESTAMP NOT NULL,
				stop_timestamp TIMESTAMP,
				user_account_id NOT NULL,
				machine_id NOT NULL,
				serialized_properties TEXT,
                CONSTRAINT user_responsibility_pk PRIMARY KEY (id)
);


CREATE SEQUENCE public.private String machine_id_seq;
CREATE TABLE public.machine(
                id BIGINT NOT NULL DEFAULT nextval('public.machine_id_seq'),
                name VARCHAR(250) NOT NULL,
				description VARCHAR(1000),
				address_id BIGINT NOT NULL,
				machine_type_id BIGINT NOT NULL,
				serialized_properties TEXT,
                CONSTRAINT machine_pk PRIMARY KEY (id)
);


CREATE SEQUENCE public.private String machine_type_id_seq;
CREATE TABLE public.machine_type(
                id BIGINT NOT NULL DEFAULT nextval('public.machine_type_id_seq'),
                type VARCHAR(250) NOT NULL,
		    	serialized_properties TEXT,
                CONSTRAINT machine_type_pk PRIMARY KEY (id)
);

CREATE SEQUENCE public.private String project_id_seq;
CREATE TABLE public.project (
                id BIGINT NOT NULL DEFAULT nextval('public.project_id_seq'),
                title VARCHAR(250) NOT NULL,
                description VARCHAR(1000),
                creation_timestamp TIMESTAMP NOT NULL,
                lock_expiration_timestamp TIMESTAMP,
                author_id BIGINT NOT NULL,
				supervisor_id BIGINT NOT NULL,
				serialized_properties TEXT,
                CONSTRAINT project_pk PRIMARY KEY (id)
);

CREATE TABLE public.project_user_account_map (
                project_id BIGINT NOT NULL,
                user_account_id BIGINT NOT NULL,
                serialized_properties TEXT,
                CONSTRAINT project_user_account_map_pk PRIMARY KEY (project_id, user_account_id)
);

CREATE SEQUENCE public.private String request_id_seq;
CREATE TABLE public.request (
                id BIGINT NOT NULL DEFAULT nextval('public.request_id_seq'),
                title VARCHAR(250) NOT NULL,
                description VARCHAR(1000),
                creation_timestamp TIMESTAMP NOT NULL,
                serialized_properties TEXT,
                author_id BIGINT,
			    CONSTRAINT request_pk PRIMARY KEY (id)
);

CREATE SEQUENCE public.private String anomaly_id_seq;
CREATE TABLE public.anomaly (
                id BIGINT NOT NULL DEFAULT nextval('public.anomaly_id_seq'),
                CONSTRAINT anomaly_pk PRIMARY KEY (id)
);

CREATE SEQUENCE public.private String purchase_id_seq;
CREATE TABLE public.purchase (
                id BIGINT NOT NULL DEFAULT nextval('public.purchase_id_seq'),
                CONSTRAINT purchase_pk PRIMARY KEY (id)
);

CREATE SEQUENCE public.private String action_id_seq;
CREATE TABLE public.action (
                id BIGINT NOT NULL DEFAULT nextval('public.action_id_seq'),
                title VARCHAR(250) NOT NULL,
                description VARCHAR(1000),
                creation_timestamp TIMESTAMP NOT NULL,
                lock_expiration_timestamp TIMESTAMP,
                serialized_properties TEXT,
           	    CONSTRAINT action_pk PRIMARY KEY (id)
);

CREATE SEQUENCE public.private String response_id_seq;
CREATE TABLE public.response (
                id BIGINT NOT NULL DEFAULT nextval('public.response_id_seq'),
                title VARCHAR(250) NOT NULL,
                description VARCHAR(1000),
                creation_timestamp TIMESTAMP NOT NULL,
                lock_expiration_timestamp TIMESTAMP,
                serialized_properties TEXT,
                author_id BIGINT NOT NULL,
                assigned_by_id BIGINT NOT NULL,
                action_id BIGINT NOT NULL,
                request_id BIGINT NOT NULL,
			    CONSTRAINT response_pk PRIMARY KEY (id)
);

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

ALTER TABLE public.user_account ADD CONSTRAINT user_responsibility_fk
FOREIGN KEY (user_responsibility_id)
REFERENCES public.user_responsibility (id)
ON DELETE CASCADE
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.user_account ADD CONSTRAINT group_fk
FOREIGN KEY (group_id)
REFERENCES public.user_group (id)
ON DELETE CASCADE
ON UPDATE NO ACTION
NOT DEFERRABLE;

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

ALTER TABLE public.user_responsibility ADD CONSTRAINT user_account_fk
FOREIGN KEY (user_account_id)
REFERENCES public.user_account (id)
ON DELETE CASCADE
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.user_responsibility ADD CONSTRAINT machine_fk
FOREIGN KEY (machine_id)
REFERENCES public.machine (id)
ON DELETE CASCADE
ON UPDATE NO ACTION
NOT DEFERRABLE;


ALTER TABLE public.project_user_account_map ADD CONSTRAINT project_project_user_map_fk
FOREIGN KEY (project_id)
REFERENCES public.project (id)
ON DELETE RESTRICT
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.project_user_account_map ADD CONSTRAINT user_account_project_user_map_fk
FOREIGN KEY (user_account_id)
REFERENCES public.user_account (id)
ON DELETE CASCADE
ON UPDATE NO ACTION
NOT DEFERRABLE;