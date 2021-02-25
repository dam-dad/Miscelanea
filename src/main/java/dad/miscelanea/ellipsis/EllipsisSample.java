package dad.miscelanea.ellipsis;

public class EllipsisSample {

	public static void test(String fijo, Double cadenas, Integer ... multiple) {
		System.out.println(fijo);
		System.out.println(multiple.length);
		for (Integer n : multiple) {
			System.out.println(n);
		}
	}
	
	public static void main(String[] args) {
		test("hola", 4.5, 3, 44, 765);
		test("adios", 3.14, new Integer[] {3 ,34, 5});
	}

}
