package abstractFactory.films;

import abstractFactory.Film;
import abstractFactory.FilmData;

public class TheAvangers extends FilmData implements Film {
    public TheAvangers(String subtittres) {
        super(subtittres);
    }

    @Override
    public void showFilm() {
        System.out.println(subtittres);
    }
}
