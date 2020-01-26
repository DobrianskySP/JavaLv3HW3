package ru.dobrianskysp.task2;

public class Main {
    public static void main(String[] args) {
        PhoneBook book = new PhoneBook();

        book.saveperson("Добрянский", "+79657851265", "dobriansky.sp@mail.ru");
        book.saveperson("Попов", "+77021234567", "popov.pp@mail.ru");
        book.saveperson("Сидоров", "+79657539565", "Sidorov.ss@mail.ru");
        book.saveperson("Иванов", "+79002587496", "Ivanov.ii@mail.ru");
        book.getnumber("Добрянский");
        book.getnumber("Попов");
        book.getnumber("Иванов");
        book.getnumber("Сидоров");
        book.getnumber("Добрянский");
    }
}
