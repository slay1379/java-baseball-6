package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.*;

public class Computer {
    private final List<Integer> numbers;

    public Computer() {
        this.numbers = generateRandomNumbers();
    }

    public List<Integer> generateRandomNumbers() {
        Set<Integer> uniqueNumbers = new HashSet<>();

        while (uniqueNumbers.size() < 3) {
            int number = Randoms.pickNumberInRange(1, 9);
            uniqueNumbers.add(number);
        }

        return new ArrayList<>(uniqueNumbers);
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
