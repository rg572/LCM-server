package com.explore.lcm;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class LcmCalcTest {

    @Test
    public void testAddFactor(){
        // Given
        LcmCalc calc = new LcmCalc();
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(3);
        expected.add(4);

        // When
        calc.addFactor(2);
        calc.addFactor(3);
        calc.addFactor(4);
        List<Integer> actual = calc.getFactorList();

        // Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testGetPrimeFactors1(){
        // Given
        LcmCalc calc = new LcmCalc();
        Map<BigInteger, Integer> expected = new HashMap<>();
        expected.put(BigInteger.valueOf(2),1);
        expected.put(BigInteger.valueOf(5),1);

        // When
        Map<BigInteger, Integer> actual = calc.getPrimeFactors(10);

        // Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testGetPrimeFactors2(){
        // Given
        LcmCalc calc = new LcmCalc();
        Map<BigInteger, Integer> expected = new HashMap<>();
        expected.put(BigInteger.valueOf(3),3);

        // When
        Map<BigInteger, Integer> actual = calc.getPrimeFactors(27);

        // Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testGetPrimeFactors3(){
        // Given
        LcmCalc calc = new LcmCalc();
        Map<BigInteger, Integer> expected = new HashMap<>();
        expected.put(BigInteger.valueOf(2),4);

        // When
        Map<BigInteger, Integer> actual = calc.getPrimeFactors(16);

        // Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testGetPrimeFactors4(){
        // Given
        LcmCalc calc = new LcmCalc();
        Map<BigInteger, Integer> expected = new HashMap<>();
        expected.put(BigInteger.valueOf(2),2);

        // When
        Map<BigInteger, Integer> actual = calc.getPrimeFactors(4);

        // Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testGetPrimeFactors5(){
        // Given
        LcmCalc calc = new LcmCalc();
        Map<BigInteger, Integer> expected = new HashMap<>();
        expected.put(BigInteger.valueOf(2),3);

        // When
        Map<BigInteger, Integer> actual = calc.getPrimeFactors(8);

        // Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testGetLCM1(){
        // Given
        LcmCalc calc = new LcmCalc();
        for(int i =1; i <= 10; i++){
            calc.addFactor(i);
        }
        BigInteger expected = BigInteger.valueOf(2520);

        // When
        BigInteger actual = calc.getLCM();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetLCM2(){
        // Given
        LcmCalc calc = new LcmCalc();
        for(int i =1; i <= 20; i++){
            calc.addFactor(i);
        }
        BigInteger expected = BigInteger.valueOf(232792560);

        // When
        BigInteger actual = calc.getLCM();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetLCM3(){
        // Given
        LcmCalc calc = new LcmCalc();
        for(int i =1; i <= 30; i++){
            calc.addFactor(i);
        }
        BigInteger expected = BigInteger.valueOf(2329089562800L);

        // When
        BigInteger actual = calc.getLCM();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void clearTest(){
        // Given
        LcmCalc calc = new LcmCalc();
        calc.addFactor(4);
        calc.addFactor(6);
        Integer expected = 0;

        // When
        calc.clearFactors();
        Integer actual = calc.getFactorList().size();

        // Then
        Assert.assertEquals(expected, actual);
    }


}
