package com.training.exception;

import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args)   {
	// write your code here
        try{
            int age = getAgeCap();
            System.out.println("Age = " + age);
        }
        catch(AgeCapException e) {
            System.err.println(e.getMessage());
        }
    }

    private static int getAgeCap() throws AgeCapException {
        String value = null;
        try {
            value = ScannerUtils.getString("Quel est l'age du capitaine ?");
            int age = Integer.parseInt(value);
            if ((age < 18) || (age > 65)){
                throw new AgeCapException(value);
            }
            return age;
        } catch (NumberFormatException nfe) {
            throw new AgeCapException(value);
        }
    }
}
