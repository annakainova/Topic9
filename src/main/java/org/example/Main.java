package org.example;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();

        post.birhtday = new FormDate();
        post.birhtday.day = 13;
        post.birhtday.month = 6;
        post.birhtday.year = 1999;

        post.name = "Иван";
        post.passport = "4444 N 44444444";
        post.patronymic = "Иванович";
        post.phone = "+7 (999)-999-99-99";
        post.surname = "Иванов";
        post.subscription = true;
    }
}