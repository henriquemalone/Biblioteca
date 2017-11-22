package Model;

import View.cadEstudante;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CtrDevolucao {
    
    /**Método construtor.
     */
    public CtrDevolucao(){
        
    }
    
    /**Método para efetuar a devolução de um empréstimo.
     * @param  id String- ID do emprestimo.
     * @param  emprestimo Emprestimo - Objeto emprestimo.
     * @return boolean = true se a inserção ocorreu corretamente, false se houve algum problema.
     */
    public boolean efetuarDevolucao(String id, Emprestimo emprestimo){
        try{
            FileOutputStream in = new FileOutputStream("Emprestimos/emprestimo"+id+".txt"); //entra no diretório e encontra o arquivo
            ObjectOutputStream ois = new ObjectOutputStream(in); //objeto de manipulação do arquivo serializado
            
            DateFormat strDf = new SimpleDateFormat("dd/MM/yyyy"); //cria um formato de data dia/mes/ano
            Date date = new Date(); //cria o objeto data
            
            emprestimo.setDataDevolucao(strDf.format(date)); //seDataDevolucao do emprestimo recebe a data atual
            ois.writeObject(emprestimo); //reescreve o arquivo atualizado
            
            in.close(); //fecha FileOutputStream
            ois.close(); //fecha ObjectOutputStream
            
            return true;
        } catch (Exception e){
            Logger.getLogger(CtrDevolucao.class.getName()).log(Level.SEVERE, null, e); //retorna erro
        }
        
        return false;
    }
    
    /**Método para alterar o estado da revista de emprestado(1) para nao emprestado(0).
     * @param  id String- ID do emprestimo.
     * @return void.
     */
    public void alterarEmprestimoRevista(String id){
        String titulo = null;
        String categoria = null;

        try {
            FileInputStream fis = new FileInputStream(new File("Revistas/revista"+id+".txt")); //entra no diretório e encontra o arquivo
            ObjectInputStream obInp = new ObjectInputStream(fis); //objeto de manipulação do arquivo serializado
            
            Revista r = (Revista) obInp.readObject();  //le o objeto no arquivo
            
            titulo = r.getTitulo(); //variavel 'titulo' recebe o titulo da revista guardada no arquivo
            categoria = r.getCategoria(); //variavel 'categoria' recebe a categoria da revista guardada no arquivo
            
            fis.close();//fecha FileInputStream
            obInp.close(); //fecha ObjectInputStream
        } catch (Exception exc) {
             Logger.getLogger(CtrDevolucao.class.getName()).log(Level.SEVERE, null, exc); //retorna erro
        } 
        
        Revista r = new Revista(); //cria objeto Revista r
        
        r.setId(id); //faz o set do ID
        r.setTitulo(titulo); //faz o set do tituloSS
        r.setEmprestimo("0"); //faz o set do emprestimo (0)
        
        try {
            FileOutputStream fis = new FileOutputStream(new File("Revistas/revista"+id+".txt"));//entra no diretório e encontra o arquivo
            ObjectOutputStream obInp = new ObjectOutputStream(fis); //objeto de manipulação do arquivo serializado
            
            obInp.writeObject(r);//escreve o objeto no arquivo (salvar dado atualizado)
            
            fis.close(); //fecha FileOutputStream
            obInp.close(); //fecha ObjectOutputStream
        } catch (Exception exc) {
             Logger.getLogger(CtrDevolucao.class.getName()).log(Level.SEVERE, null, exc); //retorna erro
        } 
        
    }
    
    /**Método para alterar o estado do livro de emprestado(1) para nao emprestado(0).
     * @param  id String- ID do emprestimo.
     * @return void.
     */
    public void alterarEmprestimoLivro(String id){
        String titulo = null;
        String categoria = null;
        String autor = null;
        String editora = null;

        try {
            FileInputStream fis = new FileInputStream(new File("Livros/livro"+id+".txt")); //entra no diretório e encontra o arquivo
            ObjectInputStream obInp = new ObjectInputStream(fis); //objeto de manipulação do arquivo serializado
            
            Livro l = (Livro) obInp.readObject(); //le o objeto no arquivo
            
            titulo = l.getTitulo(); //variavel 'titulo' recebe o titulo da revista guardada no arquivo
            autor = l.getAutor(); //variavel 'autor' recebe o autor da revista guardada no arquivo
            editora = l.getEditora(); //variavel 'editora' recebe a editora da revista guardada no arquivo
            categoria = l.getCategoria(); //variavel 'categoria' recebe a categoria da revista guardada no arquivo
            
            fis.close(); //fecha FileInputStream
            obInp.close(); //fecha ObjectInputStream
        } catch (Exception exc) {
            Logger.getLogger(CtrDevolucao.class.getName()).log(Level.SEVERE, null, exc); //retorna erro
        } 
        
        Livro l = new Livro();//cria objeto Livro l
         
        l.setId(id); //faz o set do ID
        l.setTitulo(titulo); //faz o set do titulo
        l.setEmprestimo("0"); //faz o set do emprestimo(0)
        l.setEditora(editora); //faz o set da editora
        l.setAutor(autor); //faz o set do autor
        
        try {
            FileOutputStream fis = new FileOutputStream(new File("Livros/livro"+id+".txt")); //entra no diretório e encontra o arquivo
            ObjectOutputStream obInp = new ObjectOutputStream(fis); //objeto de manipulação do arquivo serializado
            
            obInp.writeObject(l); //escreve o objeto no arquivo (salvar dado atualizado)
            
            fis.close();
            obInp.close();
        } catch (Exception exc) {
             Logger.getLogger(CtrDevolucao.class.getName()).log(Level.SEVERE, null, exc); //retorna erro
        } 
    }
    
    /**Método para verificar se a devolução esta em atraso ou nao.
     * @param  id String- ID do emprestimo.
     * @return void.
     */
    public boolean verificarData(String id){
        try{
            FileInputStream in = new FileInputStream("Emprestimos/emprestimo"+id+".txt"); //entra no diretório e encontra o arquivo
            ObjectInputStream ois = new ObjectInputStream(in); //objeto de manipulação do arquivo serializado
            
            DateFormat strDf = new SimpleDateFormat("dd/MM/yyyy"); //cria um formato de data dia/mes/ano
            Date date = new Date(); //cria o objeto data
            
            Emprestimo e = (Emprestimo) ois.readObject(); //le o objeto no arquivo
            
            Date previsao = strDf.parse(e.getDataPrevisao()); //variavel previsao recebe a DataPrevisao do arquivo
            Date devolucao = strDf.parse(strDf.format(date)); //variavel devolucao recebe a data atual
            
            in.close(); //fecha FileInputStream
            ois.close(); //fecha ObjectInputStream
            
            if(previsao.before(devolucao)){ //se a data previsao for antes da data devolução
                return true;
            } 
        } catch (Exception e){
            Logger.getLogger(CtrDevolucao.class.getName()).log(Level.SEVERE, null, e); //retorna erro  
        }
           
        return false;
    }
    
    /**Método para verificar se a devolução ja não foi feita.
     * @param  id String- ID do emprestimo.
     * @return boolean = true se a inserção ocorreu corretamente, false se houve algum problema.
     */
    public boolean verificaEmprestimo(String id){
        try{
            FileInputStream in = new FileInputStream("Emprestimos/emprestimo"+id+".txt"); //entra no diretório e encontra o arquivo
            ObjectInputStream ois = new ObjectInputStream(in); //objeto de manipulação do arquivo serializado
               
            Emprestimo e = (Emprestimo) ois.readObject(); //le o objeto no arquivo
            
            if(e.getDataDevolucao()!=null){ //se a DataDevolucao do arquivo for nulo
                in.close(); //fecha FileInputStream
                ois.close(); //fecha ObjectInputStream
                return true;
            }
            in.close(); //fecha FileInputStream
            ois.close(); //fecha ObjectInputStream
        } catch (Exception e){
            Logger.getLogger(CtrDevolucao.class.getName()).log(Level.SEVERE, null, e); //retorna erro  
        }
        
        return false;
    }
    
}
