
package Model;

import View.cadEstudante;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CtrEmprestimo {
    
    /**Método construtor.
     */
    public CtrEmprestimo(){ //método construtor
        
    }
    
    /**Método para efetuar o empréstimo de exemplares.
     * @param  emprestimo Emprestimo - Objeto empréstimo.
     * @return Boolean - true se a inserção ocorreu corretamente, false houve algum problema
     */
    public boolean efetuaEmprestimo(Emprestimo emprestimo) throws FileNotFoundException, IOException{ //metodo para efetuar emprestimo
        try {
            FileOutputStream saveFile = new FileOutputStream("Emprestimos/emprestimo"+gerarId()+".txt"); //entra no diretório e encontra o arquivo
            ObjectOutputStream stream = new ObjectOutputStream(saveFile); //objeto de manipulação do arquivo serializado
 
            stream.writeObject(emprestimo); //escreve o arquivo atualizado
            
            stream.close(); //fecha ObjectOutputStream
            saveFile.close(); //fecha FileOutputStream
            
            atualizaId(gerarId()); //chama o método que atualiza o id (incrementa +1 ao ID)
             
            return true;
        } catch (Exception exc) {
             Logger.getLogger(cadEstudante.class.getName()).log(Level.SEVERE, null, exc); //retorna erro
        }
         
         return false;
    }
    
    /**Método para gerar o ID do estudante usado como ID automático.
     * @return String - retorna o ID gerado.
     */
    public String gerarId(){
        String id = null;
        try{
            FileReader arq = new FileReader("idEmprestimo.txt"); //abre o arquivo 'idEmprestimo.txt', onde esta os ID dos exemplares
            BufferedReader lerArq = new BufferedReader(arq); ////usado para leitura de grande quantidade de dados
        
            id = lerArq.readLine(); //variavel 'id' recebe o ID do arquivo 'idEmprestimo.txt' 
            
            lerArq.close(); //fecha BufferedReader
  
        } catch(Exception e){
            Logger.getLogger(cadEstudante.class.getName()).log(Level.SEVERE, null, e); //retorna erro
        }
        
        return id;
    }
    
    /**Método para atualizar o valor do ID no arquivo.Usado na criação do ID automático
    * @param  id String - id da revista.
    * @return void.
    */
    public void atualizaId(String id) throws FileNotFoundException, IOException{
        int idInt;
        
        idInt = Integer.parseInt(id) +1; //variavel 'idInt' recebe o valor do id do exemplar, passado como parametro, e incrementa +1 (converte id para  tipo int)
        id = Integer.toString(idInt); //converte 'id' para int novamente, recebendo o valor de 'idInt' que esta incrementado
        
        FileOutputStream fos = new FileOutputStream("idEmprestimo.txt"); //abre o arquivo 'idEmprestimo.txt', onde esta os ID dos exemplares
        OutputStreamWriter  writer = new OutputStreamWriter (fos); //cria o objeto 'writer' responsavel por escrever no arquivo
        writer.write(id); //escreve o valor de 'id' no arquivo 'idEmprestimo.txt'
        writer.flush(); //atualiza o arquivo
        writer.close(); //fecha o OutputStreamWriter
        fos.flush(); //atualiza o arquivo
        fos.close(); //fecha o FileOutputStream
    }
    
    /**Método para alterar o estado do livro de nao emprestado(0) para emprestado(1).
     * @param  id String- ID do emprestimo.
     * @param  livro livro- Objeto livro.
     * @return void.
     */
    public void alterarEmprestimoLivro(String id, Livro livro){
        try {
            FileOutputStream saveFile = new FileOutputStream("Livros/livro"+id+".txt"); //entra no diretório e encontra o arquivo
            ObjectOutputStream stream = new ObjectOutputStream(saveFile); //objeto de manipulação do arquivo serializado
 
            stream.writeObject(livro); //reescreve o arquivo com os dados atualizado (emprestado = 1)
            
            stream.close(); //fecha ObjectOutputStream
            saveFile.close(); //fecha FileOutputStream
  
        } catch (Exception exc) {
             Logger.getLogger(cadEstudante.class.getName()).log(Level.SEVERE, null, exc); //retorna erro
        } 
    }
    
    /**Método para alterar o estado do livro de nao emprestado(0) para emprestado(1).
     * @param  id String- ID do emprestimo.
     * @param  revista Revista- Objeto revista.
     * @return void.
     */
    public void alterarEmprestimoRevista(String id, Revista revista){
        try {
            FileOutputStream saveFile = new FileOutputStream("Revistas/revista"+id+".txt");//entra no diretório e encontra o arquivo
            ObjectOutputStream stream = new ObjectOutputStream(saveFile);//objeto de manipulação do arquivo serializado
 
            stream.writeObject(revista);  //reescreve o arquivo com os dados atualizado (emprestado = 1)
            
            stream.close(); //fecha ObjectOutputStream
            saveFile.close(); //fecha FileOutputStream
             
        } catch (Exception exc) {
             Logger.getLogger(cadEstudante.class.getName()).log(Level.SEVERE, null, exc); //retorna erro
        } 
    }
    
    /**Método para alterar o estado do livro de nao emprestado(0) para emprestado(1).
     * @param  id String- ID do emprestimo.
     * @param  categoria String- categoria do exemplar.
     * @return void.
     */
    public boolean verificaEmprestimo(String id, String categoria){
        if(categoria=="Livro"){ //se categoria for igual á "Livro"
            try {
                File arquivos[];//vetor de arquivos
                File diretorio = new File("Livros"); //entra no diretório Livros
                arquivos = diretorio.listFiles(); //vetor recebe todos os arquivos do diretório
                for(int i = 0; i < arquivos.length; i++){ //for para percorrer todos os arquivos do vetor
                    if(arquivos[i].getName().equals("livro"+id+".txt")){ //se o arquivo for igual à "livro"+id+".txt"
                        FileInputStream in = new FileInputStream(arquivos[i]); //abre o arquivo
                        ObjectInputStream ois = new ObjectInputStream(in); //cria o objeto 'ois' responsavel pela leitura do arquivo
                        Livro l = (Livro)ois.readObject(); //le o objeto do arquivo
                        if(l.getEmprestimo().equals("1")){ //se o emprestimo for igual a 1 (emprestado)
                            in.close(); //fecha FileInputStream
                            ois.close(); //fecha ObjectInputStream
                            return true;
                        } else{
                            in.close(); //fecha FileInputStream
                            ois.close(); //fecha ObjectInputStream
                            return false;
                        }
                    }
                }
            } catch (FileNotFoundException ex) { 
                Logger.getLogger(CtrEmprestimo.class.getName()).log(Level.SEVERE, null, ex); //retorna erro
            } catch (IOException ex) {
                Logger.getLogger(CtrEmprestimo.class.getName()).log(Level.SEVERE, null, ex); //retorna erro
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(CtrEmprestimo.class.getName()).log(Level.SEVERE, null, ex); //retorna erro
            } 
        } else {
            try {
                File arquivos[];//vetor de arquivos
                File diretorio = new File("Revistas"); //entra no diretório Revistas
                arquivos = diretorio.listFiles(); //vetor recebe todos os arquivos do diretório
                for(int i = 0; i < arquivos.length; i++){ //for para percorrer todos os arquivos do vetor
                    if(arquivos[i].getName().equals("revista"+id+".txt")){ //se o arquivo for igual à "revista"+id+".txt"
                        FileInputStream in = new FileInputStream(arquivos[i]); //abre o arquivo
                        ObjectInputStream ois = new ObjectInputStream(in); //cria o objeto 'ois' responsavel pela leitura do arquivo
                        Revista r = (Revista)ois.readObject(); //le o objeto do arquivo
                        if(r.getEmprestimo().equals("1")){ //se o emprestimo for igual a 1 (emprestado)
                            in.close(); //fecha FileInputStream
                            ois.close(); //fecha ObjectInputStream
                            return true;
                        } else{
                            in.close(); //fecha FileInputStream
                            ois.close(); //fecha ObjectInputStream
                            return false;
                        }
                    }
                }
            } catch (FileNotFoundException ex) { 
                Logger.getLogger(CtrEmprestimo.class.getName()).log(Level.SEVERE, null, ex); //retorna erro
            } catch (IOException ex) {
                Logger.getLogger(CtrEmprestimo.class.getName()).log(Level.SEVERE, null, ex); //retorna erro
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(CtrEmprestimo.class.getName()).log(Level.SEVERE, null, ex); //retorna erro
            } 
        }
        
        return false;
    } 
    
    /**Método recuperar os dados de um emprestimo para exibir na tela.
     * @param  id String - id da revista.
     * @return String[] - retorna uma lista com os dados da revista.
     */
    public String[] buscarEmprestimo(String id){
        String[] lista = new String[6]; //vetor lista com 7 posições
        try{ 
            File arquivos[]; //vetor de arquivos
            File diretorio = new File("Emprestimos"); //entra no diretório Emprestimos
            arquivos = diretorio.listFiles(); //vetor recebe todos os arquivos do diretório
            for(int i = 0; i < arquivos.length; i++){ //for para percorrer todos os arquivos do vetor
                if(arquivos[i].getName().equals("emprestimo"+id+".txt")){ //se o arquivo for igual à "emprestimo"+id+".txt"
                    FileInputStream in = new FileInputStream(arquivos[i]); //abre o arquivo
                    ObjectInputStream ois = new ObjectInputStream(in); //cria o objeto 'ois' responsavel pela leitura do arquivo
                    Emprestimo e = (Emprestimo)ois.readObject(); //le o objeto do arquivo
                    lista[0] = e.getCategoria(); //vetor 'lista' recebe a categoria do exemplar na posição 0
                    lista[1] = e.getExemplar(); //vetor 'lista' recebe o ID do exemplar na posição 1
                    lista[2] = e.getTitulo(); //vetor 'lista' recebe o titulo do exemplar na posição 2
                    lista[3] = e.getEstudante(); //vetor 'lista' recebe o ID do estudante na posição 3
                    lista[4] = e.getNomeEst(); //vetor 'lista' recebe o nome do estudante na posição 4
                    lista[5] = e.getDataPrevisao(); //vetor 'lista' recebe a data de previsao na posição 5
                    in.close(); //fecha FileInputStream
                    ois.close(); //fecha ObjectInputStream
                }
            }
       
            return lista;
        } catch (Exception e){
            Logger.getLogger(CtrEmprestimo.class.getName()).log(Level.SEVERE, null, e); //retorna erro
        }
        
        return null;    
   }
}
