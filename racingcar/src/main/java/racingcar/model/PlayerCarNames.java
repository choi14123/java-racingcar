package racingcar.model;

import java.util.ArrayList;
import java.util.List;

public class PlayerCarNames {
    List<String> playerCarNamesList = new ArrayList<>();

    public PlayerCarNames(List<String> playerCarNamesList) {
        validateLength(playerCarNamesList);
        this.playerCarNamesList = playerCarNamesList;
    }

    private void validateLength(List<String> playerCarNamesList) {
        for (int i = 0; i < playerCarNamesList.size(); i++) {
            if (playerCarNamesList.get(i).length() >= 6) {
                throw new IllegalArgumentException();
            }
        }
    }
}