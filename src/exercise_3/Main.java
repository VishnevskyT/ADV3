package exercise_3;

/**
 * Завдання 3
 * Необхідно створити рядок із текстом (текст взяти будь-який з інтернету). Розбити цей рядок на 2 підрядки рівної
 * довжині та вивести на екран кожну речення з нового рядка.
 */

public class Main {
    public static void main(String[] args) {

        String blue = "\u001B[34m";
        String purple = "\u001B[35m";
        String green = "\u001B[32m";
        String cyan = "\u001B[36m";
        String yellow = "\u001B[33m";
        String red = "\u001B[31m";

        String str = "Turmoil has engulfed the Galactic Republic. The taxation of trade routes" +
                " to outlying star systems is in dispute. Hoping to resolve the matter with a blockade of deadly " +
                "battleships, the greedy Trade Federation has stopped all shipping to the small planet of Naboo. " +
                "While the congress of the Republic endlessly debates this alarming chain of events, the Supreme " +
                "Chancellor has secretly dispatched two Jedi Knights, the guardians of peace and justice in the " +
                "galaxy, to settle the conflict…";

        System.out.println(blue + str);
        String str1 = str.substring(0, str.length()/2);
        String str2 = str.substring(str.length()/2);
        System.out.println(purple + str1);
        System.out.println(green + str2);
        System.out.println(cyan + "Довжина першого підрядка: " + str1.length() + "\nДовжина другого підрядка: " + str2.length());
        System.out.println(blue + "Вивід речень підрядків з нового нового рядка:");
        System.out.println(yellow.concat(str1.replace(". ", ".\n")));
        System.out.println(red.concat(str2.replace(". ", ".\n")));

    }
}
