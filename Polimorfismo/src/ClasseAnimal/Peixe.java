public class Peixe extends Animal{
    private String corEscama;
    public Peixe(float peso, int idade, int membros) {
        super(peso, idade, membros);
    }

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comida de peixe ");
    }

    @Override
    public void emitirSom() {
        System.out.println("Nao emite som");
    }

    public void soltarBolha(){
        System.out.println("Soltou bolha");
        
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}
