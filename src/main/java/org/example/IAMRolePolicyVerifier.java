package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class IAMRolePolicyVerifier {

    public static boolean verifyJson(String filePath) {
        try {
            String jsonContent = new String(Files.readAllBytes(Paths.get(filePath)));

            jsonContent = jsonContent.replaceAll("\\s+", "");

            int resourceIndex = jsonContent.indexOf("\"Resource\":\"*\"");
            if (resourceIndex != -1) {
                return false;
            }

            return true;

        } catch (IOException e) {
            System.err.println("Błąd odczytu pliku: " + e.getMessage());
            return false;
        }
    }
}