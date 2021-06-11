package abstractFactory.films;

import abstractFactory.Film;
import abstractFactory.FilmData;

public class EternalSunshine extends FilmData implements Film {
    public EternalSunshine(String subtittres) {
        super(subtittres);
    }

    @Override
    public void showFilm() {
        System.out.println(subtittres);
    }
}
