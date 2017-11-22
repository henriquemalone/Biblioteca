package Model;

import View.cadEstudante;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
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
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Clientes implements Serializable{
    
    /**Método construtor. 
     */
    public Clientes(){
        
    }
  
    /**Método para adicionar os dados de um estudante em um arquivo txt.
     * @param  estudante Estudante - Objeto estudante.
     * @return Boolean - true se a remoção ocorreu corretamente, false houve algum problema
     */
    public boolean adicionaEstudante(Estudante estudante) {   
        try {
            FileOutputStream saveFile = new FileOutputStream("Estudantes/estudante"+gerarId()+".txt"); //entra no diretório e encontra o arquivo
            ObjectOutputStream stream = new ObjectOutputStream(saveFile); //objeto de manipulação do arquivo serializado
 
            stream.writeObject(estudante); //escreve o objeto no arquivo (salvar dados)
            
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
        //gera o ID do estudante
        try{
            FileReader arq = new FileReader("idEstudante.txt"); //abre o arquivo 'idEstudante.txt', onde esta os ID dos exemplares
            BufferedReader lerArq = new BufferedReader(arq); ////usado para leitura de grande quantidade de dados
        
            id = lerArq.readLine(); //variavel 'id' recebe o ID do arquivo 'idEstudante.txt' 
            
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
        
        FileOutputStream fos = new FileOutputStream("idEstudante.txt"); //abre o arquivo 'idEstudante.txt', onde esta os ID dos exemplares
        OutputStreamWriter  writer = new OutputStreamWriter (fos); //cria o objeto 'writer' responsavel por escrever no arquivo
        writer.write(id); //escreve o valor de 'id' no arquivo 'idEstudante.txt'
        writer.flush(); //atualiza o arquivo
        writer.close(); //fecha o OutputStreamWriter
        fos.flush(); //atualiza o arquivo
        fos.close(); //fecha o FileOutputStream
    }
    
    /**Método para deletar os dados de um estudante em um arquivo txt.
     * @param  id String - id do estudante.
     * @return Boolean - true se a remoção ocorreu corretamente, false houve algum problema
     */
    public boolean deletaEstudante(String id){     
        try{
            File file = new File("Estudantes/estudante"+id+".txt"); //entra no diretório e encontra o arquivo
            file.delete(); //deleta o arquivo
                 
            return true;
        } catch(Exception e){
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, e); //retorna erro
        }
        
        return false;
    }
    
    /**Método para alterar os dados de um estudante em um arquivo txt.
     * @param  id int - id do estudante.
     * @param  estudante Estudante - nome do estudante.
     * @return Boolean - true se a remoção ocorreu corretamente, false houve algum problema
     */
    public boolean editaEstudante(String id, Estudante estudante) throws IOException{

        try {
            FileOutputStream saveFile = new FileOutputStream("Estudantes/estudante"+id+".txt"); //entra no diretório e encontra o arquivo
            ObjectOutputStream stream = new ObjectOutputStream(saveFile); //objeto de manipulação do arquivo serializado
 
            stream.writeObject(estudante);  //escreve o objeto no arquivo (salvar dados atualizados)
            
            stream.close(); //fecha ObjectOutputStream
            saveFile.close(); //fecha FileOutputStream
             
            return true;
        } catch (Exception exc) {
             Logger.getLogger(cadEstudante.class.getName()).log(Level.SEVERE, null, exc); //retorna erro
        }
         
         return false;
    }
    
    /**Método para procurar um estudante.
     * @param  id String - id da revista.
     * @return String[] - retorna uma lista com os dados da revista.
     */
    public String[] buscarEstudante(String id){
        String[] lista = new String[10]; //vetor com 11 posições
        try{ 
            File arquivos[]; //vetor de arquivos
            File diretorio = new File("Estudantes"); //entra no diretório Estudantes
            arquivos = diretorio.listFiles(); //vetor recebe todos os arquivos do diretório
            for(int i = 0; i < arquivos.length; i++){ //for para percorrer todos os arquivos do vetor
                if(arquivos[i].getName().equals("estudante"+id+".txt")){ //se o arquivo for igual à "estudante"+id+".txt"
                    FileInputStream in = new FileInputStream(arquivos[i]); //abre o arquivo
                    ObjectInputStream ois = new ObjectInputStream(in); //cria o objeto 'ois' responsavel pela leitura do arquivo
                    Estudante e = (Estudante)ois.readObject(); //le o objeto do arquivo
                    lista[0] = e.getNome(); //vetor 'lista' recebe o nome da revista na posição 0
                    lista[1] = e.getEnd(); //vetor 'lista' recebe o endereço da revista na posição 0
                    lista[2] = e.getNum(); //vetor 'lista' recebe o numero da revista na posição 0
                    lista[3] = e.getCpf(); //vetor 'lista' recebe o cpf da revista na posição 0
                    lista[4] = e.getRg(); //vetor 'lista' recebe o rg da revista na posição 0
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
