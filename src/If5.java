public class If5 {
   public static void main(String[] args) {
	   // 문제 6 <중간값 구하기>
	   
       int num1 = 5;
       int num2 = 7;
       int num3 = 6;
      
       if ((num2 < num1 && num1 <num3) || (num3 < num1 && num1 < num2))    
          System.out.println("중간값은" + num1 + "입니다.");
       else if ((num1 < num2 && num2 < num3) || (num3 < num2 && num2 < num1))  
          System.out.println ("중간값은" + num2 + "입니다.");
       else 
          System.out.println ("중간값은" + num3 + "입니다.");
       
   }
}

