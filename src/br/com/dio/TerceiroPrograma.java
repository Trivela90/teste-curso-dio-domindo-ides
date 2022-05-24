package br.com.dio;

    /* Crtl+Alt+o limpa os imports que nao estao
    sendo utilizados (eles ficam na cor cinza,
    igual comentarios) */

    /* Crtl+y apaga a linha em que o cursor
    esta sobre */

    /* Crtl+Alt+L organiza as linhas desalinhadas */
    /* Crtl+Alt+L organiza as linhas desalinhadas
     * Crtl+d duplicou a linha em que meu cursor
     * esatava sobre */

    /* Teste de arrastar (Use Crtl+Shift+cima ou baixo) */

import br.com.dio.model.Gato;

public class TerceiroPrograma {
    /* Neste editor, para criar um main em Java, basta
    apenas escrever main e clicar com o mouse
     */
    public static void main(String[] args) {
        /* coloca cursor em cima do Gato e clica
        Alt+Enter e ele cria, automaticamente, um
        import do Gato */

        Gato gato = new Gato();

        System.out.println(gato);

        Livro livro1 = new Livro("O problema dos 3 corpos",300);
        System.out.println(livro1);

//        int a = 5;
//        int b = 3;
        /* Neste editor, para criar system.out em Java,
        basta apenas digitar sout e clicar
         */
//        System.out.println("Hello World!" + (a+b));

        /* Crtl+/ Comenta por linha
        /* Crtl+Shift+f10   já roda o programa */


    }

    /* Vou selecionar essa frase toda com o cursor
    e apertar Crtl+Shift+/ para comentar ou
     descomentar esse bloco */
}

class Livro {
    private String nome;
    private Integer numPaginas;

    public Livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}
