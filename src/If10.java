public class If10 {
   public static void main(String[] args) {
	   // 문제 10
	   int kor = 90;
	   int eng = 100;
	   int math = 70;
	   int max;
	   
	   // max = kor;
	   
	   max = (kor <= eng) ? eng : kor;
	   max = (max <= math) ? math : max;
	   
	   max = (kor > eng)? (kor > math ? kor : math) : (eng > math ? eng :math);
	   
	   System.out.println (max);

       
   }
}

