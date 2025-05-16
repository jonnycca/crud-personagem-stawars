package com.example.demo.service;

import com.example.demo.web.PessoaFeign;
import com.example.demo.web.PessoaResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuscarPessoaImpl implements PessoaPort{


    @Autowired
    private final PessoaFeign pessoaFeign;

    public BuscarPessoaImpl(PessoaFeign pessoaFeign) {
        this.pessoaFeign = pessoaFeign;
    }

    @Override
    public PessoaResponse buscarPessoa(Long id) {
        PessoaResponse pessoaResponse = pessoaFeign.buscarPessoa(id);
        System.out.println("Cheguei no service" + pessoaResponse.getName());
        return pessoaResponse;
    }
}
