
package Model;

import View.cadEstudante;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Acervo {
    
    /**Método construtor.
     */
    public Acervo(){
        
    }
    
    /**Método para adicionar os dados de uma revista em um arquivo txt.
     * @param  revista Revista - Objeto revista.
     * @return Boolean - true se a inserção ocorreu corretamente, false houve algum problema
     */
    public boolean adicionaRevista(Revista revista) {    
        try {
            String id = gerarId("r"); //chama o método 'gerarId' e a variavel 'id1 recebe o ID gerado
 
            FileOutputStream saveFile = new FileOutputStream("Revistas/revista"+id+".txt"); //entra no diretório e encontra o arquivo
            ObjectOutputStream stream = new ObjectOutputStream(saveFile); //objeto de manipulação do arquivo serializado
 
            stream.writeObject(revista); //escreve o objeto no arquivo (salvar dados)
            
            stream.close(); //fecha o ObjectOutputStream
            saveFile.close(); ///fecha o FileOutputStream
            
            atualizaId(id, "r"); //chama o método que atualiza o id (incrementa +1 ao ID)
             
            return true;
        } catch (Exception exc) {
             Logger.getLogger(Acervo.class.getName()).log(Level.SEVERE, null, exc); //retorna erro
        }
         
         return false;
    }
    
     /**Método para adicionar os dados de um livro em um arquivo txt.
     * @param  revista Revista - Objeto revista.
     * @return Boolean - true se a inserção ocorreu corretamente, false houve algum problema
     */
    public boolean adicionaLivro(Livro livro) {
        try {
            String id = gerarId("l"); //chama o método 'gerarId' e a variavel 'id1 recebe o ID gerado
 
            FileOutputStream saveFile = new FileOutputStream("Livros/livro"+id+".txt");  //entra no diretório e encontra o arquivo
            ObjectOutputStream stream = new ObjectOutputStream(saveFile); //objeto de manipulação do arquivo serializado
 
            stream.writeObject(livro); //escreve o objeto no arquivo (salvar dados)
            
            stream.close(); //fecha o ObjectOutputStream
            saveFile.close(); ///fecha o FileOutputStream
            
            atualizaId(id, "l"); //chama o método que atualiza o id (incrementa +1 ao ID)
             
            return true;
        } catch (Exception exc) {
             Logger.getLogger(Acervo.class.getName()).log(Level.SEVERE, null, exc); //retorna erro
        }
         
         return false;
    }
    
    /**Método para deletar os dados de uma revista em um arquivo txt.
     * @param  id String - id da revista.
     * @return Boolean - true se a remoção ocorreu corretamente, false houve algum problema
     */
    public boolean deletaRevista(String id){
       try{
            File file = new File("Revistas/revista"+id+".txt"); //entra no diretório e encontra o arquivo
            file.delete(); //deleta o arquivo
                
            return true;
        } catch(Exception e){
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, e); //retorna erro
        }
        
        return false;
    }
    
    /**Método para deletar os dados de um livro em um arquivo txt.
     * @param  id String - id da revista.
     * @return Boolean - true se a remoção ocorreu corretamente, false houve algum problema
     */
    public boolean deletaLivro(String id){
        try{
            File file = new File("Livros/livro"+id+".txt"); //entra no diretório e encontra o arquivo
            file.delete(); //deleta o arquivo
                
            return true;
        } catch(Exception e){
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, e); //retorna erro
        }
        
        return false;
    }
    
    /**Método para atualizar o valor do ID no arquivo.Usado na criação do ID automático
     * @param  id String - id da revista.
     * @param  categoria String - categoria do exemplar.
     * @return void.
     */
    public void atualizaId(String id, String categoria) throws FileNotFoundException, IOException{
        int idInt;
        
        if(categoria.equals("r")){ //verifica se a categoria do exemplar é igual a "r" (revista)
            idInt = Integer.parseInt(id) +1; //variavel 'idInt' recebe o valor do id do exemplar, passado como parametro, e incrementa +1 (converte id para  tipo int)
            id = Integer.toString(idInt); //converte 'id' para int novamente, recebendo o valor de 'idInt' que esta incrementado
        
            FileOutputStream fos = new FileOutputStream("idRevista.txt");  //entra no diretório e encontra o arquivo
            OutputStreamWriter  writer = new OutputStreamWriter (fos); //cria o objeto 'writer' responsavel por escrever no arquivo
            writer.write(id); //escreve o valor de 'id' no arquivo 'idRevista.txt'
            writer.flush(); //atualiza o arquivo
            writer.close(); //fecha o OutputStreamWriter
            fos.flush(); //atualiza o arquivo
            fos.close(); //fecha o FileOutputStream
        } else { //caso a categoria do exemplar seja diferente de "r" (no caso, será um livro)
            idInt = Integer.parseInt(id) +1; //variavel 'idInt' recebe o valor do id do exemplar, passado como parametro, e incrementa +1 (converte id para  tipo int)
            id = Integer.toString(idInt); //converte 'id' para int novamente, recebendo o valor de 'idInt' que esta incrementado
        
            FileOutputStream fos = new FileOutputStream("idLivro.txt"); //entra no diretório e encontra o arquivo
            OutputStreamWriter  writer = new OutputStreamWriter (fos); //cria o objeto 'writer' responsavel por escrever no arquivo
            writer.write(id); //escreve o valor de 'id' no arquivo 'idLivro.txt'
            writer.flush(); //atualiza o arquivo
            writer.close(); //fecha o OutputStreamWriter
            fos.flush(); //atualiza o arquivo
            fos.close(); //fecha o FileOutputStream
        }
    }
   
    /**Método para gerar o ID do exemplar usado como ID automático.
     * @param  categoria String - categoria do exemplar.
     * @return String - retorna o ID gerado.
     */
    public String gerarId(String categoria){
        String id = null;
        
        if(categoria.equals("r")){ //verifica se a categoria do exemplar é igual a "r" (revista)
            try{
                FileReader arq = new FileReader("idRevista.txt"); //entra no diretório e encontra o arquivo
                BufferedReader lerArq = new BufferedReader(arq); ////usado para leitura de grande quantidade de dados
        
                id = lerArq.readLine(); //variavel 'id' recebe o ID do arquivo 'idRevista.txt' 
            
                lerArq.close(); //fecha BufferedReader
  
           } catch(Exception e){
                Logger.getLogger(cadEstudante.class.getName()).log(Level.SEVERE, null, e); //retorna erro
            }
        
            return id;
        } else { //caso a categoria do exemplar seja diferente de "r" (no caso, será um livro)
            try{
                FileReader arq = new FileReader("idLivro.txt");  //entra no diretório e encontra o arquivo
                BufferedReader lerArq = new BufferedReader(arq); ////usado para leitura de grande quantidade de dados
        
                id = lerArq.readLine(); //variavel 'id' recebe o ID do arquivo 'idEstudante.txt' 
            
                lerArq.close(); //fecha BufferedReader
  
           } catch(Exception e){
                Logger.getLogger(Acervo.class.getName()).log(Level.SEVERE, null, e); //retorna erro
            }
        
            return id;
        }
    }
   
    /**Método para procurar uma Revista.
     * @param  id String - id da revista.
     * @return String[] - retorna uma lista com os dados da revista.
     */
    public String[] buscarRevista(String id){
        String[] lista = new String[5]; //vetor com 6 posições
        try{ 
            File arquivos[]; //vetor de arquivos
            File diretorio = new File("Revistas"); //entra no diretório Revistas
            arquivos = diretorio.listFiles(); //vetor recebe todos os arquivos do diretório
            for(int i = 0; i < arquivos.length; i++){ //for para percorrer todos os arquivos do vetor
                if(arquivos[i].getName().equals("revista"+id+".txt")){ //se o arquivo for igual à "revista"+id+".txt"
                    FileInputStream in = new FileInputStream(arquivos[i]); //abre o arquivo
                    ObjectInputStream ois = new ObjectInputStream(in); //cria o objeto 'ois' responsavel pela leitura do arquivo
                    Revista r = (Revista)ois.readObject(); //le o objeto do arquivo
                    lista[0] = r.getTitulo(); //vetor 'lista' recebe o titulo da revista na posição 0
                    in.close(); //fecha FileInputStream
                    ois.close(); //fecha ObjectInputStream
                }
            }
       
            return lista;
        } catch (Exception e){
            Logger.getLogger(Acervo.class.getName()).log(Level.SEVERE, null, e); //retorna erro
        }
        
        return null;    
   }
    
    public String[] buscarLivro(String id){
        String[] lista = new String[5]; //vetor com 6 posições
        try{ 
            File arquivos[]; //vetor de arquivos
            File diretorio = new File("Livros"); //entra no diretório Livros
            arquivos = diretorio.listFiles(); //vetor recebe todos os arquivos do diretório
            for(int i = 0; i < arquivos.length; i++){ //for para percorrer todos os arquivos do vetor
                if(arquivos[i].getName().equals("livro"+id+".txt")){  //se o arquivo for igual à "livro"+id+".txt"
                    FileInputStream in = new FileInputStream(arquivos[i]); //abre o arquivo
                    ObjectInputStream ois = new ObjectInputStream(in); //cria o objeto 'ois' responsavel pela leitura do arquivo
                    Livro l = (Livro)ois.readObject();  //le o objeto do arquivo
                    lista[0] = l.getTitulo();  //vetor 'lista' recebe o titulo do livro na posição 0
                    lista[1] = l.getAutor();  //vetor 'lista' recebe o autor da livro na posição 1
                    lista[2] = l.getEditora();  //vetor 'lista' recebe o editora da livro na posição 2
                    in.close(); //fecha FileInputStream
                    ois.close(); //fecha ObjectInputStream
                }
            }
       
            return lista;
        } catch (Exception e){
            Logger.getLogger(Acervo.class.getName()).log(Level.SEVERE, null, e); //retorna erro
        }
        
        return null;    
   }
    
}
