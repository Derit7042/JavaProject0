package kr.excel.example;

import kr.excel.entity.MemberVO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExcelWriter {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        List<MemberVO> members = new ArrayList<>();

        while (true) {
            System.out.print("이름을 입력하세요:");
            String name = scanner.nextLine();
            if (name.equals("quit")) {
                break;
            }

            System.out.print("나이를 입력하세요:");
            int age = scanner.nextInt();
            scanner.nextLine(); // 개행문자 제거

            System.out.print("생년월일을 입력하세요:");
            String birthdate = scanner.nextLine();

            System.out.print("전화번호를 입력하세요:");
            String phone = scanner.nextLine();

            System.out.print("주소를 입력하세요:");
            String address = scanner.nextLine();

            System.out.print("결혼여부를 입력하세요 (true/false):");
            boolean isMarried = scanner.nextBoolean();
            scanner.nextLine(); // 개행문자 제거

            MemberVO member = new MemberVO(name, age, birthdate, phone, address, isMarried);
            members.add(member);
        }
        scanner.close();

        
    }
}
