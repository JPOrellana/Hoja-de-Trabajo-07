/**
 * 
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase Main
 * @author Pablo Orellana
 */

public class Main {
    /**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean salir =false;
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> dictArrayList = new ArrayList<String>();
		Dictionary dictionary = new Dictionary();
		try {
			FileReader r = new FileReader("diccionario.txt");
			BufferedReader br = new BufferedReader(r);
			String line;
			while((line=br.readLine())!=null){
				dictArrayList.add(line);
				String[] values = line.split(",");
				dictionary.insertWord(values[0], values[1], values[2]);
			}
			br.close();
		}catch(IOException e) {
			System.out.println("Ha ocurrido una excepcion de tipo IO: "+e);
		}
		while(!salir) {
            int opt =0;
			System.out.println("------------------------------------------")
			System.out.println("------------------ Menú ------------------")
			System.out.println("------------------------------------------")
			System.out.println("- 1. Mostrar Diccionario Ingles-Espanol  -");
			System.out.println("- 2. Mostrar Diccionario Frances-Espanol -");
			System.out.println("- 3. Agregar palabra al diccionario      -");
			System.out.println("- 4. Borrar palabra del diccionario      -");
			System.out.println("- 5. Leer y traducir arhivo              -");
			System.out.println("- 6. Salir                               -");
			System.out.println("------------------------------------------")
			opt = Integer.parseInt(scanner.nextLine());
			switch (opt) {
			case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            }
        }
    }
}
