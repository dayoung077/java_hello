public class CastingMain5 {
// 결과를 예측하고 코딩하시오.
	public static void main(String[] args) {
	   
		boolean bool = true && true;
	      System.out.println(bool);
	      
	      bool =  false && true;
	      System.out.println(bool);
	      
	      bool =  true && false;
	      System.out.println(bool);
	      
	      bool =  true && true &&  false;
	      System.out.println(bool);
	      
	      bool = false && (10 > 0);
	      System.out.println(bool);
	      
	      
	      bool = false || false;
	      System.out.println(bool);
	      
	      bool = false || true;
	      System.out.println(bool);
	      
	      bool = (10 < 0) || (10 > 0);
	      System.out.println(bool);
	      
	      bool = !true;
	      System.out.println(bool);
	      
	      bool = !false;
	      System.out.println(bool);
      
   }
}        