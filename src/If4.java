public class If4 {
   public static void main(String[] args) {
	   
	   // 문제 5 <최대값 구하기>
       int num1 = 90;
       int num2 = 70;
       int num3 = 100;
      
       // 1번째 방법
       int max;
       if ((num1 >= num2) && num1 >= num3) {max = num1;}
       else if ((num2 >= num1) && num2 >= num3) {max = num2;}
       else {max = num3;}            
       System.out.println (max);
     
       // 2번째 방법
       max = num1;
       if (max <= num2) {max = num2;}
       if(max <= num3) {max = num3;}
       System.out.println (max);
      
       // 3번째 방법
       if (num1 >= num2) {if(num1 >= num3) {max = num1;}}
       else if (num2 >= num1) {if (num2 >= num3) {max = num2;}}
       else {max = num3;}
       System.out.println (max);
       
   }
}
