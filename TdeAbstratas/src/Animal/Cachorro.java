package Animal;

public abstract class Cachorro extends Animal{
    @Override
    public void comer() {
        System.out.println("comendo como um cachorro nhom nhom");
    }

    @Override
    public void dormir() {
        System.out.println("Dormindo como um cahorro zzzzz");
    }

    @Override
    public void mover() {
        System.out.println("Se movendo como um cachorro tap tap tap");
    }
}
