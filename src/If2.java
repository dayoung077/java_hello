public class If2 {
   public static void main(String[] args) {
	   
	   // 문제 1
	   int num = 23;   
	   if (num % 2 == 0) {System.out.println ("짝수 입니다.");}
	   else {System.out.println ("홀수 입니다.");}
	   
	   // 문제 2
	   num = -1; 
	   if ((num >= 1) && (num <= 100)) {System.out.println (num + "true 입니다.");}
	   else {System.out.println (num + "false 입니다.");}
	   
	   // 문제 3
	   num = 11; 
	   if ((num % 2 == 0) && (num % 3 == 0)) {System.out.println (num + "true 입니다.");}
	   else {System.out.println (num + "false 입니다.");}

   }
}