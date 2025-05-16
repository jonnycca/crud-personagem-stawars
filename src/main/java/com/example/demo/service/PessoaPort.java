package com.example.demo.service;

import com.example.demo.web.PessoaResponse;

public interface PessoaPort {

    PessoaResponse buscarPessoa(Long id);
}
