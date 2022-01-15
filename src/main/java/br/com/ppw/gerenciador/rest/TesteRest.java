package br.com.ppw.gerenciador.rest;

import br.com.ppw.gerenciador.dto.TesteDTO;
import br.com.ppw.gerenciador.service.TesteService;
import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/teste")
public class TesteRest {
    
    @Autowired
    private TesteService testeService;
    
    @GetMapping
    public ResponseEntity<String> testeServidor() {
        return ResponseEntity.ok().body("Servidor está ok! Seja bem vindo!!!!");
    }
    
    @GetMapping(path = "/horario")
    public ResponseEntity<String> horaAtual() {
        return ResponseEntity.ok().body("A hora atual é " + LocalDateTime.now());
    }
    
    @PostMapping
    public ResponseEntity<TesteDTO> receberDados(@RequestBody TesteDTO dados) {
        TesteDTO dadosAlterados = testeService.ajustarMaiusculas(dados);
        return ResponseEntity.ok().body(dadosAlterados);
    }
    
}
