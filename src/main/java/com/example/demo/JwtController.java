package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/jwt")
public class JwtController {

    @PostMapping("/generate")
    public String generateJWT(@RequestBody User user) {
        if (user.getUsername() == null || user.getUsername().isBlank()
                || user.getRole() == null || user.getRole().isBlank()) {
            throw new IllegalArgumentException("username and role are required");
        }

        return JwtUtil.generateToken(user);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String handleBadRequest(IllegalArgumentException ex) {
        return ex.getMessage();
    }
}
