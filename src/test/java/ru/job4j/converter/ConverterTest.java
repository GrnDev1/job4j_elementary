package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
     float in = 140;
     float expected = 2;
     float out = Converter.rubleToEuro(in);
     float eps = 0.0001f;
     Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert200RblThen3dot3333Dollar() {
        float in = 200;
        float expected = 3.3333f;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert2EuroThen140Rbl() {
        float in = 2;
        float expected = 140;
        float out = Converter.euroToRuble(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert2DollarThen120Rbl() {
        float in = 2;
        float expected = 120;
        float out = Converter.dollarToRuble(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert100DollarThen86Euro() {
        float in = 100;
        float expected = 86;
        float out = Converter.dollarToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert86EuroThen100Dollar() {
        float in = 86;
        float expected = 99.76F;
        float out = Converter.euroToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }
}