public class Repitil extends Animal {
    private String corEscama;
    public Repitil(float peso, int idade, int membros) {
        super(peso, idade, membros);
    }

    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comida de repitil");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de repitil");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}
