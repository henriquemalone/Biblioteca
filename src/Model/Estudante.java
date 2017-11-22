
package Model;

import View.cadEstudante;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.sql.SQLException; //importa "biblioteca" do SQL
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane; //importa swing do JOptionPane (janela de notificação)

public class Estudante implements Serializable {

    private String id;
    private String nome;
    private String sexo;
    private String dataNasc;
    private String rg;
    private String cpf;
    private String celular;
    private String telefone;
    private String email;
    private String end;
    private String bairro;
    private String cidade;
    private String cep;
    private String uf;
    private String num;

    /**Método construtor.
     */
    public Estudante(){
        
    }
    
    /**Retorna o ID do estudante.
     * @return String - retorna ID do estudante
     */
    public String getId() { 
        return id;
    }

     /**Recebe ID do estudante.
     * @param  id String - ID do estudante.
     * @return void.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**Retorna o nome do estudante.
     * @return String - retorna o nome do estudante
     */
    public String getNome() { 
        return nome;
    }

    /**Recebe nome do estudante.
     * @param  nome String - nome do estudante.
     * @return void.
     */
    public void setNome(String nome) { 
        this.nome = nome;
    }

    /**Retorna o sexo do estudante.
     * @return String - retorna o sexo do estudante
     */
    public String getSexo() { 
        return sexo;
    }

    /**Recebe sexo do estudante.
     * @param  sexo String - sexo do estudante.
     * @return void.
     */
    public void setSexo(String sexo) { 
        this.sexo = sexo;
    }

    /**Retorna a data de nascimento do estudante.
     * @return String - retorna a data de nascimento do estudante
     */
    public String getDataNasc() { 
        return dataNasc;
    }

    /**Recebe data de nascimeto do estudante.
     * @param  dataNasc String - Data de nascimento do estudante.
     * @return void.
     */
    public void setDataNasc(String dataNasc) { 
        this.dataNasc = dataNasc;
    }

    /**Retorna o rg do estudante.
     * @return String - retorna o rg do estudante
     */
    public String getRg() { 
        return rg;
    }

    /**Recebe rg do estudante.
     * @param  rg String - rg do estudante.
     * @return void.
     */
    public void setRg(String rg) { 
        this.rg = rg;
    }
    
    /**Retorna o cpf do estudante.
     * @return String - retorna o cpf do estudante
     */
    public String getCpf() { 
        return cpf;
    }

    /**Recebe cpf do estudante.
     * @param  cpf String - cpf do estudante.
     * @return void.
     */
    public void setCpf(String cpf) { 
        this.cpf = cpf;
    }
    
    /**Retorna o celular do estudante.
     * @return String - retorna o celular do estudante
     */
    public String getCelular() { 
        return celular;
    }

    /**Recebe celular do estudante.
     * @param  celular String - celular do estudante.
     * @return void.
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }

    /**Retorna o telefone do estudante.
     * @return String - retorna o telefone do estudante
     */
    public String getTelefone() { 
        return telefone;
    }

    /**Recebe telefone do estudante.
     * @param  telefone String - telefone do estudante.
     * @return void.
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**Retorna o email do estudante.
     * @return String - retorna o email do estudante
     */
    public String getEmail() { 
        return email;
    }

    /**Recebe email do estudante.
     * @param  email String - email do estudante.
     * @return void.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**Retorna o endereÃ§o do estudante.
     * @return String - retorna o endereÃ§o do estudante
     */
    public String getEnd() { 
        return end;
    }

    /**Recebe endereÃ§o do estudante.
     * @param  end String - endereÃ§o do estudante.
     * @return void.
     */
    public void setEnd(String end) { 
        this.end = end;
    }

    /**Retorna o bairro do estudante.
     * @return String - retorna o bairro do estudante
     */
    public String getBairro() { 
        return bairro;
    }

    /**Recebe bairro do estudante.
     * @param  bairro String - bairro do estudante.
     * @return void.
     */
    public void setBairro(String bairro) { 
        this.bairro = bairro;
    }

    /**Retorna a cidade do estudante.
     * @return String - retorna a cidade do estudante
     */
    public String getCidade() { 
        return cidade;
    }

    /**Recebe cidade do estudante.
     * @param  cidade String - cidade do estudante.
     * @return void.
     */
    public void setCidade(String cidade) { 
        this.cidade = cidade;
    }

    /**Retorna o cep do estudante.
     * @return String - retorna o cep do estudante
     */
    public String getCep() {
        return cep;
    }

    /**Recebe cep do estudante.
     * @param  cep String - cep do estudante.
     * @return void.
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**Retorna o estado do estudante.
     * @return String - retorna o estado do estudante
     */
    public String getUf() { 
        return uf;
    }

    /**Recebe esado do estudante.
     * @param  uf String - estado do estudante.
     * @return void.
     */
    public void setUf(String uf) { 
        this.uf = uf;
    }

    /**Retorna o numero da casa do estudante.
     * @return String - retorna o numero da casa do estudante
     */
    public String getNum() {
        return num;
    }

    /**Recebe numero da casa do estudante.
     * @param  num String - numero da casa do estudante.
     * @return void.
     */
    public void setNum(String num) { 
        this.num = num;
    }

    
}
