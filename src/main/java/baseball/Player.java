package baseball;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {
    private static final Scanner scanner = new Scanner(System.in);

    public Player() {
    }

    public List<Integer> inputNumber() {
        while(true) {
            System.out.print("숫자를 입력하세요: ");
            String input = Console.readLine();

            if (input.length() != 3 || !input.matches("[1-9]+")) {
                System.out.println("잘못된 입력입니다. 1부터 9까지의 서로 다른 3자리 숫자를 입력해주세요.");
                continue;
            }

            List<Integer> numbersList = new ArrayList<>();
            for (char c : input.toCharArray()) {
                int num = Character.getNumericValue(c);
                if (numbersList.contains(num)) {
                    System.out.println("중복된 숫자가 있습니다. 다시 입력하세요.");
                    break;
                }
                numbersList.add(num);
            }
            if (numbersList.size() != 3) {
                continue;
            }

            return numbersList;
        }
    }

    public void gameStart() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    public void gameEnd() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    public int reGame() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String input = Console.readLine();
        return Integer.parseInt(input.trim());
    }
}
