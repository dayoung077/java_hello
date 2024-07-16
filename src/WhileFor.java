public class WhileFor {
   public static void main(String[] args) {
	   
	   // <반복 - for> : 1부터 100까지의 합 (1+2+3+...+100=5050)
	   int sum = 0;
	   for (int i=1; i<=100; i++) {
		      sum = sum + i; // sum += i;
		      System.out.println (i + ":합:" + sum);
		   }

   }
}

