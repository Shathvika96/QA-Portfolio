# Test Cases

## Module: User Login

---

### TC_LOGIN_001 - Verify login with valid credentials

**Preconditions:**
- User account is registered and active

**Test Data:**
- Username: valid_user  
- Password: valid_password  

**Steps:**
1. Navigate to the login page  
2. Enter a valid username  
3. Enter a valid password  
4. Click on the login button  

**Expected Result:**
- User is successfully logged in  
- User is redirected to the dashboard  

**Actual Result:**
- User successfully logged in and redirected to dashboard  

**Status:**
- Pass  

---

### TC_LOGIN_002 - Verify login with invalid password

**Preconditions:**
- User account is registered and active

**Test Data:**
- Username: valid_user  
- Password: invalid_password  

**Steps:**
1. Navigate to the login page  
2. Enter a valid username  
3. Enter an invalid password  
4. Click on the login button  

**Expected Result:**
- Error message should be displayed  
- User should not be logged in  

**Actual Result:**
- Error message "Invalid credentials" displayed  

**Status:**
- Pass  

---

### TC_LOGIN_003 - Verify login with empty required fields

**Preconditions:**
- User is on login page  

**Test Data:**
- Username: blank  
- Password: blank  

**Steps:**
1. Navigate to the login page  
2. Leave username and password fields empty  
3. Click on the login button  

**Expected Result:**
- Validation message should be displayed for required fields  
- User should not be logged in  

**Actual Result:**
- Validation message displayed  

**Status:**
- Pass  

---

### TC_LOGIN_004 - Verify login with invalid username

**Preconditions:**
- User account does not exist  

**Test Data:**
- Username: invalid_user  
- Password: valid_password  

**Steps:**
1. Navigate to the login page  
2. Enter an invalid username  
3. Enter a valid password  
4. Click on the login button  

**Expected Result:**
- Error message should be displayed  
- User should not be logged in  

**Actual Result:**
- Error message "Invalid username" displayed  

**Status:**
- Pass  
