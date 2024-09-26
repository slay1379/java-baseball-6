package baseball;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        Player player = new Player();
        Computer computer = new Computer();
        Judgment judgment = new Judgment();

        player.gameStart();
        List<Integer> computerNumber = computer.getNumbers();
        while (true){
            List<Integer> playerNumbers = player.inputNumber();
            judgment.judgmentNumber(playerNumbers,computerNumber);
            judgment.getResult();

            if (judgment.getStrike() == 3) {
                player.gameEnd();
                while (true) {
                    int reGame = player.reGame();
                    if (reGame == 1) {
                        computer = new Computer();
                        computerNumber = computer.getNumbers();
                        break;
                    }
                    if (reGame == 2) {
                        return;
                    }
                    if ((reGame != 1) && (reGame != 2)) {
                        System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
                    }
                }
            }
        }
    }
}
