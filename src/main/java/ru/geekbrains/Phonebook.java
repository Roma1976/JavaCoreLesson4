package ru.geekbrains;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Phonebook {

    private final Map<String, ArrayList<String>> phoneBook = new HashMap<>();

    public void add(String lastName, String phoneNumber) {
        ArrayList<String> phoneNumberList = new ArrayList<>();
        if (phoneBook.containsKey(lastName)) {
            phoneNumberList = phoneBook.get(lastName);
            phoneNumberList.add(phoneNumber);
            System.out.println("Абоненту (" + lastName + ") добавлен дополнительный номер: " + phoneNumber);
        } else {
            phoneNumberList.add(phoneNumber);
            phoneBook.put(lastName, phoneNumberList);
            System.out.println("В каталог добавлен новый подписчик. " + lastName + ": " + phoneNumber);
        }
    }

    public String get(String lastName) {
        return "В справочнике подписчик " + lastName + " владеет следующими номерами: " + phoneBook.get(lastName);
    }
}
