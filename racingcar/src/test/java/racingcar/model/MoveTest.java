package racingcar.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MoveTest {
    @Test
    @DisplayName("숫자가 4 이상이면 전진한다.")
    void randomNumberMove() {
        //given
        Move move = new Move();
        move.moveForward(4);
        //when

        //then
        Assertions.assertThat(move.getPosition()).isEqualTo(1);
    }
}
