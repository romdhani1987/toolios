

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


