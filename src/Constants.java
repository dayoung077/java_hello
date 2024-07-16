// < 이름 짓는 법 >
// 1. 낙타 표기법 (camel case) -> 클래스 이름, 변수
// 2. 뱀 표기법 (snake case) -> 상수 이름

// < 변수와 상수 차이 >     

public class Constants {
   public static void main(String[] args) {

	   final int MAX_SIZE = 100;
	   final char CONST_CHAR = '상';
	   final int CONST_ASSIGNED;
	   
	   CONST_ASSIGNED = 12;
	   
      System.out.println("상수1 : " + MAX_SIZE);
      System.out.println("상수2 : " + CONST_CHAR);
      System.out.println("상수3 : " + CONST_ASSIGNED);
   }
}