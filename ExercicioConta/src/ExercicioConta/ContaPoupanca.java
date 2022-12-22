package ExercicioConta;

public final class ContaPoupanca extends Conta {

    double saldo;
    int num_conta;
    Double deposito;

    public Double DepSaldoPoupanca(int num_conta, Double saldo, Double deposito){
        this.num_conta = num_conta;
        this.saldo = saldo;
        this.deposito = deposito;
        deposito = (deposito + 15/100);
        return saldo = (saldo + deposito);

    }
}
