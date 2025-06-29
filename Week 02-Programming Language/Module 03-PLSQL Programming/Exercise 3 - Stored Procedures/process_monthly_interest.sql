CREATE OR REPLACE PROCEDURE ApplyMonthlyInterest AS
  CURSOR c_savings IS
    SELECT acc_id, acc_balance FROM bank_accounts WHERE acc_type = 'SAVINGS' FOR UPDATE;
BEGIN
  FOR rec IN c_savings LOOP
    UPDATE bank_accounts
    SET acc_balance = rec.acc_balance * 1.01
    WHERE acc_id = rec.acc_id;
  END LOOP;

  COMMIT;
END;
/
