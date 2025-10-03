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

import com.br.revervavoo.Entities.Reserva;
import com.br.revervavoo.Repositories.ReservaRepository;

@RestController
@RequestMapping("/reservas")
public class ReservaController {

    @Autowired
    ReservaRepository reservaRepository;

    @PostMapping("/cadastrarReserva")
    public String cadastrarReserva(@RequestBody Reserva reserva) {
        reservaRepository.save(reserva);
        return "Reserva cadastrada com sucesso!";
    }

    @GetMapping("/buscarReserva")
    public List<Reserva> buscarReserva() {
        return reservaRepository.findAll();
    }

    @DeleteMapping("/{id}")
    public String deletarReserva(@RequestBody int id) {
        reservaRepository.deleteById(id);
        return "Reserva deletada com sucesso!";
    }

    @PutMapping("/{id}")
    public String atualizarReserva(@RequestBody Reserva reserva) {
        reservaRepository.save(reserva);
        return "Reserva atualizada com sucesso!";
    }
}
