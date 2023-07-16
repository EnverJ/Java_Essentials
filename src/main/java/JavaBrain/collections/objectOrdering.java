package JavaBrain.collections;

public class objectOrdering {
    // what is needed for ordering?     -- comparison
    // 1.  Sorting
    //   with object
    //objA > objB
    // 1 . there's object state in objectA and objectB
    // 2. There is a clear definition of comparison of those value
    // 3. Individual values of combination of values
    // no t all objects are comparable
    // Ex: tw database connection instance

    // the comparable interface
    public interface Comparable<T> {
        int comparableTo(T o);
    }
    /*
    1. >
    2. <
    3. ==
     */
    // indicate that an object is comparable


}
