package com.ll;

import java.util.Scanner;

public class App {

    private Scanner sc;
    public App(Scanner sc) {
        this.sc = sc;
    }

    public void run() {
        System.out.println("== 명언 앱 ==");

        while(true) {
            System.out.print("명령) ");

            String cmd = sc.nextLine().trim();

            switch (cmd) {
                case "종료" :
                    System.out.println("프로그램이 종료되었습니다.");
                    return;
                default:
                    System.out.println("올바르지 않은 명령입니다.");
                    break;
            }
        }
    }


}
