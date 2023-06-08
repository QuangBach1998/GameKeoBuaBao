package tqb;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Game game = new Game();
            String computerPick = game.getComputerPick();
            String userPick = game.getUserPick();
            String ketqua = game.getResult(computerPick, userPick);
            System.out.println("Máy chọn : " + computerPick);
            System.out.println("Bạn chọn : " + userPick);
            System.out.println(ketqua);

            //! chạy liên tục đến khi người chơi không bấm (y)
            System.out.println("Bấm (y) để tiếp tục chơi, bấm phím bất kỳ để thoát");
            String y = new Scanner(System.in).nextLine();
            if (!y.equalsIgnoreCase("y")) {
                break;
            }
        }
    }
}