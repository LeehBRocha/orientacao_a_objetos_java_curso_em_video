public class Main {
    public static void main(String[] args) {
        Controlador controle = new Controlador();
        System.out.println(controle.ligar());
        System.out.println(controle.abrirMenu());
        controle.maisVolume(2);
        System.out.println(controle.abrirMenu());


    }
}
