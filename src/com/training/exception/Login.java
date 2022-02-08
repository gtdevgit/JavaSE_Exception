package com.training.exception;

public class Login {
    private static final String UTILISATEUR = "scott";
    private static final String PASSWORD = "tiger";

    public static void main(String[] args) throws WrongLoginException, WrongPwdException, WrongInputLength {
        boolean ok = false;
        do{
            try {
                String login = ScannerUtils.getString("Entrez le nom de l'utilisateur : ");
                if (!login.equals(UTILISATEUR))
                    throw new WrongLoginException();

                String password = ScannerUtils.getString("Entrez le mot de passe : ");
                if (!password.equals(PASSWORD))
                    throw new WrongPwdException();

                if ((login.length() > 10) || (password.length() > 10))
                    throw new WrongInputLength();

                ok = true;
            }
            catch (WrongLoginException e) {

            }
            catch (WrongPwdException e) {

            }
            catch (WrongInputLength e){

            }

        } while (!ok);
    }


}
