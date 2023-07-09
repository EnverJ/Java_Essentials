package JavaBrain;

public class cars {
    private  String seats;
    private  String make;

     public  boolean equals( Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return  false;
         cars car = (cars) o;
         if ( seats != car.seats) return  false;

        return  make != null ? make.equals(car.make) : car.make == null;

     }

}
