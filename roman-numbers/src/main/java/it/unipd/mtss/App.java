/*///////////////////////////////////////////////////////////////////
  Davide Facco 2087852
  Marco Scanferla 2075523
///////////////////////////////////////////////////////////////////*/

package it.unipd.mtss;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        int numero=596;// solo per prova
        IntegerToRoman  integerToRoman= new IntegerToRoman();
        String numeroRomano =integerToRoman.convert(numero);
        System.out.println(numeroRomano);

    }
}
