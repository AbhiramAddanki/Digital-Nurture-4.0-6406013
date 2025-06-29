CREATE TABLE client (
  client_id   NUMBER PRIMARY KEY,
  full_name   VARCHAR2(100),
  client_age  NUMBER,
  wallet      NUMBER(15, 2),
  vip_status  VARCHAR2(5) DEFAULT 'FALSE'
);

CREATE TABLE bank_accounts (
  acc_id        NUMBER PRIMARY KEY,
  client_ref    NUMBER REFERENCES client(client_id),
  acc_balance   NUMBER(15, 2),
  acc_type      VARCHAR2(20)
);

CREATE TABLE staff (
  staff_id   NUMBER PRIMARY KEY,
  dept       VARCHAR2(50),
  base_pay   NUMBER(15, 2)
);

INSERT ALL
  INTO clients VALUES (201, 'Anita', 60, 10000, 'FALSE')
  INTO clients VALUES (202, 'Brian', 40, 8500,  'FALSE')
  INTO clients VALUES (203, 'Cathy', 75, 9300,  'FALSE')
SELECT * FROM dual;

INSERT ALL
  INTO bank_accounts VALUES (2011, 201, 20000, 'SAVINGS')
  INTO bank_accounts VALUES (2012, 202, 10000, 'CHECKING')
SELECT * FROM dual;

INSERT ALL
  INTO staff VALUES (501, 'IT', 18000)
  INTO staff VALUES (502, 'IT', 250000)
SELECT * FROM dual;

COMMIT;

SELECT * FROM clients;
SELECT * FROM bank_accounts;
SELECT * FROM staff;


