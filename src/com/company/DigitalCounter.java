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

public class DigitalCounter extends Counter {

    public DigitalCounter(int initialValue) {
        super(initialValue);
    }

    @Override
    public void printCurrentNumber(String msg) {
        System.out.println(msg + "Digital counter is producing new super format " + this.number * 100);
    }
}
