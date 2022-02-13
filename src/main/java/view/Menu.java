package view;

import java.util.Arrays;

public interface Menu {
    void show();

    void exit();

    default void showItems(String[] items) {
        clearConsole();
        for (String item : items) {
            System.out.println("-------------");
            System.out.println(item);
        }
    }
    static void clearConsole () {
        char c = '\n';
        int length = 25;
        char[] chars = new char[length];
        Arrays.fill(chars, c);
        System.out.print(String.valueOf(chars));
    }
}
