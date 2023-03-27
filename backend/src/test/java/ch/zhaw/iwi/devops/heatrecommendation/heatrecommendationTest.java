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
    
}
