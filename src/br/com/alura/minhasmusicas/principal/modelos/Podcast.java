package br.com.alura.minhasmusicas.principal.modelos;

public class Podcast extends Audio {
    private String Apresentador;
    private String descricao;

    public String getApresentador() {
        return Apresentador;
    }

    public void setApresentador(String apresentador) {
        Apresentador = apresentador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int getClassificacao() {
        if(this.getTotalCurtidas() > 500) {
            return 10;
        } else {
            return 8;
        }

    }
}
