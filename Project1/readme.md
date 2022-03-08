Add the following methods to bank account:

1. Overdraft method
    The Overdraft Method should be used when I withdraw money 
    and if I have $0 or less in my account it will charge me a 
    fee of $35. It should also see if the amount withdrawn puts me 
    in the negative and prompt the user if this is okay and warn them
    that they will be charged a fee.

    Hint 1: You will need a method with parameters for the bank account
    as well as the amount to withdraw

    Hint 2: You can use the withdraw method in the overdraft method or vice
    versa depending on your implementation.

    Hint 3: You will need to do some logic to check if the balance is less than
    0 or if the withdraw would bring my balance to negative. 
        remember this is the format for if statements:
        if 
        else if 
        else if
        else 
    Hint 4: Method should look something like overDraft(BankAccount bank, double value)
          
2. Create a method for transfer Money. The method should take in 2 bank account objects and an amount to transfer. You can assume the second account is gregChecking
    Hint 1. This will require you to take in 3 parameters at min
        Bank Account 1, Bank Account 2, Amount to transfer
    Hint 2. The math involved would be two folded.
         You need to subtract from one bank account and add to another
    Hint 3. We already have methods for withdrawing and depositing. Be sure to use them.
    
3. Create a method to calculate simple interest.
    The formula to use is
    Simple Interest = (P × R × T)/100
    P is Principal amount.
    R is rate per annum. (: by the year : in or for each year : annually. per annum.)
    T is time in years.

    Make a return similar to the one for compound interest

4. Create a savings account option. If the user creates a bank account with 10,000 or more, prompt if they want to create a savings account. This will accept an inital value and a selection on compound or flat rate interest. The selection will 
then ask the user for the variables they would like for instance the Principal and years
but with fixed amounts for the apy. For the compount the APY is 0.0001 
and for the simple interest account it is 0.001. 
NOTE: The value of n im compounded must be 4 for quarterly 


5. Incorporate the methods in the interactive prompt
    Add Options for transfering and Setting up a savings account Include error checking in logic