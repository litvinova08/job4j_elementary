package ru.job4j.condition;

public class DummyBot {
    public static String answer(String in) {
        String out = "Это ставит меня в тупик. Задайте другой вопрос.";
        if (in.equals("Привет, Бот.")) {
            out = "Привет, Бот.";
        }
        if (in.equals("Пока.")) {
            out = "До скорой встречи.";
        }
        return out;
    }

    public static void main(String[] args) {
        String practice = DummyBot.answer("Пока.");
        System.out.println(practice);
    }
}

