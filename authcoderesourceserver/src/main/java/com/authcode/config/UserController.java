package com.authcode.config;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@PreAuthorize("hasRole('USER')")
public class UserController {

    @RequestMapping("/api")
    public Principal resource(Principal principal) {
        return principal;
    }

}
