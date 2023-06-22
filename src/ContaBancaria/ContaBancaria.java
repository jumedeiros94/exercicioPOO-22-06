package ContaBancaria;

public class ContaBancaria {
    private String nomeDoCliente;
    private int numConta;
    private double saldoBancario;

    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    public void setNomeDoCliente(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldoBancario() {
        return saldoBancario;
    }

    public void setSaldoBancario(double saldoBancario) {
        this.saldoBancario = saldoBancario;
    }

    @Override
    public String toString() {
        String s = "ContaBancaria[";
        s += " nomeCliente: " + nomeDoCliente;
        s += "; numConta: " + numConta;
        s += "; saldo: " + saldoBancario;
        s += "]" ;
        return s;
    }

    public void depositar(double valor){
        saldoBancario += valor;
    }

    public boolean sacar(double valor){
        if ((saldoBancario-valor) >=0){
            saldoBancario -= valor;
            return true;
        }
        return false;
    }
}



