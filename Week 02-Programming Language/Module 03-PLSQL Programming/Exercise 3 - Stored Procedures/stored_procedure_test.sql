
BEGIN
  ApplyMonthlyInterest;
END;
/

BEGIN
  AdjustStaffBonus('IT', 5);
END;
/


BEGIN
  ShiftAccountFunds(2011, 2012, 1000);
END;
/

SELECT * FROM bank_accounts;
SELECT * FROM staff;
