package task2;

public class Main {
    public static void signIn(String login, String password, String confirmPassword) throws WrongLoginExeption, WrongPasswordExeption {
        if (login.length() > 20 || login.length() == 0 || login == null) throw new WrongLoginExeption("Incorrect login");
        if (password.length() < 20 || password == null || !password.equals(confirmPassword)) throw new WrongPasswordExeption("Incorrect password");
        for (int i = 0; i < login.length(); i++) {
            if (!(login.charAt(i) >= '0' && login.charAt(i) <= '9' || login.charAt(i) >= 'A' && login.charAt(i) <= 'Z'
                    || login.charAt(i) >= 'a' && login.charAt(i) <= 'z' || login.charAt(i) == '_')) throw new WrongLoginExeption("Login contains forbidden symbols");
        }
        for (int i = 0; i < password.length(); i++) {
            if (!(password.charAt(i) >= '0' && password.charAt(i) <= '9' || password.charAt(i) >= 'A' && password.charAt(i) <= 'Z'
                    || password.charAt(i) >= 'a' && password.charAt(i) <= 'z' || password.charAt(i) == '_')) throw new WrongPasswordExeption("Password contains forbidden symbols");
        }
    }

    public static void main(String[] args) throws WrongPasswordExeption, WrongLoginExeption {
        signIn("фвофвало","qwertyuiopasdfghjkl123","qwertyuiopasdfghjkl123");
    }
}
