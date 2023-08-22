package com.example.layerdao.controller;

import com.example.layerdao.repository.Repository;
import org.apache.coyote.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {


    Repository repository;

    public Controller (Repository repository) {
        this.repository = repository;
    }

    @GetMapping ("/products/fetch-product")
    public List<String> getProductName(@RequestParam ("name") String name) {


        return repository.getProduct(name);
    }
}
