package com.Bridagelabz.springBoot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BookController {
    @GetMapping("/Book")
    public List<Book> getAllbook()
    {
        return Arrays.asList( new Book(12,"Spring","Pallavi Dubey"));
    }
}
