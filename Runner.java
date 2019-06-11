public class Runner{
    public static void main(String [] args){
    	PrintQuotientInterface variable = (float a, float b) -> PrintQuotient(a,b);
		variable.PrintQuotient((float)1.2,(float)1.3);

		PerfectSquare ps = (int perfectSquare) -> {
			for(int x = 0;x<perfectSquare;x++){
				if(x*x == perfectSquare)
					return true;
		}
		return false;};
	System.out.println(ps.perfectSquare(25));

    }
   	public static void PrintQuotient(float a, float b){
   		System.out.printf("%.3f", a/b );
	}
}