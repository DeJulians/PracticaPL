import java.io.*;
import org.antlr.v4.runtime.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public interface principal1 {
    public static void main(String[] args){
    SwingUtilities.invokeLater(() -> {
        JFrame frame = new JFrame("Seleccionar archivo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton selectButton = new JButton("Seleccionar archivo");
        selectButton.addActionListener(new ActionListener() {
                                           @Override
                                           public void actionPerformed(ActionEvent e) {
                                               JFileChooser fileChooser = new JFileChooser();
                                               int result = fileChooser.showOpenDialog(frame);
                                               if (result == JFileChooser.APPROVE_OPTION) {
                                                   File file = fileChooser.getSelectedFile();
                                                   String filePath = file.getAbsolutePath();

                                                   // Aquí puedes llamar a tu código de análisis y procesamiento de ANTLR
                                                   // utilizando el archivo seleccionado
                                                   try {
// Preparar el fichero de entrada para asignarlo al analizador léxico
                                                       CharStream input = CharStreams.fromFileName(filePath);
// Crear el objeto correspondiente al analizador léxico con el fichero de
// entrada
                                                       gramaticaLexer analex = new gramaticaLexer(input);
// Identificar al analizador léxico como fuente de tokens para el
// sintactico
                                                       CommonTokenStream tokens = new CommonTokenStream(analex);
// Crear el objeto correspondiente al analizador sintáctico
                                                       gramaticaParser anasint = new gramaticaParser(tokens);
                                                       anasint.name = file.getName();
/*
Si se quiere pasar al analizador algún objeto externo con el que trabajar,
este deberá ser de una clase del mismo paquete
Aquí se le llama "sintesis", pero puede ser cualquier nombre.
NumbersParser anasint = new NumbersParser(tokens, new sintesis());
*/
/*
Comenzar el análisis llamando al axioma de la gramática
Atención, sustituye "AxiomaDeLaGramatica" por el nombre del axioma de tu
gramática
*/
                                                       anasint.program();
                                                   } catch (org.antlr.v4.runtime.RecognitionException e3) {
//Fallo al reconocer la entrada
                                                       System.err.println("REC " + e3.getMessage());
                                                   } catch (IOException e1) {
//Fallo de entrada/salida
                                                       System.err.println("IO " + e1.getMessage());
                                                   } catch (java.lang.RuntimeException e2) {
//Cualquier otro fallo
                                                       System.err.println("RUN " + e2.getMessage());
                                                   }
                                               }
                                           }
                                       });
        frame.getContentPane().add(selectButton);
        frame.pack();
        frame.setVisible(true);
    });
}
}

