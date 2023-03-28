package ch.zhaw.iwi.devops.heatrecommendation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class heatrecommendationTest {

    @Test
    public void heatrecommendation1() {

        heatrecommendation heatrecommender = new heatrecommendation();
        Assertions.assertEquals("1", heatrecommender.recommendationheat1(1));

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
        Assertions.assertEquals("Das funktioniert nicht", heatrecommender.recommendationheat1(35));
    }

}
