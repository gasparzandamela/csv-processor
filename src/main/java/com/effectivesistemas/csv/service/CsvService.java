package com.effectivesistemas.csv.service;

import java.io.File;
import java.util.Scanner;

import org.springframework.stereotype.Service;

@Service
public class CsvService {

    private static final int COLUNAS_ESPERADAS = 4;

    public boolean validarArquivoCsv(File arquivo) {

        try (Scanner scanner = new Scanner(arquivo)) {

            int contadorLinhas = 0;

            while (scanner.hasNextLine()) {

                String linha = scanner.nextLine();
                contadorLinhas++;

                String[] colunas = linha.split(";");

                if (colunas.length != COLUNAS_ESPERADAS) {
                    return false;
                }
            }

            return contadorLinhas > 0;

        } catch (Exception e) {
            return false;
        }
    }
}
