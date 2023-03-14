package ex02;

import java.io.Serializable;

/**
 * Клас, що представляє результат обчислень.
 * Реалізує інтерфейс Serializable для можливості збереження об'єктів в файл.
 */
public class Result implements Serializable {

    /**
     * Значення результату.
     */
    private String value;
    private int argument;
    private int choice;

    /**
     * Конструктор за замовчуванням, що ініціалізує значення результату пустим рядком.
     */
    public Result() {
        value = "";
    }

    /**
     * Метод, що повертає значення результату.
     *
     * @return Значення результату.
     */

    public String getValue() {

        return String.format("Argument %d: %s (%s)", argument, value, getChoiceName());
    }

    public String getArg(){
        return String.format("%s", argument);

    }

    public String getVal(){
        return  String.format("%s", value);

    }

    public String getChoice(){
        return  String.format("%s", getChoiceName());

    }



    private String getChoiceName() {
        return switch (choice) {
            case 1 -> "binary";
            case 2 -> "octal";
            case 3 -> "hexadecimal";
            default -> "unknown";
        };
    }

    /**
     * Метод, що встановлює значення результату.
     *
     * @param value  Нове значення аргументу.
     * @param argument  Вихідний аргумент
     * @param choice Тип перетворення
     */
    public void setValue(String value, int argument, int choice) {
        this.value = value;
        this.argument = argument;
        this.choice = choice;
    }

}