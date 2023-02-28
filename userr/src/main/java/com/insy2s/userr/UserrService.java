package com.insy2s.userr;


import org.springframework.stereotype.Service;

@Service
public record UserrService (UserrRepository  userrRepository){
    public void registeruserr(UserrRegistrationRequest request) {

        Userr userr = Userr.builder()
                .firstname(request.firstname())
                .lastname(request.lastname())
                .build();

        //todo: check all
        /// todo: stocker userr en base de donner///
        userrRepository.save(userr);

    }
}
