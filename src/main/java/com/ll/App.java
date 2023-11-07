package com.ll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App
{
    private final Scanner scanner;

    public App(Scanner scanner)
    {
        this.scanner = scanner;
    }

    public void run()
    {
        System.out.println("== 명언 앱 ==");
        int id = 0;
        List<Text_List> 목록 = new ArrayList<>();
        while (true)
        {
            System.out.print("명령) ");
            String cmd = scanner.next();
            if(cmd.equalsIgnoreCase("종료"))
                break;
            if(cmd.equalsIgnoreCase("등록"))
            {
                scanner.nextLine();
                System.out.print("명언 : ");
                String 명언 = scanner.nextLine();
                System.out.print("작가 : ");
                String 작가 = scanner.nextLine();

                id++;
                Text_List text_list = new Text_List(id, 작가, 명언);
                목록.add(text_list);
                System.out.printf("%d번 명언이 등록되었습니다.\n", id);
            }
            if(cmd.equalsIgnoreCase("목록"))
            {
                System.out.println("번호 / 작가 / 명언");
                System.out.println("----------------------");
                for (int i = 목록.size() - 1; i >= 0; i--)
                {
                    Text_List text_list = 목록.get(i);
                    System.out.printf("%d / %s / %s\n", text_list.id, text_list.작가, text_list.명언);
                }
            }
        }

    }
}
