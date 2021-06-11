package abstractFactory.ukrainianFilm;

import abstractFactory.SomeFilm;
import abstractFactory.films.EternalSunshine;
import abstractFactory.films.TheAvangers;
import abstractFactory.films.TheGodFather;

public class UkrainianFilmFactory extends SomeFilm{
    @Override
    public TheGodFather showTheGodFather() {
        return new TheGodFather("The GodFather with Ukrainian subtittres");
    }

    @Override
    public TheAvangers showTheAvangers() {
        return new TheAvangers("The Avangers with Ukrainian subtittres");
    }

    @Override
    public EternalSunshine showEternalSunshine() {
        return new EternalSunshine("Eternal Sunshine with Ukrainian subtittres");
    }


}
