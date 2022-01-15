package br.com.ppw.gerenciador.service;

import br.com.ppw.gerenciador.dto.TesteDTO;
import org.springframework.stereotype.Service;

@Service
public class TesteService {

    public TesteDTO ajustarMaiusculas(TesteDTO dados) {
        String nome = dados.getNome();
        int idade = dados.getIdade();
        String email = dados.getEmail();
        String cidade = dados.getCidade();

        System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nEmail: " + email + "\nCidade: " + cidade);

        dados.setNome(nome.toUpperCase());
        dados.setIdade(idade * 2);
        dados.setEmail(email.toUpperCase());
        dados.setCidade(cidade.toUpperCase());

        return dados;
    }

}
