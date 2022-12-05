/*
We have 5 types to create single tone pattern
    1. Eager
    2. lazy
    3. synchronized
    4. double check
    5. Enum
 */

package com.java.DesignPatterns.CreationalDesignpattern;

public class SingleTonePattern {

    public static void main(String[] args) {

        // Create Multiple instance using public static method.
        Abc obj1 = Abc.getInstance();
        Abc obj2 = Abc.getInstance();
    }
}

class Abc {

    // Create static instance.
    static Abc obj = new Abc();

    //Create private constructor.
    private Abc() {

    }

    // Create a public method which is helps to create same instances.
    public static Abc getInstance() {
        return obj;
    }
}



