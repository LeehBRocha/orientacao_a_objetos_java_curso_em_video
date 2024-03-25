public class Caneta{
    String modelo;
    String cor;
    double ponta;
    int carga;
    boolean tampada;

    void status(){
        System.out.println("A cor da caneta é "+this.cor);
        System.out.println("A ponta da caneta é "+this.ponta);
        System.out.println("A caneta está "+this.tampada);
    }

    void tampar(){
        tampada = true;
    }

    void destampar(){
        tampada = false;

    }




}