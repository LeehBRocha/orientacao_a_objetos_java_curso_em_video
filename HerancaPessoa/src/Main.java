public class Main {
    public static void main(String[] args) {
        Aluno p1 = new Aluno("Lucas", 13, "masculino","Ciencia da Computacao");
        Professor p2 = new Professor("Irineu", 50, "masculino", "doutorado", 20000);
        Visitante p3 = new Visitante("Jubileia", 19, "feminino");

        System.out.println(p1.getNome());
    }
}
