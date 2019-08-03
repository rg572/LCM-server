package com.explore.lcm;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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


}
