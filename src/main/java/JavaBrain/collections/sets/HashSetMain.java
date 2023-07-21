package JavaBrain.collections.sets;

public class HashSetMain {
    // HashSet
    /*
    . The alphabetical file drawer
     -  Implemented by a hash table
    . HashSet bucket structure
     - Contiguous
     - LinkedList

    . HashSet efficiency
     - add - o(1)
     - remove - o(1)
     - contains - o(1)

    . initial capacity
     15 buckets by default.
     HSH lOAD Factor
     number of elements / number of buckets
     Reshaping
     when has load is too high -- double the capacity.
     Load factor: 0.75
     .  initial number of buckets 16;
     . Number of elements: 12;
     . 12/16 = 0.75
     . Rehash time!

     */

    /*
    LinkedHashSet

    Advantage:
    . Insertion order
    . Order iteration o(1) time
    . add 0 O(1)
    . CONTAINS - O(1)
    .  next - o(1)
     */

    /*
    TreeSet
    Binary Search -- removing half of the element everytime.

    requirement:
    every element must be comparable. Must be consistent.
    Performance:
    . add 0 O(log n)
    . contains - O(log n)
    .  iteration - O(lon n)

    Imbalance trees:
    Balanced in o(log n)


     */
    /*
    41. when to user Set
      . position is not important
      . fast lookup
      . fast contains check


      HashSet vs TreeSet
      . use hashSet
       -- Order is not important
       -- Sorting is not important
       --  Good hashing strategy
       -- Predictable load factor

     */
}
