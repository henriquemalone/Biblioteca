
package Model;

import java.io.Serializable;

public abstract class Exemplar implements Serializable {
    String id; //variavel para receber o id do exemplar
    String titulo; //variavel para receber o titulo do exemplar
    String categoria; //variavel para receber a categoria do exemplar
    String emprestimo;
	
    /**Método construtor.
     */
    public Exemplar(){ //construtor

    }
    
    /**Recebe ID do exemplar.
     * @param  id String - ID do exemplar.
     * @return void.
     */
    public void setId(String id){
        this.id=id;
    }
	
    /**Retorna o ID do exemplar.
     * @return String - retorna ID do exemplar.
     */
    public String getId(){
        
        return id;
    }
    
    /**Retorna o titulo do exemplar.
     * @return String - retorna titulo do exemplar.
     */
    public String getTitulo(){ //retorna titulo do exemplar
		
	return titulo;
    }
	
    /**Recebe titulo do exemplar.
     * @param  p_titulo String - titulo do exemplar.
     * @return void.
     */
    public void setTitulo(String p_titulo){ //recebe titulo do exemplar
	this.titulo=p_titulo;
    }
        
    /**Método abstrado para retornar o a categoria do exemplar.
     */
    public abstract String getCategoria();
    
    public String getEmprestimo(){ //retorna categoria do exemplar
		
	return emprestimo;
    }
	
    /**Recebe situação do emprestimo do exemplar.
     * @param  emprestimo String - situação do emprestimo (1 ou 0).
     * @return void.
     */
    public void setEmprestimo(String emprestimo){ 
	this.emprestimo=emprestimo;
    }
    
    
}
