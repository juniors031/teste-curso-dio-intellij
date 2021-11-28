package br.com.dio;

import br.com.dio.model.Gato;
import org.w3c.dom.ls.LSOutput;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);

        Livro livro = new Livro("O probs", 400);
//        int a = 5;
//        int b = 3;
//        System.out.println("Hello World!!" + (a+b));
        System.out.println(livro);
    }


}

class Livro {
    String nome;
    Integer npag;

    public Livro(String nome, Integer npag) {
        this.nome = nome;
        this.npag = npag;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNpag() {
        return npag;
    }

    public void setNpag(Integer npag) {
        this.npag = npag;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", npag=" + npag +
                '}';
    }
}
