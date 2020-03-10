package de.datev.spring.example.demo.boundary;

import de.datev.spring.example.demo.control.NumberService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class NumberApi {

    private final NumberService numberService;

    @GetMapping (value = "/number/{num}")
    public Long getNumberDoubled (@PathVariable(value = "num") Long num) {
        return this.numberService.doubleNumber(num);
    }
}
