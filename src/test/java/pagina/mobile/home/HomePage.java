package pagina.mobile.home;

import static com.edsoft.framework.base.mobile.DriverFactory.getDriver;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import com.edsoft.framework.base.mobile.BasePaginaMobile;
import com.edsoft.framework.base.mobile.DriverContextMobile;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.qameta.allure.Step;

public class HomePage extends BasePaginaMobile {

	public HomePage(AppiumDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(id = "com.Advantage.aShopping:id/textViewAdvantage")
	private MobileElement labelMenu;

	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(id = "com.Advantage.aShopping:id/imageViewMenu")
	private MobileElement abaLogin;

	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(id = "com.Advantage.aShopping:id/textViewMenuUser")
	private MobileElement btnLoginInterna;

	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(id = "com.Advantage.aShopping:id/textViewMenuUser")
	private MobileElement btnCarrinho;
	
	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(id = "com.Advantage.aShopping:id/editTextSearch")
	private MobileElement campoPesquisa; 

	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(id = "com.Advantage.aShopping:id/imageViewSearch")
	private MobileElement lupaPesquisa; 
	

	@Step("Valida mensagem titulo \"Advantage\"")
	public HomePage validaPageMenu() throws Exception {
		Assert.assertEquals("Advantage",
				DriverContextMobile.retornarTexto(labelMenu, "Erro no retorn do titulo do app"));
		DriverContextMobile.salvarEvidencia("Validade mensagem titulo - advantage");
		if (getDriver() instanceof IOSDriver) {
			DriverContextMobile.salvarEvidencia("Validade mensagem titulo - advantage");
		}
		return this;
	}

	@Step("Tocar em \"menu Intenel\"")
	public HomePage menuIntenelScreen() throws Exception {
		DriverContextMobile.aguardarCarregamentoElemento(abaLogin);
		DriverContextMobile.tocarElemento(abaLogin, "Erro na abaLogin");
		if (getDriver() instanceof IOSDriver) {
		}
		return this;
	}

	@Step("Tocar em \"Na aba Login\"")
	public HomePage loginAbaInterna() throws Exception {
		DriverContextMobile.aguardarCarregamentoElemento(btnLoginInterna);
		DriverContextMobile.tocarElemento(btnLoginInterna, "Erro ao tocar no botao login");
		DriverContextMobile.salvarEvidencia("clicar na aba login");
		if (getDriver() instanceof IOSDriver) {
		}
		return this;
	}

	@Step("Seleciona Categoria do \"Produto\"")
	public HomePage selecionarCategoria(String categoria) throws InterruptedException, Exception {
		
//		if (getDriver() instanceof IOSDriver) {
//		} else {
//		}			
			while (DriverContextMobile.verificaExistenciaElementeText(categoria) == false) {
					DriverContextMobile.rolaTelaParaBaixo();
				}
			
        	DriverContextMobile.clicarPorTexto(categoria);
			DriverContextMobile.salvarEvidencia("Selecionar Categoria");
			Thread.sleep(3000);
		
		return this;
	}

	@Step("Seleciona Categoria do \"Produto\"")
	public HomePage clicarCarrinho() throws Exception {
		if (getDriver() instanceof IOSDriver) {
		} else {
			DriverContextMobile.aguardarCarregamentoElemento(btnCarrinho);
			DriverContextMobile.tocarElemento(btnCarrinho, "erro ao tocar no botao do carrinho");
		}
		return this;
	}
	
	@Step("Digitar campo Pesquisa \"Produto\"")
	public HomePage digitarCampoPesquisa(String pesquisaProduto) throws Exception {
		if (getDriver() instanceof IOSDriver) {
		} else {
			DriverContextMobile.aguardarCarregamentoElemento(campoPesquisa);
			DriverContextMobile.escreverTexto(campoPesquisa, pesquisaProduto, "Erro ao digitar no campo pesquisa");
			
			DriverContextMobile.aguardarCarregamentoElemento(lupaPesquisa);
			DriverContextMobile.tocarElemento(lupaPesquisa, "erro ao clicar na imagem de pesquisa");
		}
		return this;
	}
	
	

}
