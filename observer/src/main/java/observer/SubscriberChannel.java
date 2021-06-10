package observer;

public class SubscriberChannel implements Subscriber {
    private String news;

    public void setNews(String news) {
        this.news = news;
    }

    @Override
    public void update(String news) {
        this.setNews(news);
    }

    @Override
    public String show() {
        return "Gotten news: " + news;
    }
}