package com.codelearner2024.MachineShutDownSystem.shutdownsystem;

import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class RestartService {
    public  void restart() throws IOException {
        String os = System.getProperty("os.name").toLowerCase();

        if (os.contains("win")) {
            // Pour Windows
            Runtime.getRuntime().exec("shutdown -r -t 0");
        } else if (os.contains("nix") || os.contains("nux") || os.contains("mac")) {
            // Pour Linux/macOS
            Runtime.getRuntime().exec("reboot");
        } else {
            System.out.println("Système d'exploitation non pris en charge.");
        }
    }


}
