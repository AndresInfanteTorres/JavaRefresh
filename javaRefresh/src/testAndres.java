
import java.util.Arrays;

class testAndres {

	private static String describirArreglo(int[] arr) {

		boolean asc = true, des = true;
		int band1 = 1, band2 = 0, band3 = 0;

		for (int i = 0; i + 1 < arr.length; i++) {
			if (arr[i] < arr[i + 1]) {
				des = false;
				band2 = 1;
			}
			if (arr[i] > arr[i + 1]) {
				asc = false;
				band3 = 1;
			}
			if (arr[i] == arr[i + 1]) {
				band1 += 1;
			}
		}

		if (asc & (des == false)) {

			return "ascendiente";
		}
		if (des & (asc == false)) {
			return "descendiente";
		}
		if (band1 == arr.length) {
			return "Todos son iguales";
		}
		if ((band2 & band3) == 1) {
			return "Desordenados";
		}

		return null;
	}

	private static void ordenarArreglo(int[] arr) {

		for (int i = 0; i < arr.length - 1; ++i) {
			for (int j = i + 1; j < arr.length; ++j) {
				if (arr[i] < arr[j]) {
					int aux = arr[i];
					arr[i] = arr[j];
					arr[j] = aux;
				}
			}
		}

	}

	private static String palindromo(String word) {
		int size = (word.length()) / 2;
		char[] wordarray = word.toCharArray();
		int band = 0;
		int j = word.length() - 1;
		for (int i = 0; i < size; i++) {
			if (wordarray[i] != wordarray[j]) {
				return "no palindromo";
			}
			j -= 1;
			band += 1;
		}
		if (band == size) {
			return "palindromo";
		}
		return null;
	}
	
	private static String tipoCadena(String cadena) {
		
		char[] arreglo=cadena.toCharArray();
		
		
		
		return null;
	}
	private static boolean numero(char x) {
		String numeros ="0123456789";
		char [] arrNumeros= numeros.toCharArray();
		for (int i=0;i<10;i++) {
			if (x==arrNumeros[1]) {
				return true;
			}
			break;
		}
		return false;
	}
	
	private static long recursivefunction(int num) {
		if(num>1) {
			return num * recursivefunction(num -1);
			
		}
		else
			return 1;
		
		
	}
	private static void emptySpaces(String givenString) {
		int positions[] = new int[givenString.length()];
		int band=0;
		for (int i=0;i<givenString.length();i++) {
			if(givenString.charAt(i) == ' ') {
				positions[band]=i;
				band+=1;
			}
			
		}
		
		System.out.println("The String "+ " * " +givenString + " * " +"has spaces in this positions: ");
		for (int i=0;i<=band;i++) {
			if(positions[i]!=0) {
				System.out.println(positions[i]);
			}
			
		}
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("andy");
		int[] arr = { 1, 2, 2, 2, 2, 22, 4, 10, 4, 22, 22, 22, 3 };
		System.out.println(describirArreglo(arr));

		int[] arr1 = { 3, 2, 1 };
		System.out.println(describirArreglo(arr1));

		int[] arr2 = { 1, 1, 1, 1 };
		System.out.println(describirArreglo(arr2));

		int[] arr3 = { 1, 2, 3, 1 };
		System.out.println(describirArreglo(arr3));

		// lamdo al metodo ordenar arreglo

		System.out.println(Arrays.toString(arr));

		// llamada a la funcion que determina si es un palindromo

		System.out.println(palindromo("alle"));
		System.out.println(palindromo("alla"));
		System.out.println(palindromo("allas"));
		System.out.println(palindromo("alsla"));
		System.out.println(palindromo("amor a roma"));
		
		System.out.println("validando funcion numero");
		System.out.println(numero('3'));
		System.out.println(numero('5'));
		
		//call to recursive function
		System.out.println("Recursive method to do the factorial of a number");
		System.out.println(recursivefunction(4));
		
		//call a method to check empty spaces
		String andy="Andres esta programando";
		System.out.println("Call of metohd to check empty spaces");
		emptySpaces(andy);

	}

}