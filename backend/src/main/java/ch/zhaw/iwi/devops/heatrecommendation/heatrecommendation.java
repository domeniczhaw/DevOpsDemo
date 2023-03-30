package ch.zhaw.iwi.devops.heatrecommendation;

public class heatrecommendation {

	static String recommendationheat1(int nummer){
        if (nummer<=30){
            if (nummer<=12){
                return "Du solltest eine dicke Jacke anziehen";
            } else if (nummer>12 && nummer<=20){
                return "Eine leichte Jacke sollte genügen";
            } else if (nummer>20) {
                return "Du brauchst keine Jacke anzuziehen";
            }
            return String.valueOf(nummer);
        }
         
    
        if (nummer>30){
            if (nummer>30 && nummer<40) {
                return "Du solltest dringend etwas drinken!";
            } else if (nummer>=40) {
            return "Du solltest kalt duschen!";
            }
            return String.valueOf(nummer);
        }
        return String.valueOf(nummer);
    }
}


