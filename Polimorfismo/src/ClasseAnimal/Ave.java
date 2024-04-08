public class Ave extends Animal{
    private String corPena;
    public Ave(float peso, int idade, int membros) {
        super(peso, idade, membros);
    }

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comida de ave");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave");
    }

    public void construirNinho(){
        System.out.println("Ninho construido");
        
    }
    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
}