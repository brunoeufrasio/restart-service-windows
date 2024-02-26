package com.example.demo.agendamento;

import com.example.demo.service.ServicoWindows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import static java.time.LocalTime.now;

@Component
@Slf4j
public class Agendamento {
    @Autowired
    ServicoWindows servicoWindows;

    @Scheduled(fixedRate = 18000000) // 5 horas em milissegundos
    public void executeTask() {
        log.info(servicoWindows.restartService("Soul Integrator") + " as " + now());
    }
}
