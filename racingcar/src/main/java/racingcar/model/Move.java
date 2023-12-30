package racingcar.model;

import java.util.Random;

public class Move {
    Random random = new Random();

    private int position = 0;


    public int moveForward() {
        int randomNumber = random.nextInt(10);
        if (randomNumber >= 4) {
            position++;
        }
        return position;
    }

    public int moveForward(int number) {
        if (number >= 4) {
            position++;
        }
        return position;
    }

    public int getPosition() {
        return position;
    }
}