package steps;

import com.edsoft.framework.configs.Settings;
import com.edsoft.framework.utilities.CucumberUtil;

import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import pagina.mobile.home.HomePage;
import pagina.mobile.home.LoginPage;
import pagina.mobile.quantidadeProduto.AdicionaCarrinhoPage;
import pagina.mobile.quantidadeProduto.CarrinhoPage;

public class AdicionarProdutoStep {

	private AndroidDriver<MobileElement> driver;
	HomePage homePage = new HomePage(driver);
	LoginPage loginPage = new LoginPage(driver);
	AdicionaCarrinhoPage adicionarCarrinho = new AdicionaCarrinhoPage(driver);
	CarrinhoPage carrinhoPage = new CarrinhoPage(driver);

	@Dado("^que estou com a aplicacao aberta$")
	public void queEstouNaTelaPrincipal() throws Throwable {
		System.out.println("Assert a ser criado");
		Settings.Logs.GravaLog("^que estou com a aplicacao aberta$");
	}

	@E("^clico no botao esquerdo superior$")
	public void clico_no_botao_esquedo_superior() throws Throwable {
		homePage.validaPageMenu().menuIntenelScreen().loginAbaInterna();
		Settings.Logs.GravaLog("^clico no botao esquerdo superior$");
	}

	@Entao("^eu insiro o userName e Password$")
	public void realizo_o_login_informando_o(DataTable table) throws Throwable {
		CucumberUtil.convertDataTableToDisc(table);
		loginPage.login(CucumberUtil.GetCellValueWithRowIndex("username", 1),
				CucumberUtil.GetCellValueWithRowIndex("password", 1));
		Settings.Logs.GravaLog("^eu insiro o userName e Password$");
	}

	@E("^clico no botao logar")
	public void clicar_em_entrar() throws Throwable {
		loginPage.logar();
		Settings.Logs.GravaLog("clico no botao logar");
	}

	@E("^seleciono a categoria do produto \"([^\"]*)\"$")
	public void selecionar_categoria(String categoria) throws Throwable {
		homePage.selecionarCategoria(categoria);
		Settings.Logs.GravaLog("^seleciono a categoria do produto$");
	}

	@E("^seleciono o modelo do produto \"([^\"]*)\"$")
	public void selecionar_o_produto(String produto) throws Throwable {
		adicionarCarrinho.selecionarProduto(produto);
		Settings.Logs.GravaLog("^seleciono o modelo do produto$");
	}

	@E("^seleciono a quantidade desejada$")
	public void seleciona_a_quantidade_desejada(DataTable table) throws Throwable {
		CucumberUtil.convertDataTableToDisc(table);
		adicionarCarrinho.quantidade(CucumberUtil.GetCellValueWithRowIndex("quantidade", 1));
		Settings.Logs.GravaLog("^seleciona a quantidade desejada$");
	}

	@E("^clico no botao superior APPLY$")
	public void clico_no_botao_superior_apply() throws Throwable {
		adicionarCarrinho.botaoApply();
		Settings.Logs.GravaLog("^clico no botao superior APPLY$");
	}

	@Entao("^clico em  adicionar no carrinho$")
	public void adiciono_no_carrinho() throws Throwable {
		adicionarCarrinho.adicionarAoCarrinho();
		Settings.Logs.GravaLog("^clico em  adicionar no carrinho$");
	}

}
