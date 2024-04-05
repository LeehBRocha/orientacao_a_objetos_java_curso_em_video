

public class ContaBanco{
    public int numConta;
    protected String tipo;
    private String nome;
    private double saldo;
    private boolean status;

    public ContaBanco(int numConta, String tipo, String nome){
        this.numConta = numConta;
        this.tipo = tipo;
        this.nome = nome;
        this.saldo = 0;
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta(){
        this.status = true;
        //se abrir conta corrente, começa com um adicional de 50 reais
        //se abrir conta poupança, começa com um adicional de 150 reais
        if (this.tipo == "CC"){
            this.saldo += 50;
        } else if (this.tipo == "CP"){
            this.saldo += 150;
        } 
    }

    public String fecharConta(){
        if (this.saldo == 0){
            this.status = false;
            return "Conta fechada com sucesso!!";
        }
        return "Erro ao fechar conta!! Verifique se a conta tem algum saldo ou debito pendente";
    }

    public String depositar(int valor){
        if(this.status == true){
            this.saldo = saldo + valor;
            return "Deposito no valor de "+valor+" reais realizado com sucesso!!\nSaldo atual corresponde ao valor de "+this.saldo+" reais.";
        }
        return "É necessário ter uma conta aberta para realizar o deposito!!";

    }

    public String sacar(int valor){
        if(this.status == true){
            if(this.saldo >= valor){
                this.saldo = saldo - valor;
                return "Saque no valor de "+valor+" reais realizado com sucesso!!\nSaldo atual corresponde ao valor de "+this.saldo+" reais.";
            }
            return "É necessário ter saldo suficiente para realizar o saque!!";
        }
        return "É necessário ter uma conta aberta para realizar o deposito!!";

    }

    public String pagarMensal(){
        //Conta corrente tem uma mensalidade correspondente a 12 reais
        //Conta poupança tem uma mensalidade correspondente a 20 reais
        if (this.tipo == "CC"){
            this.saldo -= 12;
        } else if (this.tipo == "CP"){
            this.saldo -= 20;
        }
        
        return "O pagamento da mensalidade foi realizado com sucesso!!\nSaldo atual corresponde ao valor de "+this.saldo+" reais.";

    }

}