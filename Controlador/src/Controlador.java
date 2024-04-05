public class Controlador{
    private int volume;
    private boolean tocando;
    private boolean ligado;

    public Controlador(){
        volume = 0;
        tocando = false;
        ligado = false;

    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public String ligar(){
        setLigado(true);
        return "TV Ligada!!";
    }

    public String desligar(){
        setLigado(false);
        return "Desligado com sucesso!!";
    }

    public String abrirMenu(){
        String v ="";
        for(int i=0;i<this.volume;i++){
            v += " |";
        }
        return "\n==========MENU DA TV==========\nTV ESTÁ LIGADA? "+this.ligado+"\nVOLUME = "+this.volume+"\n"+v+"\n==============================";
    }

    public String fecharMenu(){
        return "Menu fechado!!";
    }
    
    public void maisVolume(int valor){
        if(getLigado()==true){
            setVolume(getVolume()+valor);
        }
    }

    public void menosVolume(){
        if(getLigado()==true && getVolume()>0){
            setVolume(getVolume()-1);
        }
    }

    public void play(){
        if (getLigado()==true && getTocando()==false)
            setTocando(true);
    }

    public void pause(){
        if (getLigado()==true && getTocando()==true) {
            setTocando(false);
        }
    }

}