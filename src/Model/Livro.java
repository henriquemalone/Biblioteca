
package Model;

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


public class Livro extends Exemplar implements Serializable{ //classe herda da classe Exemplar
    public String autor; //variavel que ira receber o autor do exemplar
    public String editora; //variavel que ira receber a editora do exemplar
    
    /**Método construtor.
     */
    public Livro(){
        
    }
    
    /**Retorna a editora do exemplar.
     * @return String - retorna editora do exemplar.
     */
    public String getEditora() { //retorna a editora do exemplar
        return editora;
    }

    /**Recebe editora do exemplar.
     * @param  editora String - editora do exemplar.
     * @return void.
     */
    public void setEditora(String editora) { //recebe a editora do exemplar
        this.editora = editora;
    }
	
    /**Retorna o autor do exemplar.
     * @return String - retorna autor do exemplar.
     */
    public String getAutor(){ //retorna o autor do exemplar
		
	return autor;
    }
	
    /**Recebe autor do exemplar.
     * @param  p_autor String - autor do exemplar.
     * @return void.
     */
    public void setAutor(String p_autor){ //recebe o autor do exemplar
	this.autor=p_autor;
    }

    /**Retorna a categoria do exemplar.
     * @return String - retorna a categoria do exemplar.
     */
    @Override
    public String getCategoria() {
        this.categoria = "Livro";
        
        return categoria;
    }
}
