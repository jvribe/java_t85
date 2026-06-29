package model;

public class Cosmetico extends Produto {

    private int promocao;

    // Construtor corrigido para aceitar a promoção
    public Cosmetico(int id, String nome, int tipo, float preco, int promocao) {
        super(id, nome, tipo, preco);
        this.promocao = promocao;
    }

    public int getPromocao() {
        return promocao;
    }

    public void setPromocao(int promocao) {
        this.promocao = promocao;
    }
    
    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("Cosmético em promoção? " + (this.promocao == 1 ? "Sim" : "Não"));
    }
}