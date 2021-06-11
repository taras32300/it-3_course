package abstractFactory;
/*
Разработать систему Кинопрокат. Пользователь мо-
жет выбрать определенную киноленту, при заказе киноленты указывается язык
звуковой дорожки, который совпадает с языком файла субтитров. Система
должна поставлять фильм с требуемыми характеристиками, причем при смене
языка звуковой дорожки должен меняться и язык файла субтитров и наоборот.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Films:\n" +
                "1. Eternal Sunshine\n" +
                "2. The Godfather\n" +
                "3. The Avangers\n" +
                "Choose film name and language: ");
        Scanner scanner = new Scanner(System.in);
        SomeFilm.showFilm(scanner.nextLine(), scanner.nextLine());
    }
}
