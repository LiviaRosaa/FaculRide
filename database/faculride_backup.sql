--
-- PostgreSQL database dump
--

\restrict QZwl75sBnjETa7k1cVGsc69Wr7Dci0ktoiyd628J6Z8PbrOOl6Gbmpw3Kmr9BHv

-- Dumped from database version 17.10
-- Dumped by pg_dump version 17.10

-- Started on 2026-06-23 21:56:25

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET transaction_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 224 (class 1259 OID 16418)
-- Name: avaliacao; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.avaliacao (
    id integer NOT NULL,
    motorista character varying(100) NOT NULL,
    nota integer NOT NULL
);


ALTER TABLE public.avaliacao OWNER TO postgres;

--
-- TOC entry 223 (class 1259 OID 16417)
-- Name: avaliacao_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.avaliacao_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.avaliacao_id_seq OWNER TO postgres;

--
-- TOC entry 4929 (class 0 OID 0)
-- Dependencies: 223
-- Name: avaliacao_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.avaliacao_id_seq OWNED BY public.avaliacao.id;


--
-- TOC entry 220 (class 1259 OID 16404)
-- Name: carona; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.carona (
    id integer NOT NULL,
    motorista character varying(100) NOT NULL,
    origem character varying(100) NOT NULL,
    destino character varying(100) NOT NULL,
    horario character varying(50) NOT NULL,
    valor double precision,
    status character varying(30)
);


ALTER TABLE public.carona OWNER TO postgres;

--
-- TOC entry 219 (class 1259 OID 16403)
-- Name: carona_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.carona_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.carona_id_seq OWNER TO postgres;

--
-- TOC entry 4930 (class 0 OID 0)
-- Dependencies: 219
-- Name: carona_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.carona_id_seq OWNED BY public.carona.id;


--
-- TOC entry 222 (class 1259 OID 16411)
-- Name: solicitacao; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.solicitacao (
    id integer NOT NULL,
    passageiro character varying(100) NOT NULL,
    motorista character varying(100) NOT NULL,
    status character varying(30) NOT NULL,
    id_carona integer
);


ALTER TABLE public.solicitacao OWNER TO postgres;

--
-- TOC entry 221 (class 1259 OID 16410)
-- Name: solicitacao_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.solicitacao_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.solicitacao_id_seq OWNER TO postgres;

--
-- TOC entry 4931 (class 0 OID 0)
-- Dependencies: 221
-- Name: solicitacao_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.solicitacao_id_seq OWNED BY public.solicitacao.id;


--
-- TOC entry 218 (class 1259 OID 16394)
-- Name: usuario; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.usuario (
    id integer NOT NULL,
    nome character varying(100) NOT NULL,
    email character varying(100) NOT NULL,
    curso character varying(100),
    senha character varying(100) NOT NULL
);


ALTER TABLE public.usuario OWNER TO postgres;

--
-- TOC entry 217 (class 1259 OID 16393)
-- Name: usuario_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.usuario_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.usuario_id_seq OWNER TO postgres;

--
-- TOC entry 4932 (class 0 OID 0)
-- Dependencies: 217
-- Name: usuario_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.usuario_id_seq OWNED BY public.usuario.id;


--
-- TOC entry 4760 (class 2604 OID 16421)
-- Name: avaliacao id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.avaliacao ALTER COLUMN id SET DEFAULT nextval('public.avaliacao_id_seq'::regclass);


--
-- TOC entry 4758 (class 2604 OID 16407)
-- Name: carona id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.carona ALTER COLUMN id SET DEFAULT nextval('public.carona_id_seq'::regclass);


--
-- TOC entry 4759 (class 2604 OID 16414)
-- Name: solicitacao id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.solicitacao ALTER COLUMN id SET DEFAULT nextval('public.solicitacao_id_seq'::regclass);


--
-- TOC entry 4757 (class 2604 OID 16397)
-- Name: usuario id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.usuario ALTER COLUMN id SET DEFAULT nextval('public.usuario_id_seq'::regclass);


--
-- TOC entry 4923 (class 0 OID 16418)
-- Dependencies: 224
-- Data for Name: avaliacao; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.avaliacao (id, motorista, nota) FROM stdin;
\.


--
-- TOC entry 4919 (class 0 OID 16404)
-- Dependencies: 220
-- Data for Name: carona; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.carona (id, motorista, origem, destino, horario, valor, status) FROM stdin;
\.


--
-- TOC entry 4921 (class 0 OID 16411)
-- Dependencies: 222
-- Data for Name: solicitacao; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.solicitacao (id, passageiro, motorista, status, id_carona) FROM stdin;
\.


--
-- TOC entry 4917 (class 0 OID 16394)
-- Dependencies: 218
-- Data for Name: usuario; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.usuario (id, nome, email, curso, senha) FROM stdin;
1	teste	teste@gmail.com	software	123
2	livia Almeida Rosa	livia@gmail.com	computacao	123
3	Larayane Rosa	lara@gmail.com	software	123
4	fulano de tal	motorista@gmail.com	software	123
\.


--
-- TOC entry 4933 (class 0 OID 0)
-- Dependencies: 223
-- Name: avaliacao_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.avaliacao_id_seq', 1, false);


--
-- TOC entry 4934 (class 0 OID 0)
-- Dependencies: 219
-- Name: carona_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.carona_id_seq', 1, false);


--
-- TOC entry 4935 (class 0 OID 0)
-- Dependencies: 221
-- Name: solicitacao_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.solicitacao_id_seq', 1, false);


--
-- TOC entry 4936 (class 0 OID 0)
-- Dependencies: 217
-- Name: usuario_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.usuario_id_seq', 4, true);


--
-- TOC entry 4770 (class 2606 OID 16423)
-- Name: avaliacao avaliacao_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.avaliacao
    ADD CONSTRAINT avaliacao_pkey PRIMARY KEY (id);


--
-- TOC entry 4766 (class 2606 OID 16409)
-- Name: carona carona_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.carona
    ADD CONSTRAINT carona_pkey PRIMARY KEY (id);


--
-- TOC entry 4768 (class 2606 OID 16416)
-- Name: solicitacao solicitacao_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.solicitacao
    ADD CONSTRAINT solicitacao_pkey PRIMARY KEY (id);


--
-- TOC entry 4762 (class 2606 OID 16401)
-- Name: usuario usuario_email_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.usuario
    ADD CONSTRAINT usuario_email_key UNIQUE (email);


--
-- TOC entry 4764 (class 2606 OID 16399)
-- Name: usuario usuario_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.usuario
    ADD CONSTRAINT usuario_pkey PRIMARY KEY (id);


-- Completed on 2026-06-23 21:56:26

--
-- PostgreSQL database dump complete
--

\unrestrict QZwl75sBnjETa7k1cVGsc69Wr7Dci0ktoiyd628J6Z8PbrOOl6Gbmpw3Kmr9BHv

