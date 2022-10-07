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

import java.util.Objects;

public class Counter {

    int number = 0;

    public Counter(int initialValue) {
        this.number = initialValue;
    }

    public void addOne() {
        number = number + 1;
    }

    public void minusOne() {
        number = number - 1;
    }

    public void printCurrentNumber(String msg) {
        System.out.println(msg + " Current number is " + number);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Counter counter = (Counter) o;
        return number == counter.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
