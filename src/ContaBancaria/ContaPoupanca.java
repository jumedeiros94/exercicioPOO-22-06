package ContaBancaria;

import java.util.Calendar;
import java.util.Date;

public class ContaPoupanca extends ContaBancaria {

    private int diaRendimento;

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    @Override
    public String toString() {
        String s = "ContaPoupança[";
        s += " diaRendimento: " + diaRendimento;
        s += "; " + super.toString();
        s += "]" ;
        return s;
    }

    public boolean calcularNovoSaldo(double taxaRendimento){

        Calendar hoje = Calendar.getInstance();

        if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)){
            this.setSaldoBancario(this.getSaldoBancario() + (this.getSaldoBancario() * taxaRendimento));
            return true;
        }
        return false;
    }
}

