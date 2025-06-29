
CREATE TABLE client_info (
    client_id       NUMBER PRIMARY KEY,
    full_name       VARCHAR2(100),
    client_age      NUMBER,
    account_balance NUMBER(10, 2),
    vip_status      VARCHAR2(5) DEFAULT 'FALSE'
);


CREATE TABLE loan_details (
    loan_ref         NUMBER PRIMARY KEY,
    client_id        NUMBER REFERENCES client_info(client_id),
    rate_of_interest NUMBER(5,2),
    repayment_date   DATE
);

INSERT INTO client_info VALUES (101, 'Ravi', 68, 15000, 'FALSE');
INSERT INTO client_info VALUES (102, 'Meena', 50, 7000, 'FALSE');
INSERT INTO client_info VALUES (103, 'John', 72, 11000, 'FALSE');

INSERT INTO loan_details VALUES (201, 101, 7.8, SYSDATE + 7);
INSERT INTO loan_details VALUES (202, 102, 6.3, SYSDATE + 40);
INSERT INTO loan_details VALUES (203, 103, 8.5, SYSDATE + 3);

COMMIT;
