public class RunnerPrintQuotient{
	public static void main(String [] args){
		Runner RunnerPrac = new Runner();
		PrintQuotientInterface variable = (float a, float b) -> PrintQuotient(a,b);
		variable.PrintQuotient((float)1.2,(float)1.3);
	}
	public static void PrintQuotient(float a, float b){
		System.out.printf("%.3f", a/b );
	}
}