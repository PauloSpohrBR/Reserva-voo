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

import com.br.revervavoo.Entities.Voo;
import com.br.revervavoo.Repositories.VooRepository;

@RestController
@RequestMapping("/voos")
public class VooController {

    @Autowired
    VooRepository vooRepository;

    @PostMapping("/cadastrarVoo")
    public String cadastrarVoo(@RequestBody Voo voo) {
        vooRepository.save(voo);
        return "Voo cadastrado com sucesso!";
    }

    @GetMapping("/buscarVoo")
    public List<Voo> buscarVoo() {
        return vooRepository.findAll();
    }

    @DeleteMapping("/{id}")
    public String deletarVoo(@RequestBody int id) {
        vooRepository.deleteById(id);
        return "Voo deletado com sucesso!";
    }

    @PutMapping("/{id}")
    public String atualizarVoo(@RequestBody Voo voo) {
        vooRepository.save(voo);
        return "Voo atualizado com sucesso!";
    }
}
