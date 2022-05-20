package funcionalidade.mobile.quantidadeProduto;

import static com.edsoft.framework.base.mobile.DriverFactory.getDriver;

import java.io.IOException;

import com.edsoft.framework.base.mobile.BaseFuncionalidadeMobile;
import com.itextpdf.text.DocumentException;

import pagina.mobile.quantidadeProduto.AdicionaCarrinhoPage;

public class QuantidadeProdutoFunc extends BaseFuncionalidadeMobile {

	/**
	 * Seleciona Produto @throws Exception, ClassNotFoundException, IOException,
	 * DocumentException
	 */
	public void selecionarProduto(String produto)
			throws ClassNotFoundException, IOException, DocumentException, Exception {
		new AdicionaCarrinhoPage(getDriver()).selecionarProduto(produto);

	}
	
	/**
	 * Seleciona Produto @throws Exception, ClassNotFoundException, IOException,
	 * DocumentException
	 */
	public QuantidadeProdutoFunc adicionarQuantidade(String valor)
			throws ClassNotFoundException, IOException, DocumentException, Exception {
		new AdicionaCarrinhoPage(getDriver()).quantidade(valor);
		return QuantidadeProdutoFunc.this;
	}
	
	/**
	 * Clicar em apply @throws Exception, ClassNotFoundException, IOException,
	 * DocumentException
	 */
	public QuantidadeProdutoFunc clicarEmApply()
			throws ClassNotFoundException, IOException, DocumentException, Exception {
		new AdicionaCarrinhoPage(getDriver()).botaoApply();
		return QuantidadeProdutoFunc.this;
	}
	
	/**
	 * Clicar em Adicionar no carrinho @throws Exception, ClassNotFoundException, IOException,
	 * DocumentException
	 */
	public QuantidadeProdutoFunc adicionarAoCarrinho()
			throws ClassNotFoundException, IOException, DocumentException, Exception {
		new AdicionaCarrinhoPage(getDriver()).adicionarAoCarrinho();
		return QuantidadeProdutoFunc.this;
	}

}
