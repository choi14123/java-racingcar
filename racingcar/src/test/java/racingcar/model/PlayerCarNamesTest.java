package racingcar.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class PlayerCarNamesTest {
    @Test
    @DisplayName("이름이 6글자 이상이면 예외 발생.")
    void validateLength() {
        //given
        List<String> playerCarNamesList = new ArrayList<>();
        playerCarNamesList.add("choi01");

        //when
        //then
        assertThatThrownBy(() -> new PlayerCarNames(playerCarNamesList)).isInstanceOf(IllegalArgumentException.class);
    }
}
