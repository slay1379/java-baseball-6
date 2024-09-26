package baseball;

import java.util.List;

public class Judgment {
    private int ball;
    private int strike;

    public Judgment() {
        this.ball = 0;
        this.strike = 0;
    }

    public int getBall() {
        return ball;
    }

    public int getStrike() {
        return strike;
    }

    public void init(){
        this.ball = 0;
        this.strike = 0;
    }

    public void judgmentNumber(List<Integer> playerNumber, List<Integer> computerNumber) {
        init();
        for (int i = 0; i < 3; i++) {
            if (playerNumber.get(i).equals(computerNumber.get(i))){
                strike++;
            }
        }

        if (strike == 3) {
            return;
        }

        int total = 0;
        for (int i = 0; i < 3; i++){
            if (playerNumber.contains(computerNumber.get(i)) && !playerNumber.get(i).equals(computerNumber.get(i))) {
                ball++;
            }
        }

    }

    public void getResult() {
        if (ball > 0) {
            System.out.println(ball + "볼 ");
        }
        if (strike > 0) {
            System.out.println(strike + "스트라이크");
        }
        if ((ball == 0) && (strike == 0)){
            System.out.println("낫싱");
        }
    }
}
