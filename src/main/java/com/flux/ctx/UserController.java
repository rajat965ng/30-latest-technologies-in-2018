package com.flux.ctx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/findAll")
    public Flux<User> findAll(){
       return userRepository.findAll();
    }

    @PostMapping("/save")
    public Mono<User> save(@RequestBody User user){
        return userRepository.save(user);
    }

    @GetMapping("/find/{id}")
    public Mono<ResponseEntity<User>> findById(@PathVariable("id") Long id){
        return userRepository.findById(id)
                .map(user -> ResponseEntity.ok(user))
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @PutMapping("/update/{id}")
    public Mono<ResponseEntity<User>> updateUser(@PathVariable Long id,
                                                 @RequestBody User user){

        return userRepository.findById(id).flatMap(usr -> {
            usr.setName(user.getName());
            return userRepository.save(usr);
        }).map(usr -> ResponseEntity.ok(usr)).defaultIfEmpty(ResponseEntity.notFound().build());

    }

    @GetMapping(value = "/stream/user", produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
    public Flux<User> findAllStream(){
        return userRepository.findAll();
    }

}
