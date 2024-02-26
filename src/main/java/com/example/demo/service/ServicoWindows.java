package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class ServicoWindows {

    public String restartService(String serviceName) {
        try {
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

    public String startService(String serviceName) {
        try {
            // Comando para reiniciar o serviço no Windows
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

    public String stopService(String serviceName) {
        try {
            // Comando para reiniciar o serviço no Windows
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
