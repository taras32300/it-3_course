package abstractFactory.russianFilm;

import abstractFactory.SomeFilm;
import abstractFactory.films.EternalSunshine;
import abstractFactory.films.TheAvangers;
import abstractFactory.films.TheGodFather;

public class RussianFilmFactory extends SomeFilm {
    @Override
    public TheGodFather showTheGodFather() {
        return new TheGodFather("The GodFather with Russian subtittres");
    }

    @Override
    public TheAvangers showTheAvangers() {
        return new TheAvangers("The Avangers with Russian subtittres");
    }

    @Override
    public EternalSunshine showEternalSunshine() {
        return new EternalSunshine("Eternal Sunshine with Russian subtittres");
    }
}
