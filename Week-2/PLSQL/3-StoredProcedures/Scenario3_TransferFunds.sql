SET SERVEROUTPUT ON;

CREATE OR REPLACE PROCEDURE TransferFunds(
    p_fromAccount IN NUMBER,
    p_toAccount IN NUMBER,
    p_amount IN NUMBER
) AS
    v_fromBalance NUMBER;
BEGIN
    SELECT Balance INTO v_fromBalance
    FROM Accounts
    WHERE AccountID = p_fromAccount;

    IF v_fromBalance >= p_amount THEN
        UPDATE Accounts
        SET Balance = Balance - p_amount
        WHERE AccountID = p_fromAccount;

        UPDATE Accounts
        SET Balance = Balance + p_amount
        WHERE AccountID = p_toAccount;

        DBMS_OUTPUT.PUT_LINE('Transfer successful: $' || p_amount || 
                             ' from Account ' || p_fromAccount || 
                             ' to Account ' || p_toAccount);
    ELSE
        DBMS_OUTPUT.PUT_LINE('Transfer failed: Insufficient balance in Account ' || p_fromAccount);
    END IF;
END;
/

-- Test 1: Successful transfer 
EXEC TransferFunds(1, 2, 5000);

-- Test 2: Failed transfer 
EXEC TransferFunds(4, 1, 50000);


SELECT * FROM Accounts;