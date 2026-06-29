package Repository;

import model.Produto;

public interface Repository {
	public void cadastrarProduto(Produto produto);
	public void listarTodos();
	public void atualizarProduto(Produto produto);
	public void deletarProduto(int id); 
	public void listarPorID(int id);
	

}
