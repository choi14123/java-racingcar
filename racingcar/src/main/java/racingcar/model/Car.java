package racingcar.model;

public class Car {
    private String name;

    public Car(String name) {
        validateLength(name);
        this.name = name;
    }


    private void validateLength(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("이름이 6글자 이상입니다.");
        }
    }

    public String getName() {
        return name;
    }
}