CREATE TABLE QUAL (
    QUALID            SMALLINT(2) NOT NULL,
    QUALNAME          CHAR(14),
    QUALFIELD         CHAR(13),
PRIMARY KEY (QUALID));

INSERT INTO QUAL VALUES (1, 'BSC', 'SCIENCE');
INSERT INTO QUAL VALUES (2, 'BCOMM', 'BUSINESS');
INSERT INTO QUAL VALUES (3, 'BENG', 'ENGINEERING');
INSERT INTO QUAL VALUES (4, 'BA', 'HUMANITIES');