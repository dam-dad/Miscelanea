package dad.miscelanea.lambda;

public class Lambda {

	public static void main(String[] args) {
		
//		MiInterfaz mi = new MiInterfaz() {
//			public int sumar(int a, int b) {
//				return a + b;
//			}
//		};
		
		MiInterfaz mi = (a, b) -> a + b;	// >=
		
		System.out.println(mi.sumar(3, 2));

	}

}
