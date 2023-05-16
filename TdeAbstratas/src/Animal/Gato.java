package Animal;

public abstract class Gato extends Animal{
    @Override
    public void comer() {
        System.out.println("comendo como um gato nhom nhom");
    }

    @Override
    public void dormir() {
        System.out.println("Dormindo como um gato zzzzz");
    }

    @Override
    public void mover() {
        System.out.println("Se movendo como um gato tap tap tap");
    }
}

