package com.test;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by deshan on 3/9/2018.
 */

@RestController
public class DetailController
{

    @RequestMapping(method = RequestMethod.GET, value = "api/test")
    public ResponseEntity<String> show( @RequestParam(value = "Test", required = false) String str )
    {
        return new ResponseEntity<String>( str , HttpStatus.OK );
    }
}
