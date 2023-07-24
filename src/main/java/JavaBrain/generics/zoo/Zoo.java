package JavaBrain.generics.zoo;

public class Zoo {
    public static void main(String[] args) {
        Cage<Monkey> cage = new Cage<>(new Monkey(), new Monkey());
        Monkey animal = cage.getAnimal1();

//        Cage<Monkey> cage = new Cage<Monkey>();
//        cage.setAnimal1(new Monkey());
//        cage.setAnimal2(new Monkey());
//        Monkey animal1 = cage.getAnimal1();


        Cage<Lion> lionCage = new Cage<Lion>();
        lionCage.setAnimal1(new Lion());
        lionCage.setAnimal2(new Lion());
    }
}
