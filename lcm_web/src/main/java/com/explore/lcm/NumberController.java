package com.explore.lcm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping(path="/lcm")
public class NumberController {

    private NumberService numberService;

    public NumberController(@Autowired NumberService numberService){
        this.numberService = numberService;
    }
}
