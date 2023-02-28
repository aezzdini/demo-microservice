package com.insy2s.userr;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/v1/userrs")
public record UserrController(UserrService userrService) {


    @PostMapping
    public void registerUserr(@RequestBody UserrRegistrationRequest userrRegistrationRequest) {

        log.info("new userr registration {}", userrRegistrationRequest);
        userrService.registeruserr(userrRegistrationRequest);

    }
}
