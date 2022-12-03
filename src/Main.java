import WrongLoginException.WrongLoginException;
import WrongPasswordException.WrongPasswordException;

public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {

        //Data.checkData("asdasd341_", "Brain341","Brain341");

        try {
            Data.checkData("asdasd341_", "Brain341","Brain341");
        } catch (WrongLoginException e){
            System.out.println("Логин некорректный");
        } catch (WrongPasswordException e){
            System.out.println("Пароль некорректный");
        }finally {
            System.out.println("Проверка завершена");
        }
    }
}