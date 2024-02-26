package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

@RestController
public class ServiceController {
    @PostMapping("/restartService")
    public String restartService() {
        try {
            // Nome do serviço que você deseja reiniciar
            String serviceName = "MySQL80";

            // Comando para reiniciar o serviço no Windows
            String restartCommand = "cmd.exe /c net stop " + serviceName + " && net start " + serviceName;


            // Executar o comando
            Process process = Runtime.getRuntime().exec(restartCommand);

            // Aguardar a finalização do processo
            int exitCode = process.waitFor();

            // Verificar se o comando foi executado com sucesso
            if (exitCode == 0) {
                return "Serviço reiniciado com sucesso.";
            } else {
                return "Falha ao reiniciar o serviço.";
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "Ocorreu um erro ao reiniciar o serviço.";
        }
    }

    @PostMapping("/startService")
    public String startService() {
        try {
            // Nome do serviço que você deseja reiniciar
            String serviceName = "MySQL80";

            // Comando para reiniciar o serviço no Windows
            //   String restartCommand = "cmd.exe /c net stop " + serviceName + " && net start " + serviceName;
            String restartCommand = "cmd.exe /c net start " + serviceName;

            // Executar o comando
            Process process = Runtime.getRuntime().exec(restartCommand);

            // Aguardar a finalização do processo
            int exitCode = process.waitFor();

            // Verificar se o comando foi executado com sucesso
            if (exitCode == 0) {
                return "Serviço iniciado com sucesso.";
            } else {
                return "Falha ao iniciar o serviço.";
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "Ocorreu um erro ao iniciar o serviço.";
        }
    }

    @PostMapping("/stopService")
    public String stopService() {
        try {
            // Nome do serviço que você deseja reiniciar
            String serviceName = "MySQL80";

            // Comando para reiniciar o serviço no Windows
            //   String restartCommand = "cmd.exe /c net stop " + serviceName + " && net start " + serviceName;
            String restartCommand = "cmd.exe /c net stop " + serviceName;

            // Executar o comando
            Process process = Runtime.getRuntime().exec(restartCommand);

            // Aguardar a finalização do processo
            int exitCode = process.waitFor();

            // Verificar se o comando foi executado com sucesso
            if (exitCode == 0) {
                return "Serviço parado com sucesso.";
            } else {
                return "Falha ao parado o serviço.";
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "Ocorreu um erro ao parado o serviço.";
        }
    }




}
