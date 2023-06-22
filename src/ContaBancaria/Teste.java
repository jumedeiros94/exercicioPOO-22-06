package ContaBancaria;

public class Teste {
    public static void main(String[] args) {

        System.out.println("*** Teste ContaBancaria ***");

        ContaBancaria contaSimples = new ContaBancaria();
        contaSimples.setNomeDoCliente("Cliente Conta Simples");
        contaSimples.setNumConta(0001);

        contaSimples.depositar(100);

        realizarSaque(contaSimples, 50);

        realizarSaque(contaSimples, 70);

        System.out.println(contaSimples);

        System.out.println("*** Teste ContaPoupança ***");

        ContaPoupanca contaPoupacanca = new ContaPoupanca();
        contaPoupacanca.setNomeDoCliente("Cliente Conta Poupança");
        contaPoupacanca.setNumConta(0002);
        contaPoupacanca.setDiaRendimento(3);

        contaPoupacanca.depositar(100);

        realizarSaque(contaPoupacanca, 50);

        realizarSaque(contaPoupacanca, 70);

        if (contaPoupacanca.calcularNovoSaldo(0.5)){
            System.out.println("Rendimento aplicado, novo saldo é de = " + contaPoupacanca.getSaldoBancario());
        } else {
            System.out.println("Hoje não é dia de rendimento, novo saldo não calculado");
        }

        System.out.println(contaPoupacanca);

        System.out.println("*** Teste ContaEspecial ***");

        ContaEspecial contaEspecial = new ContaEspecial();
        contaEspecial.setNomeDoCliente("Cliente Conta Especial");
        contaEspecial.setNumConta(0003);
        contaEspecial.setLimite(50);

        contaEspecial.depositar(100);

        realizarSaque(contaEspecial, 50);

        realizarSaque(contaEspecial, 70);

        realizarSaque(contaEspecial, 80);

        System.out.println(contaEspecial);
    }

    private static void realizarSaque(ContaBancaria conta, double valor){
        if (conta.sacar(valor)){
            System.out.println("Saque efetuado com sucesso, novo saldo = " + conta.getSaldoBancario());
        } else {
            System.out.println("Saldo insuficiente para saque de " + valor + "; saldo de = " + conta.getSaldoBancario());
        }
    }

    }

