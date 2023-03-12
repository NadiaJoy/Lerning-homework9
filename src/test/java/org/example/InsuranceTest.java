package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class InsuranceTest {
    Insurance insurance;

    @BeforeEach
    public void setBeforeTest () {
        insurance = new Insurance();
    }

    @ParameterizedTest
    @ValueSource(ints = {30, 31, 64, 65, 40})
    public void minInsuranceTest (int age) {
        int result;
        result = insurance.CalcInsurance(age);
        Assert.assertEquals(result, 100);
    }

    @ParameterizedTest
    @ValueSource(ints = {18, 19, 28, 29, 25})
    public void mediumInsuranceTest (int age) {
        int result;
        result = insurance.CalcInsurance(age);
        Assert.assertEquals(result, 120);
    }

    @ParameterizedTest
    @ValueSource(ints = {66, 67, 78, 79, 70})
    public void maxInsuranceTest (int age) {
        int result;
        result = insurance.CalcInsurance(age);
        Assert.assertEquals(result, 130);
    }

    @ParameterizedTest
    @ValueSource(ints = {17, 80, 0, 1, -1})
    public void nonInsuranceTest (int age) {
        int result;
        result = insurance.CalcInsurance(age);
        Assert.assertEquals(result, 0);
    }
}
