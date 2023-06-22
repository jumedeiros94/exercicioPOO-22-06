package ContaBancaria;

public class ContaEspecial extends ContaBancaria{

    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        String s = "ContaEspecial[";
        s += " limite: " + limite;
        s += "; " + super.toString();
        s += "]" ;
        return s;
    }

    public boolean sacar(double valor) {

        double saldoComLimite = this.getSaldoBancario() + limite;

        if ((saldoComLimite - valor) >= 0) {
            this.setSaldoBancario(this.getSaldoBancario() - valor);

            return true;
        }

        return false;
    }
}
