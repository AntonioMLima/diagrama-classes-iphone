package com.apple.dispostivos.celular;

import java.util.Random;

import com.apple.dispostivos.navegador.NavegadorDeInternet;
import com.apple.dispostivos.reprodutor.ReprodutorMusical;
import com.apple.dispostivos.telefone.AparelhoTelefonico;

public class Iphone implements NavegadorDeInternet, ReprodutorMusical, AparelhoTelefonico{

    @Override
    public void tocar(String nomeDaMusica) {
        selecionarMusica(nomeDaMusica);
        System.out.println("Tocando " + nomeDaMusica + " pelo iTunes...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música no iTunes...");
    }

    @Override
    public void selecionarMusica(String nomeDaMusisa) {
        System.out.println("Selecionando " + nomeDaMusisa + "...");
    }

    @Override
    public void exibirPagina(String linkDaPagina) {
        System.out.println("Exibindo página pelo Safari...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova página ao Safari...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página no Safari...");
    }

    @Override
    public void ligar(long numero) {
        System.out.println("Ligando para" + numero + " pelo Iphone...");

    }

    @Override
    public void atender(boolean escolha) {
        if (escolha){
            System.out.println("Atendendo ligação com Iphone");
        } else {
            System.out.println("Ligação não atendida.");
            iniciarCorreioDeVoz();
        }
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Inciando correio de voz...");
    }
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.tocar("Money Trees");
        iphone.pausar();

        iphone.exibirPagina("http://google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        iphone.ligar(12234223L);
        boolean escolha = new Random().nextInt(3) == 1;
        System.out.println(escolha);
        iphone.atender(escolha);

    }
}
