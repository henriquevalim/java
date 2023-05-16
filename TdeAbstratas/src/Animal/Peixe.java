package Animal;

public abstract class Peixe extends Animal{
    @Override
    public void comer() {
        System.out.println("comendo como um peixe nhac nhac");
    }

    @Override
    public void dormir() {
        System.out.println("Dormindo como um peixe zzzzz");
    }

    @Override
    public void mover() {
        System.out.println("Se movendo como um peixe SFISH SFISH SFISH");
    }
}

