public class CompAssignOp {
   public static void main(String[] args) {
	   
	   short num = 10;
	   num = (short) (num +77L); // 형 변환 안 하면 컴파일 오류 발생한다.
	   
	   int rate = 3;
	   rate =  (int) (rate * 3.5); // 형 변환 안 하면 컴파일 오류 발생한다.
	   
	   System.out.println(num);
	   System.out.println(rate);
	   
	   num = 10;
	   num += 77L; // 형 변환이 필요하지 않다. (num = num + 77L)
	   
	   rate = 3;
	   rate *= 3.5; // 형 변환이 필요하지 않다.
	   
	   System.out.println(num);
	   System.out.println(rate);
	  
   }
}