package JavaBrain;

public interface car {

    void drive();
    void fuel(String fuel);

    default void driveable() {
        System.out.println("car need to be driveable. I am a default interface method. Class dos nto have to call me ");
    }
}
