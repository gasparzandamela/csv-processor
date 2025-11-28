package com.effectivesistemas.csv.presenter;

import java.io.File;

import org.springframework.stereotype.Component;

import com.effectivesistemas.csv.service.CsvService;
import com.effectivesistemas.csv.util.FileUtil;
import com.effectivesistemas.csv.view.ConsoleView;

@Component
public class CsvPresenter {

    private static final String DIR_PENDENTES = "PENDENTES";
    private static final String DIR_VALIDO = "VALIDO";
    private static final String DIR_INVALIDO = "INVALIDO";

    private final CsvService csvService;
    private final ConsoleView console;

    public CsvPresenter(CsvService csvService, ConsoleView console) {
        this.csvService = csvService;
        this.console = console;
    }

    public void executarProcessamento() {

        // garante existências
        criarDiretoriosNecessarios();

        File pendentes = new File(DIR_PENDENTES);

        if (!pendentes.exists() || !pendentes.isDirectory()) {
            console.exibirErro("Diretório /PENDENTES não encontrado.");
            return;
        }

        File[] arquivos = pendentes.listFiles(
                (dir, name) -> name.toLowerCase().endsWith(".csv"));

        if (arquivos == null || arquivos.length == 0) {
            console.exibirMensagem("Nenhum arquivo CSV encontrado no diretório /PENDENTES.");
            return;
        }

        for (File arquivo : arquivos) {

            boolean valido = csvService.validarArquivoCsv(arquivo);

            try {
                if (valido) {
                    FileUtil.moverArquivo(arquivo, DIR_VALIDO);
                    console.exibirMensagem("Movido para /VALIDO: " + arquivo.getName());
                } else {
                    FileUtil.moverArquivo(arquivo, DIR_INVALIDO);
                    console.exibirAviso("Movido para /INVALIDO: " + arquivo.getName());
                }

            } catch (Exception e) {
                console.exibirErro("Erro ao mover arquivo: " + arquivo.getName() + " -> " + e.getMessage());
            }
        }
    }

    private void criarDiretoriosNecessarios() {
        new File(DIR_VALIDO).mkdirs();
        new File(DIR_INVALIDO).mkdirs();
    }
}
