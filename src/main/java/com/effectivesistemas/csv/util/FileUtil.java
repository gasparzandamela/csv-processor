package com.effectivesistemas.csv.util;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileUtil {

    /**
     * Move um arquivo da origem para um diretório destino.
     * Cria o diretório destino caso não exista.
     */
    public static void moverArquivo(File origem, String destino) throws Exception {

        // Cria o diretório destino se não existir
        Path destinoDir = Paths.get(destino);
        if (!Files.exists(destinoDir)) {
            Files.createDirectories(destinoDir);
        }

        // Monta o caminho completo do arquivo a ser movido
        Path destinoPath = destinoDir.resolve(origem.getName());

        // Move o arquivo, substituindo se já existir
        Files.move(origem.toPath(), destinoPath, StandardCopyOption.REPLACE_EXISTING);
    }
}
