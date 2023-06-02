package ch.zhaw.iwi.devops.heatrecommendation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class heatrecommendationTest {

    @Test
    public void heatrecommendation1() {

        heatrecommendation heatrecommender = new heatrecommendation();
        Assertions.assertEquals("Du solltest eine dicke Jacke anziehen", heatrecommender.recommendationheat1(1));

    }

    @Test
    public void heatrecommendation2() {

        heatrecommendation heatrecommender = new heatrecommendation();
        Assertions.assertEquals("Du solltest eine dicke Jacke anziehen", heatrecommender.recommendationheat1(5));

    }

    @Test
    public void heatrecommendation3() {

        heatrecommendation heatrecommender = new heatrecommendation();
        Assertions.assertEquals("Eine leichte Jacke sollte genügen", heatrecommender.recommendationheat1(15));

    }

    @Test
    public void heatrecommendation4() {

        heatrecommendation heatrecommender = new heatrecommendation();
        Assertions.assertEquals("Du brauchst keine Jacke anzuziehen", heatrecommender.recommendationheat1(25));

    }

    @Test
    public void heatrecommendation5() {

        heatrecommendation heatrecommender = new heatrecommendation();
        Assertions.assertEquals("Du solltest dringend etwas drinken!", heatrecommender.recommendationheat1(35));
    }

    @Test
    public void heatrecommendation6() {

        heatrecommendation heatrecommender = new heatrecommendation();
        Assertions.assertEquals("Du solltest dringend etwas drinken!", heatrecommender.recommendationheat1(37));
    }

    @Test
    public void heatrecommendation7() {

        heatrecommendation heatrecommender = new heatrecommendation();
        Assertions.assertEquals("Du solltest kalt duschen!", heatrecommender.recommendationheat1(41));
    }

    @Test
    public void heatrecommendation8() {

        heatrecommendation heatrecommender = new heatrecommendation();
        Assertions.assertEquals("Du solltest eine dicke Jacke anziehen", heatrecommender.recommendationheat1(8));

    }

    @Test
    public void heatrecommendation9() {

        heatrecommendation heatrecommender = new heatrecommendation();
        Assertions.assertEquals("Eine leichte Jacke sollte genügen", heatrecommender.recommendationheat1(18));

    }

    @Test
    public void heatrecommendation10() {

        heatrecommendation heatrecommender = new heatrecommendation();
        Assertions.assertEquals("Du brauchst keine Jacke anzuziehen", heatrecommender.recommendationheat1(28));

    }

    @Test
    public void heatrecommendation11() {

        heatrecommendation heatrecommender = new heatrecommendation();
        Assertions.assertEquals("Du solltest dringend etwas drinken!", heatrecommender.recommendationheat1(39));
    }

    @Test
    public void heatrecommendation12() {

        heatrecommendation heatrecommender = new heatrecommendation();
        Assertions.assertEquals("Du solltest kalt duschen!", heatrecommender.recommendationheat1(45));
    }

    @Test
    public void heatrecommendation13() {

        heatrecommendation heatrecommender = new heatrecommendation();
        Assertions.assertEquals("Du solltest kalt duschen!", heatrecommender.recommendationheat1(70));
    }
    @Test
    public void heatrecommendation14() {

        heatrecommendation heatrecommender = new heatrecommendation();
        Assertions.assertEquals("Du solltest kalt duschen!", heatrecommender.recommendationheat1(45));
    }

}