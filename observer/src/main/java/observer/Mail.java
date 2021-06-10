package observer;

import java.util.ArrayList;
import java.util.List;

public class Mail {
    private String news;
    private List<Subscriber> subscribers = new ArrayList<Subscriber>();

    public void addSubscriber(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber) {
        this.subscribers.remove(subscriber);
    }

    public String[] showNews(){
        String[] everySubscriberNews = new String[subscribers.size()];
        int i = 0;
        for (Subscriber subscriber: subscribers){
            everySubscriberNews[i++] = subscriber.show();
        }
        return everySubscriberNews;
    }

    public void sendNews(String news) {
        this.news = news;
        for (Subscriber subscriber : this.subscribers) {
            subscriber.update(this.news);
        }
    }
}