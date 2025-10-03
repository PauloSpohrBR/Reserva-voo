package com.br.revervavoo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.revervavoo.Entities.Passageiro;
import com.br.revervavoo.Repositories.PassageiroRepository;

@RestController
@RequestMapping("/passageiros")
public class PassageiroController {

    @Autowired
    PassageiroRepository passageiroRepository;

    @PostMapping("/cadastrarPassageiro")
    public String cadastrarPassageiro(@RequestBody Passageiro passageiro) {
        passageiroRepository.save(passageiro);
        return "Passageiro cadastrado com sucesso!";
    }

    @GetMapping("/buscarPassageiro")
    public List<Passageiro> buscarPassageiro() {
        return passageiroRepository.findAll();
    }

    @DeleteMapping("/{id}")
    public String deletarPassageiro(@RequestBody int id) {
        passageiroRepository.deleteById(id);
        return "Passageiro deletado com sucesso!";
    }

    @PutMapping("/{id}")
    public String atualizarPassageiro(@RequestBody Passageiro passageiro) {
        passageiroRepository.save(passageiro);
        return "Passageiro atualizado com sucesso!";
    }

}
