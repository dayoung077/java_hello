public class WhileFor3 {
   public static void main(String[] args) {
	   
	   // <반복 - for> : 홀수 출력 (13579...99)
	   // 1번째 방법
	   for (int i=1; i<=100; i++) {
		   if (i%2==1) {System.out.println (i);}
	   }

	   // 2번째 방법
	   for (int i=1; i<=100; i=i+2) {System.out.println (i);}
	   
   }
}

