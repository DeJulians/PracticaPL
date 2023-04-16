import java.io.*;
import org.antlr.v4.runtime.*;


public class Main {
    public static void main(String[] args) {
        try{
// Preparar el fichero de entrada para asignarlo al analizador léxico
            CharStream input = CharStreams.fromFileName(args[0]);
// Crear el objeto correspondiente al analizador léxico con el fichero de
// entrada
            gramaticaLexer analex = new gramaticaLexer(input);
// Identificar al analizador léxico como fuente de tokens para el
// sintactico
            CommonTokenStream tokens = new CommonTokenStream(analex);
// Crear el objeto correspondiente al analizador sintáctico
            gramaticaParser anasint = new gramaticaParser(tokens);

            anasint.dcl();
            System.out.println("TODO ESTA OK");
        } catch (org.antlr.v4.runtime.RecognitionException e) {
//Fallo al reconocer la entrada
            System.err.println("REC " + e.getMessage());
        } catch (IOException e) {
//Fallo de entrada/salida
            System.err.println("IO " + e.getMessage());
        } catch (java.lang.RuntimeException e) {
//Cualquier otro fallo
            System.err.println("RUN " + e.getMessage());
        }
    }
}