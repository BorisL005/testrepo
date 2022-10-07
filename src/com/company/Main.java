/*
 * *************************************************************************
 * * Yaypay CONFIDENTIAL   2022
 * * All Rights Reserved. * *
 * NOTICE: All information contained herein is, and remains the property of Yaypay Incorporated and its suppliers, if any.
 * The intellectual and technical concepts contained  herein are proprietary to Yaypay Incorporated
 * and its suppliers and may be covered by U.S. and Foreign Patents, patents in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material  is strictly forbidden unless prior written permission is obtained  from Yaypay Incorporated.
 */

package com.company;/*
 * Author : Boris Lepeshenkov
 * Date Created: 2022/10/05
 */

import java.util.Arrays;

public class Main {
    static int counter = 0;

    public static void main(String[] args) {

        Counter firstObject = new Counter(0);

        firstObject.printCurrentNumber("firstPObject");
        addTenTimesAnyCounter(firstObject);
        Counter secondObject = new Counter(100);
        addTenTimesAnyCounter(secondObject);
        secondObject.printCurrentNumber("SecondObject");
        DigitalCounter digitalCounter = new DigitalCounter(155);
        addTenTimesAnyCounter(digitalCounter);
        digitalCounter.printCurrentNumber("Digital Counter");

    }

    private static void addTenTimesAnyCounter(Counter counter){
        counter.addOne();
        counter.addOne();
        counter.addOne();
        counter.addOne();
        counter.addOne();
        counter.addOne();
        counter.addOne();
        counter.addOne();
        counter.addOne();
        counter.addOne();
    }


    private static void addOne() {
        counter = counter + 1;
    }

    private static int addOneFunctional(int number) {
        int initNumber = 0;
        return initNumber + number;
    }

}
