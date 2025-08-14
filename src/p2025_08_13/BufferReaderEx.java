package src.p2025_08_13;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * 키보드로 입력 받은 숫자로 구구단 출력
 * BufferReader 클래스 사용
 */

public class BufferReaderEx {
  public static void main(String[] args) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("구구단을 출력할 숫자를 입력 (1~9): ");
    String in = null;
    
    try {
      in = br.readLine();
    } catch (Exception e) {
      e.printStackTrace();
    }

    int dan = Integer.parseInt(in);

    for (int i = 1; i < 10; i++) {
      System.out.println(dan + " X " + i + " = " + (dan * i));
    }
  }
}
