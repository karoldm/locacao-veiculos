
package models;

import java.io.Serializable;
import java.util.Calendar;

/**
 *
 * @author karolyne Marques
 */
public class Usuario implements Serializable{
    protected int codigoUsuario;
    protected String nome;
    protected String cpf;
    protected String rg;
    protected Calendar dataNascimento;
    protected String endereco;
    protected String cep;
    protected String email;
    
    public Usuario(int codigoUsuario,
            String nome,
            String cpf,
            String rg,
            Calendar dataNascimento,
            String endereco,
            String cep,
            String email){
        this.codigoUsuario = codigoUsuario;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.cep = cep;
        this.email = email;
    }

    public int getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(int codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public String toString(){
        return "\nCódigo do Usuário: " + getCodigoUsuario()
                + "\nNome: " + getNome()
                + "\nCPF: " + getCpf()
                + "\nRG: " + getRg()
                + "\nData de Nascimento: " + getDataNascimento()
                + "\nEndereço: " + getEndereco()
                + "\nCEP: " + getCep()
                + "\nEmail: " + getEmail();
    } 
}
