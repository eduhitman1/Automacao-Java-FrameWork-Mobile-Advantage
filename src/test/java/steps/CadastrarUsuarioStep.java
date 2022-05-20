package steps;

import java.util.List;

import com.edsoft.framework.configs.Settings;
import com.edsoft.framework.utilities.CucumberUtil;

import cucumber.api.DataTable;
import cucumber.api.java.pt.E;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import pagina.mobile.cadastro.CadastroPage;
import pagina.mobile.home.HomePage;
import pagina.mobile.home.LoginPage;
import pagina.mobile.quantidadeProduto.AdicionaCarrinhoPage;
import pagina.mobile.quantidadeProduto.CarrinhoPage;

public class CadastrarUsuarioStep {

	private AndroidDriver<MobileElement> driver;
	HomePage homePage = new HomePage(driver);
	LoginPage loginPage = new LoginPage(driver);
	AdicionaCarrinhoPage adicionarCarrinho = new AdicionaCarrinhoPage(driver);
	CarrinhoPage carrinhoPage = new CarrinhoPage(driver);
	CadastroPage cadastro = new CadastroPage(driver);

	@E("^seleciono criar uma conta$")
	public void selecionoCriarUmaConta() throws Throwable {
		loginPage.criarConta();
//		cadastro.preemcherDetails("Eduardo", "edu.", "senha", "senhacom");
	}

	@E("^informo os dados account details$")
	public void informoOsDadosAccountDetails(DataTable table) throws Throwable {
		System.out.println("PASSOU");
		CucumberUtil.convertDataTableToDisc(table);
		cadastro.preemcherDetails(CucumberUtil.GetCellValueWithRowIndex("username", 1),
				CucumberUtil.GetCellValueWithRowIndex("email", 1),
				CucumberUtil.GetCellValueWithRowIndex("password", 1),
				CucumberUtil.GetCellValueWithRowIndex("confirmPassword", 1)
				);

		List<String> dataList = table.asList(String.class);
		for (String key : dataList) {
			System.out.println(String.format("Value: %s ", key));
		}
		Settings.Logs.GravaLog("^informo os dados account details$");
	}
}
