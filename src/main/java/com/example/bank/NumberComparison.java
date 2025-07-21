package com.example.bank;

public class NumberComparison {

/*    In Java, the Integer class has a special optimization called Integer Caching.
    Java caches Integer objects for values in the range -128 to 127. Why? Well,
    Java tries to optimize memory usage, and values in this range are
    pretty commonly used, so instead of creating new objects for each one, it reuses the same ones.
    Java doesn’t create two separate objects in memory for x and y. Instead, it reuses the cached Integer object for 1.
    This is why x == y returns true. Both x and y are pointing to the same object in memory.
    Since 128 is outside the cached range, Java creates two separate Integer objects. So even though both a and b have the value 128,
    they are two different objects in memory. That’s why a == b returns false — it’s comparing two different memory locations, not the actual values
    */

    public static void main(String[] args) {

        Integer a = 1;
        Integer b = 1 ;

        Integer x = 128;
        Integer y = 128;

        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));

        System.out.println(x ==y);
        System.out.println(System.identityHashCode(x));
        System.out.println(System.identityHashCode(y));
        System.out.println(x.equals(y));

    }
}
