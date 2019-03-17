package org.anagy.bugreport;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = UserController.API_PATH)
public class UserController {

    static final String API_PATH = "/users";

    @GetMapping
    public Mono<User> getUser() {
        return Mono.just("name")
                .map(User::new);
    }

}
