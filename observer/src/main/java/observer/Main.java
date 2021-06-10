package observer;
/*
Паттерн Observer. Разработать систему Почтовое отделение. Из издатель-
ства в почтовое отделение поступают издаваемые газеты и журналы.
Почтовое отделение отправляет полученные печатные издания соответст-
вующим подписчикам.
 */

public class Main {
    public static void main(String[] args) {
        Mail mail = new Mail();
        for (int i = 0; i < 10; i++) {
            mail.addSubscriber(new SubscriberChannel());
        }
        mail.sendNews("The summer has begun");

        for (String str: mail.showNews()) {
            System.out.println(str);
        }
    }
}