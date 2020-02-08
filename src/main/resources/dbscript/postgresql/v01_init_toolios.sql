CREATE SEQUENCE public.user_account_id_seq;
CREATE TABLE public.user_account (
                id BIGINT NOT NULL DEFAULT nextval('public.user_account_id_seq'),
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
				CONSTRAINT user_account_pk PRIMARY KEY (id)
);

CREATE SEQUENCE public.simple_user_account_id_seq;
CREATE TABLE public.simple_user_account (
                id BIGINT NOT NULL DEFAULT nextval('public.simple_user_account_id_seq'),
               	CONSTRAINT simple_user_account_pk PRIMARY KEY (id)
);

CREATE SEQUENCE public.supervisor_account_id_seq;
CREATE TABLE public.supervisor_account (
                id BIGINT NOT NULL DEFAULT nextval('public.supervisor_account_id_seq'),
               	CONSTRAINT supervisor_account_pk PRIMARY KEY (id)
);

CREATE SEQUENCE public.provider_account_id_seq;
CREATE TABLE public.provider_account (
                id BIGINT NOT NULL DEFAULT nextval('public.provider_account_id_seq'),
                f_name VARCHAR(50),
				l_name VARCHAR(50),
				email VARCHAR(50) NOT NULL,
				phone_number VARCHAR(50),
				creation_mode VARCHAR(50),
                serialized_properties TEXT,
                created_by_id BIGINT NOT NULL,
               	CONSTRAINT provider_account_pk PRIMARY KEY (id)
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

CREATE SEQUENCE public.user_function_id_seq;
CREATE TABLE public.user_function (
                id BIGINT NOT NULL DEFAULT nextval('public.address_id_seq'),
                function_name VARCHAR(250) NOT NULL,
                CONSTRAINT user_function_pk PRIMARY KEY (id)
);

CREATE SEQUENCE public.group_id_seq;
CREATE TABLE public.user_group (
                id BIGINT NOT NULL DEFAULT nextval('public.group_id_seq'),
                user_group_name VARCHAR(250) ,
				group_activity_id BIGINT NOT NULL,
                company_id BIGINT NOT NULL,
                serialized_properties TEXT,
                CONSTRAINT group_pk PRIMARY KEY (id)
);


CREATE SEQUENCE public.group_activity_id_seq;
CREATE TABLE public.group_activity (
                id BIGINT NOT NULL DEFAULT nextval('public.group_activity_id_seq'),
                group_activity_name VARCHAR(250) NOT NULL,
                serialized_properties TEXT,
                CONSTRAINT group_activity_pk PRIMARY KEY (id)
);


CREATE SEQUENCE public.company_id_seq;
CREATE TABLE public.company(
                id BIGINT NOT NULL DEFAULT nextval('public.company_id_seq'),
                company_name VARCHAR(250) NOT NULL,
				company_serial BIGINT NOT NULL,
				SIREN BIGINT NOT NULL,
				SIRET BIGINT NOT NULL,
				address_id BIGINT  NOT NULL,
				serialized_properties TEXT,
                CONSTRAINT company_pk PRIMARY KEY (id)
);


CREATE SEQUENCE public.user_responsibility_id_seq;
CREATE TABLE public.user_responsibility (
                id BIGINT NOT NULL DEFAULT nextval('public.user_responsibility_id_seq'),
                user_responsibility_name VARCHAR(250) NOT NULL,
				start_timestamp TIMESTAMP NOT NULL,
				stop_timestamp TIMESTAMP,
				user_account_id BIGINT NOT NULL,
				machine_id BIGINT NOT NULL,
				serialized_properties TEXT,
                CONSTRAINT user_responsibility_pk PRIMARY KEY (id)
);


CREATE SEQUENCE public.machine_id_seq;
CREATE TABLE public.machine(
                id BIGINT NOT NULL DEFAULT nextval('public.machine_id_seq'),
                machine_name VARCHAR(250) NOT NULL,
				description VARCHAR(1000),
				address_id BIGINT ,
				machine_type_id BIGINT NOT NULL,
              	serialized_properties TEXT,
                CONSTRAINT machine_pk PRIMARY KEY (id)
);


CREATE SEQUENCE public.machine_type_id_seq;
CREATE TABLE public.machine_type(
                id BIGINT NOT NULL DEFAULT nextval('public.machine_type_id_seq'),
                machine_type VARCHAR(250) NOT NULL,
		    	serialized_properties TEXT,
                CONSTRAINT machine_type_pk PRIMARY KEY (id)
);

CREATE SEQUENCE public.project_id_seq;
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
CREATE TABLE public.project_machine_map (
                project_id BIGINT NOT NULL,
                machine_id BIGINT NOT NULL,
                serialized_properties TEXT,
                CONSTRAINT project_machine_map_pk PRIMARY KEY (project_id, machine_id)
);


CREATE SEQUENCE public.request_id_seq;
CREATE TABLE public.request (
                id BIGINT NOT NULL DEFAULT nextval('public.request_id_seq'),
                title VARCHAR(250) NOT NULL,
                description VARCHAR(1000),
                creation_timestamp TIMESTAMP NOT NULL,
                serialized_properties TEXT,
                author_id BIGINT,
			    CONSTRAINT request_pk PRIMARY KEY (id)
);

CREATE SEQUENCE public.anomaly_id_seq;
CREATE TABLE public.anomaly (
                id BIGINT NOT NULL DEFAULT nextval('public.anomaly_id_seq'),
                CONSTRAINT anomaly_pk PRIMARY KEY (id)
);

CREATE SEQUENCE public.purchase_id_seq;
CREATE TABLE public.purchase (
                id BIGINT NOT NULL DEFAULT nextval('public.purchase_id_seq'),
                CONSTRAINT purchase_pk PRIMARY KEY (id)
);

CREATE SEQUENCE public.user_action_id_seq;
CREATE TABLE public.user_action (
                id BIGINT NOT NULL DEFAULT nextval('public.user_action_id_seq'),
                title VARCHAR(250) NOT NULL,
                description VARCHAR(1000),
                creation_timestamp TIMESTAMP NOT NULL,
                lock_expiration_timestamp TIMESTAMP,
                serialized_properties TEXT,
           	    CONSTRAINT user_action_pk PRIMARY KEY (id)
);

CREATE SEQUENCE public.action_improvement_id_seq;
CREATE TABLE public.action_improvement (
                id BIGINT NOT NULL DEFAULT nextval('public.action_improvement_id_seq'),
                CONSTRAINT action_improvement_pk PRIMARY KEY (id)
);

CREATE SEQUENCE public.action_purchase_id_seq;
CREATE TABLE public.action_purchase (
                id BIGINT NOT NULL DEFAULT nextval('public.action_purchase_id_seq'),
                provider_account_id BIGINT NOT NULL,
                CONSTRAINT action_purchase_pk PRIMARY KEY (id)
);

CREATE SEQUENCE public.article_id_seq;
CREATE TABLE public.article (
                id BIGINT NOT NULL DEFAULT nextval('public.article_id_seq'),
                title VARCHAR(250) NOT NULL,
                description VARCHAR(1000),
                serialized_properties TEXT,
                price_ht NUMERIC,
                price_ttc NUMERIC,
                provider_account_id BIGINT ,
                article_category_id BIGINT ,
                CONSTRAINT article_pk PRIMARY KEY (id)
);
CREATE SEQUENCE public.article_category_id_seq;
CREATE TABLE public.article_category (
                id BIGINT NOT NULL DEFAULT nextval('public.article_category_id_seq'),
                provider_account_id BIGINT NOT NULL,
                CONSTRAINT article_category_pk PRIMARY KEY (id)
);


CREATE SEQUENCE public.response_id_seq;
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


ALTER TABLE public.machine ADD CONSTRAINT address_fk
FOREIGN KEY (address_id)
REFERENCES public.address (id)
ON DELETE CASCADE
ON UPDATE NO ACTION
NOT DEFERRABLE;


ALTER TABLE public.machine ADD CONSTRAINT machine_type_fk
FOREIGN KEY (machine_type_id)
REFERENCES public.machine_type (id)
ON DELETE CASCADE
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.project ADD CONSTRAINT author_id_fk
FOREIGN KEY (author_id)
REFERENCES public.user_account (id)
ON DELETE CASCADE
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.project ADD CONSTRAINT supervisor_id_fk
FOREIGN KEY (supervisor_id)
REFERENCES public.supervisor_account (id)
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


ALTER TABLE public.project_machine_map ADD CONSTRAINT project_map_fk
FOREIGN KEY (project_id)
REFERENCES public.project (id)
ON DELETE CASCADE
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.project_machine_map ADD CONSTRAINT machine_map_fk
FOREIGN KEY (machine_id)
REFERENCES public.machine (id)
ON DELETE CASCADE
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.request ADD CONSTRAINT author_id_fk
FOREIGN KEY (author_id)
REFERENCES public.user_account (id)
ON DELETE CASCADE
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.response ADD CONSTRAINT author_id_fk
FOREIGN KEY (author_id)
REFERENCES public.user_account (id)
ON DELETE CASCADE
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.response ADD CONSTRAINT assigned_by_fk
FOREIGN KEY (assigned_by_id)
REFERENCES public.supervisor_account (id)
ON DELETE CASCADE
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.response ADD CONSTRAINT action_fk
FOREIGN KEY (action_id)
REFERENCES public.user_action (id)
ON DELETE CASCADE
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.response ADD CONSTRAINT request_fk
FOREIGN KEY (request_id)
REFERENCES public.request (id)
ON DELETE CASCADE
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.anomaly ADD CONSTRAINT anomaly_fk
FOREIGN KEY (id)
REFERENCES public.request (id)
ON DELETE CASCADE
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.purchase ADD CONSTRAINT purchase_fk
FOREIGN KEY (id)
REFERENCES public.request (id)
ON DELETE CASCADE
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.simple_user_account ADD CONSTRAINT simple_user_account_fk
FOREIGN KEY (id)
REFERENCES public.user_account (id)
ON DELETE CASCADE
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.supervisor_account ADD CONSTRAINT supervisor_account_fk
FOREIGN KEY (id)
REFERENCES public.user_account (id)
ON DELETE CASCADE
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.provider_account ADD CONSTRAINT created_by_id_fk
FOREIGN KEY (id)
REFERENCES public.supervisor_account (id)
ON DELETE CASCADE
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.action_improvement ADD CONSTRAINT user_action_fk
FOREIGN KEY (id)
REFERENCES public.user_action (id)
ON DELETE CASCADE
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.action_purchase ADD CONSTRAINT user_action_fk
FOREIGN KEY (id)
REFERENCES public.user_action (id)
ON DELETE CASCADE
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.action_purchase ADD CONSTRAINT provider_account_fk
FOREIGN KEY (provider_account_id)
REFERENCES public.provider_account (id)
ON DELETE CASCADE
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.article ADD CONSTRAINT article_category_fk
FOREIGN KEY (article_category_id)
REFERENCES public.article_category (id)
ON DELETE CASCADE
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.article ADD CONSTRAINT provider_account_fk
FOREIGN KEY (provider_account_id)
REFERENCES public.provider_account (id)
ON DELETE CASCADE
ON UPDATE NO ACTION
NOT DEFERRABLE;