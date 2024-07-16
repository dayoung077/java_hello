public class WhileFor5 {
   public static void main(String[] args) {
	   
	   // <반복 - for> : 1부터 100까지의 수 중 3의 배수들의 합은?
	      int sum = 0;
	      for (int i = 1; i <= 100; i++) {
	         if (i % 3 != 0)
	            sum = sum + i;
	         System.out.println(sum);
	      }
	      System.out.println("3이 아닌 수들의 합은 :" + sum);
	   
   }
}

