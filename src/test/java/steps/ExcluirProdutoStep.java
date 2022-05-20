package steps;

import cucumber.api.java.pt.E;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import pagina.mobile.cadastro.CadastroPage;
import pagina.mobile.home.HomePage;
import pagina.mobile.quantidadeProduto.CarrinhoPage;

public class ExcluirProdutoStep {

	private AndroidDriver<MobileElement> driver;
	HomePage homePage = new HomePage(driver);
	CarrinhoPage carrinhoPage = new CarrinhoPage(driver);
	CadastroPage cadastro = new CadastroPage(driver);

	@E("^clico no carrinho$")
	public void clicoNoCarrinho() throws Throwable {
		
		homePage.clicarCarrinho();
	}

	@E("^seleciono o produto para exclusao$")
	public void seleciono_o_produto_para_exclusao() throws Throwable {
		carrinhoPage.swipeElementEsquerdaId("com.Advantage.aShopping:id/linearLayoutFront");
	}

	@E("^remocao do produto$")
	public void remocaoDoProduto() throws Throwable {
		carrinhoPage.removerProduto();
	}

}
