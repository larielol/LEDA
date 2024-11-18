package produto;

import solucao.produto.RepositorioProdutosArray;

/**
 * Classe que representa um repositório de produtos usando arrays como estrutura
 * sobrejacente. Alguns métodos (atualizar, remover e procurar) ou executam com
 * sucesso ou retornam um erro. Para o caso desde exercício, o erro será
 * representado por uma RuntimeException que não precisa ser declarada na
 * clausula "throws" do mos metodos.
 * 
 * Obs: Note que você deve utilizar a estrutura de dados array e não
 * implementações de array prontas da API Collections de Java (como ArrayList,
 * por exemplo).
 * 
 * @author Adalberto
 *
 */
public class RepositorioProdutoPerecivelArray extends RepositorioProdutosArray<ProdutoPerecivel> {
	
	// usando o tamanho para definir o array
	
	public RepositorioProdutoPerecivelArray(int size) {
		super(size);
	}
	
	//inserir o produto na lista de acordo com o tipo, se for produto, adiciona
	
	public void inserir(ProdutoPerecivel produto) {
		if (produto instanceof ProdutoPerecivel) {
			super.inserir(produto);
		}
	}
	
	//atualiza o produto se for do tipo produto
	
	public void atualizar(ProdutoPerecivel produto) {
		if(produto instanceof ProdutoPerecivel) {
			super.atualizar(produto);
		}
	}

}
