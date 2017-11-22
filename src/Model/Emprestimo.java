package Model;

import java.io.Serializable;
import java.sql.Date;

public class Emprestimo implements Serializable {
    private String dataDevolucao; //variavel do tipo date para receber a data de devolução
    private String dataPrevisao; //variavel do tipo date para receber a data de previsao
    private String titulo; //variavel do tipo string para receber o titulo
    private String nomeEstudante; //variavel do tipo string para receber o nome do estudante
    private String exemplar; //variavel do tipo int para receber o id do exemplar
    private String estudante; //variavel do tipo int para receber o id do estudante
    private String id; //id do emprestimo
    private String categoria; //categoria do exemplar
    
    /**Método construtor.
     */
    public Emprestimo(){ //construtor

    }
    
    /**Recebe categoria do exemplar, Livro ou Revista.
     * @param  categoria String - Categoria do exemplar.
     * @return void.
     */
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
	
    /**Retorna a categoria do exemplar, Livro ou revista.
     * @return String - retorna Livro ou Revista
     */
    public String getCategoria(){ 
        return this.categoria;
    }   
    
    /**Recebe ID do exemplar.
     * @param  id String - id do exemplar.
     * @return void.
     */
    public void setId(String id){ 
        this.id = id;
    }
	
    /**Retorna o ID do exemplar.
     * @return String - retorna ID do exemplar.
     */
    public String getId(){ 
        return this.id;
    }    
    
    /**Recebe nome do estudante.
     * @param  nomeEstudante String - nome do estudante.
     * @return void.
     */
    public void setNomeEst(String nomeEstudante){ 
        this.nomeEstudante = nomeEstudante;
    }
	
    /**Retorna o nome do estudante.
     * @return String - retorna o nome do estudante.
     */
    public String getNomeEst(){
        return this.nomeEstudante;
    }
        
    /**Recebe data de previsÃ£o da devoluÃ§Ã£o do exemplar.
     * @param  dataPrevisao String - data de previsÃ£o da devoluÃ§Ã£o do exemplar.
     * @return void.
     */
    public void setDataPrevisao(String dataPrevisao){ 
        this.dataPrevisao = dataPrevisao;
    }
    
    /**Retorna data de previsÃ£o da devoluÃ§Ã£o do exemplar.
     * @return String - data de previsÃ£o da devoluÃ§Ã£o do exemplar.
     */
    public String getDataPrevisao(){  
        return this.dataPrevisao;
    }
     
    /**Recebe titulo do exemplar.
     * @param  titulo String - titulo do exemplar.
     * @return void.
     */
    public void setTitulo(String titulo){ 
        this.titulo = titulo;
    }
	
    /**Retorna o titulo do exemplar.
     * @return String - titulo do exemplar.
     */
    public String getTitulo(){ 
	return this.titulo;
    }
	
    /**Recebe ID do estudante.
     * @param  estudante String - ID do estudante.
     * @return void.
     */
    public void setEstudante(String estudante){ 
        this.estudante = estudante;
    }	
	
    /**Retorna o ID do estudante.
     * @return String - ID do estudante.
     */
    public String getEstudante(){ 
        return this.estudante;
    }
	
    /**Retorna o ID do exemplar.
     * @return String - ID do exemplar.
     */
    public String getExemplar(){ 
	return exemplar;
    }
	
    /**Recebe ID do exemplar.
     * @param  p_exemplar String - ID do exemplar.
     * @return void.
     */
    public void setExemplar(String p_exemplar){
        exemplar = p_exemplar;
    }

    /**Recebe data da devoluÃ§Ã£o.
     * @param  data String - data da devoluÃ§Ã£o.
     * @return void.
     */
    public void setDataDevolucao(String data){ 
        this.dataDevolucao = data;
    }
	
    /**Retorna a data da devoluÃ§Ã£o.
     * @return String - data da devoluÃ§Ã£o.
     */
    public String getDataDevolucao(){ 
	return this.dataDevolucao;
    }

}
