
package Model;

import View.cadEstudante;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Revista extends Exemplar implements Serializable{
    
    /**Método construtor.
     */
    public Revista(){

    }

    /**Retorna a categoria do exemplar.
     * @return String - retorna a categoria do exemplar.
     */
    @Override
    public String getCategoria() {
        this.categoria = "Revista";
        
        return categoria;
    }

}
