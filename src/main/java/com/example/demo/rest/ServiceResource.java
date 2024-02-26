package com.example.demo.rest;

import com.example.demo.service.ServicoWindows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceResource {

    @Autowired
    ServicoWindows servicoWindows;
    @PostMapping("/restartService/{serviceName}")
    public String apiRestartService(@PathVariable String serviceName) {
        return servicoWindows.restartService(serviceName);
    }

    @PostMapping("/startService/{serviceName}")
    public String ApiStartService(@PathVariable String serviceName) {
        return servicoWindows.startService(serviceName);
    }

    @PostMapping("/stopService/{serviceName}")
    public String ApiStopService(@PathVariable String serviceName) {
      return servicoWindows.stopService(serviceName);
    }

}
