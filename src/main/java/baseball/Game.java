package baseball;

import camp.nextstep.edu.missionutils.Console;

import java.util.List;

public class Game {

    public static void play() {
        while (true) {
            System.out.println("숫자 야구 게임을 시작합니다.");
            startGame();
        }
    }

    private static void startGame() {
        Computer computer = new Computer();
        while(true) {
            List<Integer> userNumber = getUserNumber();
            int strikeCount = computer.guessTargetNumber(userNumber);
            if (strikeCount == 3) {
                System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
                break;
            }
        }
    }

    private static List<Integer> getUserNumber() {
        System.out.print("숫자를 입력해주세요 : ");
        String input = Console.readLine();
        List<Integer> userNumber = Utils.convertStringToInteger(input);
        return userNumber;
    }
}
