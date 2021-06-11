package abstractFactory.films;

import abstractFactory.Film;
import abstractFactory.FilmData;

public class TheGodFather extends FilmData implements Film {
    public TheGodFather(String subtittres) {
        super(subtittres);
    }

    @Override
    public void showFilm() {
        System.out.println(subtittres);
    }
}
