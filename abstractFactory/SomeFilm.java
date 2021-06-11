package abstractFactory;

import abstractFactory.englishFilm.EnglishFilmFactory;
import abstractFactory.films.EternalSunshine;
import abstractFactory.films.TheAvangers;
import abstractFactory.films.TheGodFather;
import abstractFactory.russianFilm.RussianFilmFactory;
import abstractFactory.ukrainianFilm.UkrainianFilmFactory;

import java.util.NoSuchElementException;

public abstract class SomeFilm {
    public abstract TheGodFather showTheGodFather();
    public abstract TheAvangers showTheAvangers();
    public abstract EternalSunshine showEternalSunshine();

    public static void chooseFilm(String name, SomeFilm filmLanguage) {
        filmLanguage = new RussianFilmFactory();
        switch (name.toUpperCase()){
            case "THE GODFATHER": filmLanguage.showTheGodFather().showFilm(); break;
            case "THE AVANGERS": filmLanguage.showTheAvangers().showFilm(); break;
            case "ETERNAL SUNSHINE": filmLanguage.showEternalSunshine().showFilm(); break;
            default: throw new NoSuchElementException("No such film");
        }
    }

    public static void showFilm(String name, String language){
        switch (language.toUpperCase()){
            case "UKRAINIAN": chooseFilm(name, new UkrainianFilmFactory()); break;
            case "RUSSIAN": chooseFilm(name, new RussianFilmFactory()); break;
            case "ENGLISH": chooseFilm(name, new EnglishFilmFactory()); break;
            default: throw new NoSuchElementException("No such language");
        }
    }
}


