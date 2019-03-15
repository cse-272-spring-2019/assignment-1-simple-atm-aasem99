/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testguiatm;

import java.util.HashMap;

public class validation {

    private double balance = 200.0;
    HashMap usersDictionary;

    public validation() {
        usersDictionary = new HashMap();
        usersDictionary.put("", "");
    }

    public boolean validate(String creditcard, String password) {
        boolean validationresult = false;
        String fetchedpassword = (String) usersDictionary.get(creditcard);
        if (fetchedpassword != null) {
            validationresult = fetchedpassword.equals(password);
            return validationresult;
        } else {
            return validationresult;
        }
    }

    public double deposit1(double amount) {
        return this.balance+= amount;

    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public double withdraw1(double withdrawned){
        if(withdrawned>balance){
            return balance;
        }
        else
        return this.balance-= withdrawned;
    }
    

}
