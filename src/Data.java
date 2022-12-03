import WrongLoginException.WrongLoginException;
import WrongPasswordException.WrongPasswordException;

public class Data {
    public static boolean checkData(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.matches("^[\\w]{1,20}+$")){
            System.out.println(true);
        } else if (login.length() >= 20 || login.isEmpty() || login.isBlank()) {
            throw new WrongLoginException("Некорректный логин");
        } else {
            throw new WrongLoginException("Некорректный логин");
        }
        password.matches("^[a-zA-Z0-9]+$");
        confirmPassword.matches("^[a-zA-Z0-9]+$");
        if (password.length() >= 20 || password.isEmpty()|| password.isBlank()){
            throw new WrongPasswordException("Пароль введён некорректно");
        } else {
            System.out.println(true);
        }
        if (!confirmPassword.equals(password)){
            throw new WrongPasswordException("Подтверждённый пароль введён некорректно");
        } else {
            System.out.println(true);
        }
        return false;
    }
}
