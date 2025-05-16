package com.example.demo.web;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "PessoaFeign", url = "https://swapi.bry.com.br/api")
public interface PessoaFeign {

    @RequestMapping(method = RequestMethod.GET, value = "/people/{id}")
    PessoaResponse buscarPessoa(@PathVariable("id") Long id);

}
