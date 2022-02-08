package com.training.exception;

import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args)   {
        boolean ageincoreecte = true;
        int counterror = 0;

        do{
            try{
                int age = getAgeCap();
                ageincoreecte = false;
                System.out.println("Age = " + age);
            }
            catch(Exception e) {
                System.err.println(e.getMessage());
                counterror++;
                System.err.println("Nb essais en erreur = " + counterror);
            }
        } while (ageincoreecte);

    }

    private static int scanAgeCap() throws AgeCapException {
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

    private static int getAgeCap() throws Exception {
        try {
            return scanAgeCap();
        }
        catch (AgeCapException e) {
            throw new Exception(e.getMessage());
        }
    }
}
