package com.effectivesistemas.csv.service;

import java.io.File;
import java.util.Scanner;

import org.springframework.stereotype.Service;

@Service
public class CsvService {

    // Número de colunas esperado no CSV
    private static final int COLUNAS_ESPERADAS = 4;

    /**
     * Valida um arquivo CSV.
     * Regras:
     * - Não pode estar vazio
     * - Cada linha deve ter exatamente 4 colunas
     *
     * @param arquivo arquivo CSV a ser validado
     * @return true se o arquivo for válido, false caso contrário
     */
    public boolean validarArquivoCsv(File arquivo) {
        if (arquivo == null || !arquivo.exists() || !arquivo.isFile()) {
            return false; // arquivo inválido
        }

        try (Scanner scanner = new Scanner(arquivo)) {

            int contadorLinhas = 0;

            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine().trim();

                // Ignora linhas vazias
                if (linha.isEmpty()) {
                    continue;
                }

                contadorLinhas++;

                // Divide a linha pelo separador ';'
                String[] colunas = linha.split(";", -1); // -1 mantém colunas vazias

                if (colunas.length != COLUNAS_ESPERADAS) {
                    return false; // linha com número incorreto de colunas
                }
            }

            // Retorna false se o arquivo não tiver nenhuma linha válida
            return contadorLinhas > 0;

        } catch (Exception e) {
            // Se houver erro de leitura, considera inválido
            return false;
        }
    }
}
