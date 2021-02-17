package ru.geekbrains;



import java.util.*;

public class MainClass {

    public static void main(String[] args) {
        // task №1
        String[] colors = {"Крокодил", "Заяц", "Медведь", "Лиса", "Муравей", "Заяц", "Лиса",
                "Крокодил", "Медведь", "Заяц", "Медведь", "Черепаха", "Заяц", "Рысь",
                "Черепаха", "Рысь", "Заяц", "Рысь", "Лиса", "Чебурашка"};
        System.out.println("Стартовый массив: " + Arrays.asList(colors));
        Set<String> colorsUnique = new HashSet<>(Arrays.asList(colors));
        System.out.println("Список уникальных слов стартового массива: " + colorsUnique);
        Map<String, Integer> colorsRepeat = new HashMap<>();
        for (String color : colors) {
            if (colorsRepeat.containsKey(color)) {
                colorsRepeat.put(color, colorsRepeat.get(color) + 1);
            } else {
                colorsRepeat.put(color, 1);
            }
        }
        System.out.println("Количество повторов каждого слова: " + colorsRepeat + "\n");


        Phonebook phonebook = new Phonebook();
        phonebook.add("Сергей", "+795543223351");
        phonebook.add("Иван", "+795543223351");
        phonebook.add("Степан", "+795554723351");
        phonebook.add("Фекла", "+795548533351");
        phonebook.add("Глафира", "+795545433351");
        phonebook.add("Ульяна", "+795543252351");
        phonebook.add("Иван", "+795543297551");
        phonebook.add("Степан", "+795543325351");
        phonebook.add("Сергей", "+795544343351");
        phonebook.add("Фекла", "+7955438763351");
        phonebook.add("Ульяна", "+795549873351");
        phonebook.add("Степан", "+795549543351");
        System.out.println(phonebook.get("Фекла"));
        System.out.println(phonebook.get("Ульяна"));
        System.out.println(phonebook.get("Сергей"));
        System.out.println(phonebook.get("Глафира"));
        System.out.println(phonebook.get("Степан"));
    }
}
