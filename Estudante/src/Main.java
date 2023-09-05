public class Main {
    public static void main(String[] args) {
    Gincana gincana = new Gincana();
    gincana.setNomeGincana("Gincana estoura pinhatas");

    Estudante estudante1= new Estudante();

    estudante1.setNome("Cleber");
    estudante1.setIdade(20);
    estudante1.setPontos(20);

    Estudante estudante2= new Estudante();

    estudante2.setNome("Robson");
    estudante2.setIdade(30);
    estudante2.setPontos(30);

    Estudante estudante3= new Estudante();
    estudante3.setNome("Adilson");
    estudante3.setIdade(40);
    estudante3.setPontos(40);

    Estudante estudante4= new Estudante();
    estudante4.setNome("Astolfo");
    estudante4.setIdade(50);
    estudante4.setPontos(50);

    gincana.adicionarEstudante(estudante1);
    gincana.adicionarEstudante(estudante2);
    gincana.adicionarEstudante(estudante3);
    gincana.adicionarEstudante(estudante4);

    gincana.exibirVencedor();
    }
}
