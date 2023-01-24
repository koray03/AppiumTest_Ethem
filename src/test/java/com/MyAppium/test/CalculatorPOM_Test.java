package com.MyAppium.test;

import com.MyAppium.pages.CalculatorPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class CalculatorPOM_Test {

    CalculatorPage calculatorPage = new CalculatorPage();


    @Test
    public void multiplyTest(){

        //5*9=45 verify the result is 45

        calculatorPage.clickDigit(5);
        calculatorPage.multiply.click();
        calculatorPage.clickDigit(9);
        calculatorPage.equals.click();

        String result = calculatorPage.result.getText();

        System.out.println("result = " + result);

        Assertions.assertEquals(45,Integer.parseInt(result));


    }


}
