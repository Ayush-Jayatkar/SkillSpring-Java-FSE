SET SERVEROUTPUT ON;

CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
    p_department IN VARCHAR2,
    p_bonusPercent IN NUMBER
) AS
BEGIN
    UPDATE Employees
    SET Salary = Salary + (Salary * p_bonusPercent / 100)
    WHERE Department = p_department;

    DBMS_OUTPUT.PUT_LINE('Bonus of ' || p_bonusPercent || '% applied to ' || p_department || ' department.');
END;
/

-- (give IT department 10% bonus)
EXEC UpdateEmployeeBonus('IT', 10);


SELECT * FROM Employees;