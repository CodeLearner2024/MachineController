package com.codelearner2024.MachineShutDownSystem.shutdownsystem;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ShutDownService {

    public  void shutdown() throws IOException {
        String os = System.getProperty("os.name").toLowerCase();

        if (os.contains("win")) {
            // Pour Windows
            Runtime.getRuntime().exec("shutdown -s -t 0");
        } else if (os.contains("nix") || os.contains("nux") || os.contains("mac")) {
            // Pour Linux/macOS
            Runtime.getRuntime().exec("shutdown -h now");
        } else {
            System.out.println("Système d'exploitation non pris en charge.");
        }
    }


}
