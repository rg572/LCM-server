package com.explore.lcm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

        return calc.getLCM().toString();
    }
}
