package com.explore.lcm;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LcmCalc {

    private List<Integer> factorList;

    public LcmCalc(){
        this.factorList = new ArrayList<>();
    }

    public void addFactor(Integer factor){
        if(factor > 0) {
            this.factorList.add(factor);
        }
    }

    public List<Integer> getFactorList(){
        return factorList;
    }

    public Map<BigInteger, Integer> getPrimeFactors(Integer n){
        Integer count = 2;
        Map<BigInteger, Integer> factors = new HashMap<>();
        while(count < n/2){
            if(n%count == 0){
                factors.merge(BigInteger.valueOf(n), 1, Integer::sum);
                n = n/count;
                count = 2;
            }
            else{
                count++;
            }
        }
        factors.merge(BigInteger.valueOf(n), 1, Integer::sum);
        return factors;
    }


}
