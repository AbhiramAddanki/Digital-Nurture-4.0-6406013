CREATE OR REPLACE PROCEDURE AdjustStaffBonus (
  dept_name   IN VARCHAR2,
  percent_inc IN NUMBER
) AS
  factor NUMBER := 1 + (percent_inc / 100);
BEGIN
  UPDATE staff
  SET base_pay = base_pay * factor
  WHERE dept = dept_name;

  COMMIT;
END;
/
