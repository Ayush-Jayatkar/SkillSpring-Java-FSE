CREATE TABLE Accounts (
    AccountID NUMBER PRIMARY KEY,
    CustomerName VARCHAR2(100),
    AccountType VARCHAR2(20),
    Balance NUMBER
);

CREATE TABLE Employees (
    EmployeeID NUMBER PRIMARY KEY,
    EmployeeName VARCHAR2(100),
    Department VARCHAR2(50),
    Salary NUMBER
);


INSERT INTO Accounts VALUES (1, 'Ayush', 'Savings', 10000);
INSERT INTO Accounts VALUES (2, 'Rahul', 'Savings', 25000);
INSERT INTO Accounts VALUES (3, 'Priya', 'Current', 15000);
INSERT INTO Accounts VALUES (4, 'Amit', 'Savings', 8000);
INSERT INTO Accounts VALUES (5, 'Sneha', 'Current', 30000);


INSERT INTO Employees VALUES (1, 'Ravi', 'IT', 50000);
INSERT INTO Employees VALUES (2, 'Meera', 'IT', 60000);
INSERT INTO Employees VALUES (3, 'Kiran', 'HR', 45000);
INSERT INTO Employees VALUES (4, 'Divya', 'HR', 48000);
INSERT INTO Employees VALUES (5, 'Arjun', 'Finance', 55000);

COMMIT;