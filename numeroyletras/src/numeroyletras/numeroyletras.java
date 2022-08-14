package numeroyletras;

import java.util.Arrays;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class numeroyletras{
	public static void main(String[] args) {
        List<List<Character>> letras = Arrays.asList(
                Arrays.asList(),
                Arrays.asList(),
                Arrays.asList('A', 'B', 'C'),//2 devuelve un tipo List cuando se le invoca pasándole un array como parámetro.
                Arrays.asList('D', 'E', 'F'),//3
                Arrays.asList('G', 'H', 'I'),//4
                Arrays.asList('J', 'K', 'L'),//5
                Arrays.asList('M', 'N', 'O'),//6
                Arrays.asList('P', 'R', 'S'),//7
                Arrays.asList('T', 'U', 'V'),//8
                Arrays.asList('W', 'X', 'Y')//9
        );
 
        int[] numeros = {8,6,6,2,6,6,5};
 
        System.out.println(combinations(letras,numeros));
    }

	    public static void findCombinations(List<List<Character>> letras, int[] numeros, Set<String> combinations, String result, int index)
	    {
	        if (index == -1) {
	            combinations.add(result+"\n");
	            return;
	        }
	 
	        int digit = numeros[index];
	        // uno por uno, reemplaza el dígito con cada carácter en el correspondiente
	        // enumerar y repetir para el siguiente dígito
	        for (char c : letras.get(digit)) {
	            findCombinations(letras, numeros, combinations, c + result, index - 1 );
	        }
	    }
	 
	    public static Set<String> combinations(List<List<Character>> letras, int[] numeros) {
	 
	         Set<String> combinations = new HashSet<>(); //determinar fácil y rápidamente si un objeto ya está en el conjunto o no
	 
	      // entrada inválida - devuelve un conjunto vacío
	        if (letras == null || letras.size() == 0 || numeros == null || numeros.length == 0) {
	            return combinations;
	        }
	     // busca y devuelve todas las combinaciones
	        findCombinations(letras, numeros, combinations, "", numeros.length - 1);
	        return combinations;
	    }
	 
	    
	}