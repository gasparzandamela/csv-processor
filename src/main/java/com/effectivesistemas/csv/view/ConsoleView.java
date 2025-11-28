package com.effectivesistemas.csv.view;

import org.springframework.stereotype.Component;

@Component
public class ConsoleView {

    public void exibirMensagem(String mensagem) {
        System.out.println("[MENSAGEM] " + mensagem);
    }

    public void exibirAviso(String aviso) {
        System.out.println("[AVISO] " + aviso);
    }

    public void exibirErro(String erro) {
        System.err.println("[ERRO] " + erro);
    }
}
