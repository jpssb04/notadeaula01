public class Produto {
    private String nome, cor;
    private int codigo, estoque;
    private double comprimento, largura, altura, peso, valor;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
