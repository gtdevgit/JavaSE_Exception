package com.training.exception;

/*
1) Exception in thread "main" java.lang.NullPointerException: Cannot load from int array because "tab" is null
	at com.training.exception.OubliStupide.main(OubliStupide.java:6)
 */
public class OubliStupide {
    public static void main(String[] args) {
        int[] tab = null;
        try {
            System.out.println(tab[2]);
        }
        catch (NullPointerException e) {
            System.out.println("Erreur, le tableau est null.");
        }
    }
}
