package com.explore.lcm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
public class NumberService {

    private LcmCalc calc;

    public NumberService(@Autowired LcmCalc calc){
        this.calc = calc;
    }

    public String getLcmUpToN(Integer n){
        calc.clearFactors();

        for(int i = 2; i <= n; i++){
            calc.addFactor(i);
        }

        BigInteger answer =  calc.getLCM();
        return String.format("%,d",answer);
    }

    public String getLcmRange(Integer a, Integer b){
        calc.clearFactors();

        for(int i = a; i <= b; i++){
            calc.addFactor(i);
        }

        BigInteger answer = calc.getLCM();
        return String.format("%,d",answer);
    }
}
