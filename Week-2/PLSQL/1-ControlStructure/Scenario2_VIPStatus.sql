SET SERVEROUTPUT ON;

DECLARE
    CURSOR customer_cursor IS
        SELECT CustomerID, Name, Balance FROM Customers;
    
    v_customer customer_cursor%ROWTYPE;
BEGIN
    OPEN customer_cursor;
    
    LOOP
        FETCH customer_cursor INTO v_customer;
        EXIT WHEN customer_cursor%NOTFOUND;
        
        IF v_customer.Balance > 10000 THEN
            UPDATE Customers
            SET IsVIP = 'TRUE'
            WHERE CustomerID = v_customer.CustomerID;
            
            DBMS_OUTPUT.PUT_LINE(v_customer.Name || 
                                 ' promoted to VIP! Balance: $' || v_customer.Balance);
        ELSE
            DBMS_OUTPUT.PUT_LINE(v_customer.Name || 
                                 ' not eligible for VIP. Balance: $' || v_customer.Balance);
        END IF;
    END LOOP;
    
    CLOSE customer_cursor;
    COMMIT;
END;
/