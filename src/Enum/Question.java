package Enum;

import java.util.Random;

public class Question {
    Random random = new Random();

    Answer answer() {
        int prob = (int) (100 * random.nextDouble());
        if (prob < 15)
            return Answer.MAYBE;
        else if (prob < 30)
            return Answer.NO;
        else if (prob < 60)
            return Answer.YES;
        else if (prob < 75)
            return Answer.LATER;
        else if (prob < 90)
            return Answer.SOON;
        else return Answer.NEVER;
    }

}
