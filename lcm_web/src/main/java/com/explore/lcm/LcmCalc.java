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

    public BigInteger getLCM(){
        if(factorList.size() == 0){
            return BigInteger.valueOf(0);
        }

        Map<BigInteger, Integer> primeFactors = new HashMap<>();
        for(Integer n : factorList){
            Map<BigInteger, Integer> nFactors = getPrimeFactors(n);
            for(Map.Entry<BigInteger, Integer> entry: nFactors.entrySet()){
                primeFactors.merge(entry.getKey(), entry.getValue(), (v1, v2) -> v1 > v2 ? v1 : v2);
            }
        }

        BigInteger lcm = BigInteger.valueOf(1);
        for(Map.Entry<BigInteger, Integer> entry : primeFactors.entrySet()){
            for(int i=0; i<entry.getValue(); i++){
                lcm = lcm.multiply(entry.getKey());
            }
        }
        return lcm;
    }

    public List<Integer> getFactorList(){
        return factorList;
    }

    public Map<BigInteger, Integer> getPrimeFactors(Integer n){
        Integer count = 2;
        Map<BigInteger, Integer> factors = new HashMap<>();
        while(count < n/2){
            if(n%count == 0){
                factors.merge(BigInteger.valueOf(count), 1, Integer::sum);
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
