package com.epam;

/**
 * Created by Hrinchenko on 17.03.2016.
 */
public class Main {
    public static void main(String[] args) {

        MyNumGenerator generator = new MyNumGenerator(5,64);

        System.out.println(generator.generate());
        

    }
}
