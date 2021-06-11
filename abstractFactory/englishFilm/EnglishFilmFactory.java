package abstractFactory.englishFilm;

import abstractFactory.SomeFilm;
import abstractFactory.films.EternalSunshine;
import abstractFactory.films.TheAvangers;
import abstractFactory.films.TheGodFather;

public class EnglishFilmFactory extends SomeFilm {
    @Override
    public TheGodFather showTheGodFather() {
        return new TheGodFather("The GodFather with English subtittres");
    }

    @Override
    public TheAvangers showTheAvangers() {
        return new TheAvangers("The Avangers with English subtittres");
    }

    @Override
    public EternalSunshine showEternalSunshine() {
        return new EternalSunshine("Eternal Sunshine with English subtittres");
    }
}
