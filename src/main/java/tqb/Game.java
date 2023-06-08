package tqb;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private String userPick;
    private String computerPick;
    private String result;

    //! máy chọn
    public String getComputerPick() {
        String computerPick = "";
        //! lấy số random từ 1-3
        Random random = new Random();
        int x = random.nextInt(1, 4);

        switch (x) {
            case 1:
                computerPick = "rock";
                break;
            case 2:
                computerPick = "paper";
                break;
            case 3:
                computerPick = "scissor";
                break;
        }
        return computerPick;
    }

    //! người chọn
    public String getUserPick() {
        String userPick = "";
        do {
            System.out.println("Nhấn (1) để chọn rock (đá) \n" +
                    "Nhấn (2) để chọn paper (bao) \n" +
                    "Nhấn (3) để chọn scissor (kéo) \n");
            int x = new Scanner(System.in).nextInt();
            if (x == 1) {
                userPick = "rock";
            } else if (x == 2) {
                userPick = "paper";
            } else if (x == 3) {
                userPick = "scissor";
            } else System.out.println("Bạn nhập sai, vui lòng nhập lại");
        } while (userPick.isEmpty());
        return userPick;
    }

    //! định đoạt kết quả
    public String getResult(String computerPick, String userPick) {
        if (computerPick.equals(userPick)) {
            return "Kết quả hòa";
        } else if (userPick.equals("rock") && computerPick.equals("scissor")) {
            return "Bạn đã thắng";
        } else if (userPick.equals("paper") && computerPick.equals("rock")) {
            return "Bạn đã thắng";
        } else if (userPick.equals("scissor") && computerPick.equals("paper")) {
            return "Bạn đã thắng";
        } else return "Bạn đã thua";
    }
}
