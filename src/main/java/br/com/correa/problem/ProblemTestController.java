package br.com.correa.problem;

import java.util.logging.Logger;

import org.springframework.context.MessageSource;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class ProblemTestController {

    private static final Logger log = Logger.getLogger(ProblemTestController.class.getName());
    private final MessageSource messageSource;

    @GetMapping("")
    public ResponseEntity<Void> test(@Validated @RequestBody TestPojo test) {
        // System.out.println(messageSource.getMessage("error.name",null,Locale.getDefault()));
        // return ResponseEntity.ok().build();
        // PropertyChangeEvent event = new PropertyChangeEvent(test.name(), "Id Blabla","valor anterior","valor novo");
        // throw new ConversionNotSupportedException(event,Integer.class,new RuntimeException("Test Exception"));
        throw new ProblemTestException();
    }
}
