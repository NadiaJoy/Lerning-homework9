package org.example;

public class Insurance {

    public int CalcInsurance(int age) {
        int result;

        if (age >= 30 && age <= 65) {
            result = 100;
        } else if (age >= 18 && age <= 29) {
            result = 120;
        } else if (age >= 66 && age <= 79) {
            result = 130;
        } else {
            result = 0;
        }
        return result;
    }
}
