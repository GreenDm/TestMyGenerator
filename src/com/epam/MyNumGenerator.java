package com.epam;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Hrinchenko on 17.03.2016.
 */
public class MyNumGenerator {

    private int numOfElm;
    private int maxNumb;

    public MyNumGenerator(int numOfElm, int maxNumb) {
        this.numOfElm = numOfElm;
        this.maxNumb = maxNumb;
    }
    public List<Integer> generate() {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i <= numOfElm; i++) {
            int randNum = random.nextInt(maxNumb);
            list.add(randNum);
        }
        return list;
    }
}
