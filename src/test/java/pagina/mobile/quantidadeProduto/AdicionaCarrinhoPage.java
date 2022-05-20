package pagina.mobile.quantidadeProduto;

import static com.edsoft.framework.base.mobile.DriverFactory.getDriver;

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

public class AdicionaCarrinhoPage extends BasePaginaMobile {

	public AdicionaCarrinhoPage(AppiumDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(id = "com.Advantage.aShopping:id/textViewProductQuantity")
	private MobileElement botaoQuantidade;

	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.ImageView[2]")
	private MobileElement botaoMais;

	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(id = "com.Advantage.aShopping:id/textViewApply")
	private MobileElement botaoApply;

	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(id = "com.Advantage.aShopping:id/buttonProductAddToCart")
	private MobileElement botaoADDcarrinho;

	@Step("Selecionar \"Produto\"")
	public AdicionaCarrinhoPage selecionarProduto(String produto) {
		if (getDriver() instanceof IOSDriver) {
		} else {
			DriverContextMobile.clicarPorTexto(produto);
			DriverContextMobile.salvarEvidencia("Selecionar Produto");
		}
		return this;
	}

	@Step("Selecionar quantidade de \"Produto\"")
	public AdicionaCarrinhoPage quantidade(String valor) throws Exception {
		if (getDriver() instanceof IOSDriver) {
		} else {
			int quant = Integer.parseInt(valor);
			quant--;
			DriverContextMobile.aguardarCarregamentoElemento(botaoQuantidade);
			DriverContextMobile.tocarElemento(botaoQuantidade, "clicar na quantidade");
			for (int i = 0; i < quant; i++) {
				botaoMais.click();
			}
		}
		return this;
	}

	public AdicionaCarrinhoPage botaoApply() throws Exception {
		if (getDriver() instanceof IOSDriver) {
		} else {
			DriverContextMobile.aguardarCarregamentoElemento(botaoApply);
			DriverContextMobile.tocarElemento(botaoApply, "clicar no botao apply");
			DriverContextMobile.salvarEvidencia("quantidade adicionada");
		}
		return this;
	}

	public AdicionaCarrinhoPage adicionarAoCarrinho() throws Exception {
		if (getDriver() instanceof IOSDriver) {
		} else {
			DriverContextMobile.aguardarCarregamentoElemento(botaoADDcarrinho);
			DriverContextMobile.tocarElemento(botaoADDcarrinho, "clicar no botao de adicionar produto");
		}
		return this;
	}
}
