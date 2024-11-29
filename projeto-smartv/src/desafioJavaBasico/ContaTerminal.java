package desafioJavaBasico;

public class ContaTerminal {

    int numeroDaConta;
    String agencia;
    String nomeCliente;
    double saldoDaConta = 1400;

    public ContaTerminal() {
    }

    public ContaTerminal (int numeroDaConta, String agencia, String nomeCliente, double saldoDaConta) {
        this.agencia = agencia;
        this.nomeCliente = agencia;
        this.numeroDaConta = numeroDaConta;
        this.saldoDaConta = saldoDaConta;
    } 

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldoDaConta() {
        return saldoDaConta;
    }

    public void setSaldoDaConta(double saldoDaConta) {
        this.saldoDaConta = saldoDaConta;
    }

    public void imprimir () {
        System.out.print("Olá " + nomeCliente 
        + ", obrigado por criar uma conta em nosso banco, sua agência é " 
        + agencia 
        + ", conta " 
        + numeroDaConta 
        + " e seu saldo R$ "
        + saldoDaConta 
        + " já está disponível para saque!!");

    }
}
