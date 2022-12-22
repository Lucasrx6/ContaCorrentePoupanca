package ExercicioConta;

public abstract class Conta {

    //-----------------------------Atributos e Getters e Setters-----------------------------
    private int num_agencia;
    public int getNum_agencia() {
        return num_agencia;
    }

    public void setNum_agencia(int num_agencia) {
        this.num_agencia = num_agencia;
    }

    private int num_conta;
    public int getNum_conta() {
        return num_conta;
    }

    public void setNum_conta(int num_conta) {
        this.num_conta = num_conta;
    }

    private String tipo_conta;
    public String getTipo_conta() {
        return tipo_conta;
    }

    public void setTipo_conta(String tipo_conta) {
        this.tipo_conta = tipo_conta;
    }

    private Double saldo;
    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    private Double deposito;
    public Double getDeposito() {
        return deposito;
    }

    public void setDeposito(Double deposito) {
        this.deposito = deposito;
    }

    private Double saque;


    public Double getSaque() {
        return saque;
    }

    public void setSaque(Double saque) {
        this.saque = saque;
    }

    //-----------------------------Metodos da Atividade-----------------------------

    public Double ConsultaSaldo(Double saldo){
        this.saldo = saldo;
        return saldo;
    }

    public Double DepositaSaldo(int num_conta, Double saldo, Double deposito){
        this.num_conta = num_conta;
        this.saldo = saldo;
        this.deposito = deposito;
        return saldo = (saldo + deposito);

    }

    public Double SacarValor(int num_conta, Double saldo, Double saque){
        this.num_conta = num_conta;
        this.saldo = saldo;
        this.saque = saque;
        return saldo = (saldo - saque);

    }

    



}
