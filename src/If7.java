public class If7 {
   public static void main(String[] args) {
	   // 문제 8 <화폐 구하기>
	   int money = 126500;
	   int m50000, m10000, m5000, m1000, m500, m100;
	   
	   int tMoney;
	   
	   m50000 = 126500 / 50000;
	   tMoney= 126500 % 50000; // money -(m50000*50000)
	   
	   m10000 = 126500 / 10000;
	   tMoney= 126500 % 10000; // money -(m10000*10000)
	   
	   m5000 = 126500 / 5000;
	   tMoney= 126500 % 5000; // money -(m5000*5000)
	   
	   m1000 = 126500 / 1000;
	   tMoney= 126500 % 1000; // money -(m1000*1000)
	   
	   m500 = 126500 / 500;
	   tMoney= 126500 % 500; // money -(m500*500)
	   
	   m100 = 126500 / 100;
	   tMoney= 126500 % 100; // money -(m100*100)
	   
	   System.out.println ("오만원" + m50000 + "장");
	   System.out.println ("만원" + m10000 + "장");
	   System.out.println ("오천원" + m5000 + "장");
	   System.out.println ("천원" + m1000 + "장");
	   System.out.println ("오백원" + m500 + "장");
	   System.out.println ("백원" + m100 + "장");
      
   }
}

