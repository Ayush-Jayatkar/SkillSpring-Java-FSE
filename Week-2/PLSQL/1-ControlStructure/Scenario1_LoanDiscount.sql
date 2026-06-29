SET SERVEROUTPUT ON;

DECLARE
    CURSOR customer_cursor IS
        SELECT c.CustomerID, c.Name, c.Age, l.LoanID, l.InterestRate
        FROM Customers c
        JOIN Loans l ON c.CustomerID = l.CustomerID;
    
    v_customer customer_cursor%ROWTYPE;
BEGIN
    OPEN customer_cursor;
    
    LOOP
        FETCH customer_cursor INTO v_customer;
        EXIT WHEN customer_cursor%NOTFOUND;
        
        IF v_customer.Age > 60 THEN
            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE LoanID = v_customer.LoanID;
            
            DBMS_OUTPUT.PUT_LINE('Discount applied for: ' || v_customer.Name || 
                                 ' | New Rate: ' || (v_customer.InterestRate - 1) || '%');
        ELSE
            DBMS_OUTPUT.PUT_LINE('No discount for: ' || v_customer.Name);
        END IF;
    END LOOP;
    
    CLOSE customer_cursor;
    COMMIT;
END;
/