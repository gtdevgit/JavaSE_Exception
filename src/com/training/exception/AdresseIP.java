package com.training.exception;

public class AdresseIP {

    public static void main(String[] args) {
        try {
            AdresseIP adr = new AdresseIP(267, 277, 1929, 10);
        } catch (ExceptionAdrIP e) {
            System.out.println(e.getMessage());
        }
    }

    private int[] octet;

    private static boolean verifierOctet(int o){
        return (o >= 0 && o <= 255);
    }

    public AdresseIP(int o1, int o2, int o3, int o4) throws ExceptionAdrIP{
        if (!verifierOctet(o1)) {
            throw new ExceptionAdrIP("Valeur incorrecte pour le premier octet");
        }

        if (!verifierOctet(o2)) {
            throw new ExceptionAdrIP("Valeur incorrecte pour le deuxième premier octet");
        }

        if (!verifierOctet(o3)) {
            throw new ExceptionAdrIP("Valeur incorrecte pour le troisième octet");
        }

        if (!verifierOctet(o4)) {
            throw new ExceptionAdrIP("Valeur incorrecte pour le quatrième octet");
        }

        octet = new int[]{o1, o2, o3, o4};
    }

    public String toString() {
        return octet[0] + "." + octet[1] + "." + octet[2] + "." + octet[3];
    }
}
