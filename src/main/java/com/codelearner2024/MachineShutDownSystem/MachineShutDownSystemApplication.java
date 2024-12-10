package com.codelearner2024.MachineShutDownSystem;

import com.codelearner2024.MachineShutDownSystem.shutdownsystem.RestartService;
import com.codelearner2024.MachineShutDownSystem.shutdownsystem.ShutDownService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.Scanner;


@SpringBootApplication
public class MachineShutDownSystemApplication {


    public static void main(String[] args) {
        SpringApplication.run(MachineShutDownSystemApplication.class, args);
        Scanner scanner = new Scanner(System.in);

        final ShutDownService shutdown = null;
        final RestartService restart = null;

        System.out.println("Choisissez une option : ");
        System.out.println("1. Éteindre l'ordinateur");
        System.out.println("2. Redémarrer l'ordinateur");
        System.out.print("Entrez votre choix (1 ou 2) : ");
        int choix = scanner.nextInt();

        try {
            if (choix == 1) {
                System.out.println("L'ordinateur va s'éteindre...");
                shutdown.shutdown();
            } else if (choix == 2) {
                System.out.println("L'ordinateur va redémarrer...");
                restart.restart();
            } else {
                System.out.println("Choix invalide.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        scanner.close();
    }


}


