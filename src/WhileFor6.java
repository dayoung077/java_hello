public class WhileFor6 {
   public static void main(String[] args) {
	   
	// <반복 - for> : 1부터 100까지의 수 중 3의 배수들의 합은? (While 사용)
	    
	   int sum = 0;
	      for (int i = 1; i <= 100; i++) {
	         if (i % 3 != 0)
	            sum = sum + i;
	         System.out.println(sum);
	      }
	      //1에서 100까지 3의 배수를 더하는 while 문을 사용하시오
	      int i=1;
	      sum=0;
	      while(i<=100) {
	         if(i%3==0) {
	            sum=sum+i;
	      System.out.println(i);
	      i++;
	         }
	      }
	      
   }
}

	         
     


