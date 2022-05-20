package pagina.mobile.home;

import static com.edsoft.framework.base.mobile.DriverFactory.getDriver;

import java.io.IOException;

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

public class LoginPage extends BasePaginaMobile {

	public LoginPage(AppiumDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(xpath = ".//android.widget.RelativeLayout[3]/android.widget.EditText")
	private MobileElement campoUsername;

	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(xpath = ".//android.widget.RelativeLayout[4]/android.widget.EditText")
	private MobileElement campoPassword;

	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(id = "com.Advantage.aShopping:id/buttonLogin")
	private MobileElement botaoLogar;

	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(id = "com.Advantage.aShopping:id/textViewDontHaveAnAccount")
	private MobileElement botaoCriarConta;

	@Step("Preencher os campos de login \"Username e Password\"")
	public LoginPage login(String username, String password) throws Exception {
		if (getDriver() instanceof IOSDriver) {
		} else {
			DriverContextMobile.aguardarCarregamentoElemento(campoUsername);
			campoUsername.sendKeys(username + "\n");

			DriverContextMobile.aguardarCarregamentoElemento(campoPassword);
			campoPassword.sendKeys(password + "\n");
		}
		DriverContextMobile.salvarEvidencia("Preenchimento de login");
		return this;
	}

	public LoginPage logar() throws IOException {
		if (getDriver() instanceof IOSDriver) {
		} else {
			DriverContextMobile.aguardarCarregamentoElemento(botaoLogar);
			botaoLogar.click();
		}
		return this;
	}

	@Step("Clicar no link abaixo \"Criar conta\"")
	public  LoginPage criarConta() {
		if (getDriver() instanceof IOSDriver) {
		} else {
			DriverContextMobile.aguardarCarregamentoElemento(botaoCriarConta);
			botaoCriarConta.click();
		}
		return this;
	}
}
