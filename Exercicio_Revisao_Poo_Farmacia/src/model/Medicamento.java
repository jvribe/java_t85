package model;

public class Medicamento extends Produto {
    
    private int receita;

    // Construtor corrigido para aceitar a receita
    public Medicamento(int id, String nome, int tipo, float preco, int receita) {
        super(id, nome, tipo, preco);
        this.receita = receita;
    }

    public int getReceita() {
        return receita;
    }

    public void setReceita(int receita) {
        this.receita = receita;
    }
    
    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("Medicamento controlado por receita? " + (this.receita == 1 ? "Sim" : "Não"));
    }
}