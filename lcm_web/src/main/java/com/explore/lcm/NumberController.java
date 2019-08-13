package com.explore.lcm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(path="/lcm")
public class NumberController {

    private NumberService numberService;

    public NumberController(@Autowired NumberService numberService){
        this.numberService = numberService;
    }

    @GetMapping("/upto/{n}")
    public ResponseEntity<String> getLcmOneToN(@PathVariable Integer n){
        String answer = numberService.getLcmUpToN(n);
        return new ResponseEntity<>(answer, HttpStatus.OK);
    }

    @GetMapping("/range/{a}/{b}")
    public ResponseEntity<String> getLcmRange(@PathVariable Integer a, @PathVariable Integer b){
        String answer = numberService.getLcmRange(a, b);
        return new ResponseEntity<>(answer, HttpStatus.OK);
    }

}
