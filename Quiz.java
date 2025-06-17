
         
        //Escribe un programa que sea un pequeño juego trivial de acertar preguntas
        //Cada pregunta tendrá 4 opciones que el usuario podrá escoger
        //Por cada respuesta correcta, añade 5 puntos al puntaje
        //Al finalizar el juego imprime cual fue tu puntaje /20
        //Si el puntaje es 15 o más, imprime: Tú si que sabes mucho
        //Si el puntaje es menor de 15 pero mayor o igual a 5, imprime: No lo has hecho mal
        //De lo contrario imprime: Buena suerte la próxima vez
        //Las opciones a, b, c y d de cada pregunta, deberán dejar en terminal un espacio de sangría, averigua como hacerlo en java

        //Preguntas:
        import java.util.Scanner;

        public class Quiz {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int puntaje = 0;
        
                System.out.println("¡Bienvenido al Quiz de Mujeres en la Historia!\n");
        
                System.out.println("1. ¿Quién fue la hacker que escribió en 1994 *Hacking the Wetware*?");
                System.out.println("\ta. Ada Lovelace");
                System.out.println("\tb. Jude Milhon");
                System.out.println("\tc. Martha Ackelsberg");
                System.out.println("\td. Jane Jacobs");
                System.out.print("Tu respuesta: ");
                char r1 = scanner.next().toLowerCase().charAt(0);
                if (r1 == 'b') puntaje += 5;
        
                System.out.println("\n2. ¿Quién es Fuencisla Clemares?");
                System.out.println("\ta. Directora general de IBM en Europa, Oriente Medio y África");
                System.out.println("\tb. Vicepresidenta de Microsoft Western Europe");
                System.out.println("\tc. Directora general de Google en España y Portugal");
                System.out.println("\td. Fundadora y CEO de Marsi Bionics");
                System.out.print("Tu respuesta: ");
                char r2 = scanner.next().toLowerCase().charAt(0);
                if (r2 == 'c') puntaje += 5;
       
                System.out.println("\n3. ¿Quién fue Hedwig Eva Maria Kiesler, conocida como Hedy Lamarr?");
                System.out.println("\ta. Primera programadora de software");
                System.out.println("\tb. Actriz de cine e inventora del sistema base del wifi, bluetooth y GPS");
                System.out.println("\tc. Inventora del procesador de datos");
                System.out.println("\td. Astronauta y científica de la ESA");
                System.out.print("Tu respuesta: ");
                char r3 = scanner.next().toLowerCase().charAt(0);
                if (r3 == 'b'|| r3 == 'd') puntaje += 5;
        
               
                System.out.println("\n4. ¿Cómo se llamaban las principales 'mujeres ocultas' de la NASA?");
                System.out.println("\ta. Katherine Johnson, Dorothy Vaughan y Mary Jackson");
                System.out.println("\tb. Jessica Miller, Emily Johnson y Sarah Davis");
                System.out.println("\tc. bell hooks, Toni Morrison y Alice Walker");
                System.out.println("\td. Emmeline Pankhurst, Millicent Fawcett y Harriet Harman");
                System.out.print("Tu respuesta: ");
                char r4 = scanner.next().toLowerCase().charAt(0);
                if (r4 == 'a') puntaje += 5;
        
                System.out.println("\nTu puntaje final es: " + puntaje + " / 20");
        
                if (puntaje >= 15) {
                    System.out.println("🎉 ¡Tú sí que sabes mucho!");
                } else if (puntaje >= 5) {
                    System.out.println("😊 No lo has hecho mal.");
                } else {
                    System.out.println("🙃 Buena suerte la próxima vez.");
                }
        
                scanner.close();
            }
        }
        