package com.training.exception;

public class AgeCapException extends Exception {

    public AgeCapException(String strAge) {
        // La chaine passée à super permet de de créer le message de l'exception
        // que l'on pourra retrouver avec la fonction getMessage()
        super(String.format("%s n'est pas un âge valide.", strAge));
    }

}
