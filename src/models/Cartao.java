
package models;

/**
 *
 * @author karolyne Marques
 */
public class Cartao extends Pagamento{
    private String nome;
    private String bandeira;
    private String numero;
    
    public Cartao(String nome, String bandeira, String numero){
        super("Cartão");
        this.nome = nome;
        this.bandeira = bandeira;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    @Override
    public String toString(){
        return "\nTipo de Pagamento: " + getTipoPagamento()
                + "\nNome: " + getNome()
                + "\nBandeira: " + getBandeira()
                + "\nNúmero: " + getNumero();
    }
}
