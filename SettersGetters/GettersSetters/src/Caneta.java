class Caneta{
    public String cor;
    private int valor;
    public Boolean estampa;

    public Caneta(String i, int j, boolean m){
        this.cor = i;
        this.valor = j;
        this.estampa = m;
        this.status();

    }

    public String getCor(){
        return this.cor;
    }

    public void setCor(String i){
        this.cor = i;
    }

    public int getValor(){
        return this.valor;
    }

    public void setValor(int j){
        this.valor = j;
    }

    public void status(){
        System.out.println("===============================");
        System.out.println("INFORMACOES DA CANETA: ");
        System.out.println("Cor = " + this.cor);
        System.out.println("Valor = "+ this.valor+" reais");
        System.out.println("Está tampada? "+this.estampa);
        System.out.println("===============================\n");
       
    }
}