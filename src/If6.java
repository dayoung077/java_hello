public class If6 {
   public static void main(String[] args) {
	   // 문제 7
	   
       int num1 = 2;
       int num2 = 4;
       int num3 = 1;
      
       //조건 연산자
       int result = true ? 1 : 0;
       System.out.println (result);
       
       result = false ? 1 : 0;
       System.out.println (result);
       
       result = (1 > 10) ? 1 : 0;
       System.out.println (result);
       
       result = (1 < 10) ? 1 : 0;
       System.out.println (result);
       
       boolean bool = (1 > 10) ? true : false;
       System.out.println (bool);
       
       bool = (1 < 10) ? true : false;
       System.out.println (bool);
   }
}

