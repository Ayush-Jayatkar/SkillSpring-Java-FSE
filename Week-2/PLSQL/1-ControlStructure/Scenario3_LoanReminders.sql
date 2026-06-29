SET SERVEROUTPUT ON;

DECLARE
    CURSOR loan_cursor IS
        SELECT c.Name, l.LoanID, l.DueDate
        FROM Customers c
        JOIN Loans l ON c.CustomerID = l.CustomerID
        WHERE l.DueDate BETWEEN SYSDATE AND SYSDATE + 30;
    
    v_loan loan_cursor%ROWTYPE;
BEGIN
    OPEN loan_cursor;
    
    LOOP
        FETCH loan_cursor INTO v_loan;
        EXIT WHEN loan_cursor%NOTFOUND;
        
        DBMS_OUTPUT.PUT_LINE('REMINDER: Dear ' || v_loan.Name || 
                             ', your loan (ID: ' || v_loan.LoanID || 
                             ') is due on ' || TO_CHAR(v_loan.DueDate, 'DD-MON-YYYY'));
    END LOOP;
    
    CLOSE loan_cursor;
END;
/