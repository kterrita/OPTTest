package phone;

import java.util.*;

/**
 * Created by илья on 12.12.2016.
 */
public class PhoneBookSolution {
    private static HashMap<String, List<String>> phoneBook = new HashMap<String, List<String>>();

    static {
        phoneBook.put("Иванов И.И.", Arrays.asList("+8 800 2000 500", "+8 800 200 600"));
        phoneBook.put("Петров П.П.", Arrays.asList("+8 800 2000 700"));
        phoneBook.put("Сидоров С.С.", Arrays.asList("+8 800 2000 800", "+8 800 2000 900", "+8 800 2000 000"));
    }

    public static void main(String[] args) throws Exception {
        try {
            /*
            в задании написано:
            "На вход программе подается ФИО"
            Поэтому задал ФИО в аргументах программы.
             */
            printNumbers(args[0]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Данный пользователь отсутствует в базе данных или вы ввели ФИО пользователя неверно.");
        }
    }

    //вывод в консоль номеров заданного абонента
    private static void printNumbers(String name) {
        boolean exist = false;
        for (Map.Entry<String, List<String>> pair : phoneBook.entrySet()) {
            if (pair.getKey().equals(name)) {
                for (int i = 0; i < pair.getValue().size(); i++) {
                    System.out.println((i + 1) + ". " + pair.getValue().get(i));
                }
                exist = true;
            }
        }
        if (!exist) {
            //если это необходимо, могу создать и свой exception
            throw new ArrayIndexOutOfBoundsException();
        }
    }

}
