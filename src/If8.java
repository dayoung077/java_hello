public class If8 {
   public static void main(String[] args) {
	   // 문제 9 <화폐 구하기>
	   int money = 126500;
	   int m50000, m10000, m5000, m1000, m500, m100;
	   
	   int num = 5;
	   
	   if (num >= 5) {num = 10;}
	   else {num = 20;}
       System.out.println (num);
      
      int result = (num >= 5) ? 10 : 20;
      System.out.println (result);
      
   }
}

