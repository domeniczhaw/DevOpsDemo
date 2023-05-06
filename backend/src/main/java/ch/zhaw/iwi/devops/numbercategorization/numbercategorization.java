package ch.zhaw.iwi.devops.numbercategorization;
import 

public class numbercategorization {
    public static int getCategory(int number) {
        int category;
        if (number < 0) {
            category = -1;
        } else if (number >= 0 && number <= 10) {
            category = 1;
        } else if (number > 10 && number <= 100) {
            category = 2;
        } else {
            category = 3
        }
        return category;
    }
    k
}
}
    
