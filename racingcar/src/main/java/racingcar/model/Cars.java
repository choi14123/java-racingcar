package racingcar.model;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private List<Car> names = new ArrayList<>();

    public Cars(List<String> names) {
        validateDuplication(names);
        List<Car> inputtedCars = convertToCarName(names);
        this.names = inputtedCars;
    }

    private List<Car> convertToCarName(List<String> names) {
        List<Car> inputtedCars = new ArrayList<>();

        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            Car car = new Car(name);
        }
        return inputtedCars;
    }

    private void validateDuplication(List<String> names) {
        for (int i = 0; i < names.size(); i++) {
            List<String> list = names.stream().distinct().toList();
            if (names.size() != list.size()) {
                throw new IllegalArgumentException("이름에 중복이 있습니다.");
            }
        }
    }

    public List<Car> getNames() {
        return names;
    }
}