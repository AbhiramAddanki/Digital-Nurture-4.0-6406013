
CREATE OR REPLACE PROCEDURE ShiftAccountFunds (
  from_acc IN NUMBER,
  to_acc   IN NUMBER,
  amt      IN NUMBER
) AS
  current_balance NUMBER;
BEGIN
  SELECT acc_balance INTO current_balance
  FROM bank_accounts
  WHERE acc_id = from_acc
  FOR UPDATE;

  IF current_balance < amt THEN
    RAISE_APPLICATION_ERROR(-20010, 'Not enough balance: ' || current_balance);
  END IF;

  UPDATE bank_accounts SET acc_balance = acc_balance - amt WHERE acc_id = from_acc;
  UPDATE bank_accounts SET acc_balance = acc_balance + amt WHERE acc_id = to_acc;

  COMMIT;
END;
/
