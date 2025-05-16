package com.example.demo.controller;

import com.example.demo.service.PessoaPort;
import com.example.demo.web.PessoaResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {


    private final PessoaPort buscarPessoa;

    @Autowired
    public PessoaController(PessoaPort buscarPessoa) {
        this.buscarPessoa = buscarPessoa;
    }

    @GetMapping("/{id}")
    public PessoaResponse buscarPessoa(@PathVariable Long id) {
        return buscarPessoa.buscarPessoa(id);
    }
}
