package multipleInheritance;

public class Vehicle implements Engine, MusicSystem {
    
    @Override()
    public void playMusic() {
        System.out.println("Music is playing");
    }

    @Override()
    public void startEngine() {
        System.out.println("Engine starts");
    }
}
