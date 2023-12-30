package racingcar.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;


public class CarsTest {
    @Test
    @DisplayName("이용자의 이름에 중복이 있으면 안된다.")
    void setPlayersNames(){
        //given
        List<String> names = Arrays.asList("pobi", "prank", "crong", "crong");
        //when

        //then
        Assertions.assertThatThrownBy(() -> new Cars(names)).isInstanceOf(IllegalArgumentException.class);
    }
}
