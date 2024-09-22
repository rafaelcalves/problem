package br.com.correa.problem;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class ProblemTestController {
    
    @GetMapping()
    public ResponseEntity<Void> test() {
        System.out.println("foi");
        return ResponseEntity.ok().build();
    }
}
