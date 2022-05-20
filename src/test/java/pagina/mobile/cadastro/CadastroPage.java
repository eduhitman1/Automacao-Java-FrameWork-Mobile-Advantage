package pagina.mobile.cadastro;

import org.openqa.selenium.support.PageFactory;

import com.edsoft.framework.base.mobile.BasePaginaMobile;
import com.edsoft.framework.base.mobile.DriverContextMobile;
import com.edsoft.framework.base.mobile.DriverFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.qameta.allure.Step;

public class CadastroPage extends BasePaginaMobile {

	public CadastroPage(AppiumDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// DETAILS
	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(xpath = ".//android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.EditText")
	private MobileElement campoUsername;

	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText")
	private MobileElement campoEmail;

	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.TextView")
	private MobileElement campoPassword;

	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.EditText\r\n")
	private MobileElement campoConfirmPassword;

//		 PERSONAL DETAILS
	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.TextView\r\n")
	private MobileElement campoFirstName;

	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.EditText\r\n")
	private MobileElement campoLastName;

	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView\r\n")
	private MobileElement campoPhoneNumber;

//         ADDRESS
	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(xpath = " //android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView[2]")
	private MobileElement comboBoxCounty;

	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.TextView")
	private MobileElement campoState;

	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")
	private MobileElement campoAddress;

	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.TextView")
	private MobileElement campoCity;

	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.TextView")
	private MobileElement campoZip;
	
	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(id = "com.Advantage.aShopping:id/buttonRegister")
	private MobileElement botaoRegister;

	@Step("Preencher os campos Details \"Username, E-mail, Password, confirmPassword\"")
	public CadastroPage preemcherDetails(String username, String email, String password, String confirmPassword)
			throws Exception {
		// DriverContextMobile.escreverTexto(campoUsername, username + "\n", "erro ao
		// preemcher username");
		DriverContextMobile.aguardarCarregamentoElemento(campoUsername);
		campoUsername.sendKeys(username + "\n");
		DriverContextMobile.aguardarCarregamentoElemento(campoEmail);
		campoEmail.sendKeys(email + "\n");
		DriverContextMobile.aguardarCarregamentoElemento(campoPassword);
		campoPassword.sendKeys(password + "\n");
		DriverContextMobile.aguardarCarregamentoElemento(campoConfirmPassword);
		campoConfirmPassword.sendKeys(confirmPassword + " ");
		DriverContextMobile.salvarEvidencia("preencher os campos details");
		DriverFactory.getDriver().hideKeyboard();
		DriverContextMobile.rolagemDeTela(0.6, 0.1);
		return this;
	}

	@Step("Preencher os campos Personal Details \"FirstName, LastName, PhoneNumber\"")
	public CadastroPage preemcherPersonalDetails(String firstName, String lastName, String phoneNumber)
			throws Exception {
		Thread.sleep(3000);
		DriverContextMobile.aguardarCarregamentoElemento(campoFirstName);
		campoFirstName.sendKeys(firstName);
		DriverContextMobile.aguardarCarregamentoElemento(campoLastName);
		campoLastName.sendKeys(lastName + "\n");
		DriverContextMobile.aguardarCarregamentoElemento(campoPhoneNumber);
		campoPhoneNumber.sendKeys(phoneNumber + "\n");
		DriverContextMobile.salvarEvidencia("preencher os campos personal Details");
		DriverFactory.getDriver().hideKeyboard();
		DriverContextMobile.rolagemDeTela(0.7, 0.1);
		return this;
	}

	@Step("Preencher os campos Adress\"county, state, address, city, zip\"")
	public CadastroPage preemcherAddress(String country, String state, String address, String city, String zip)
			throws Exception {
		DriverContextMobile.aguardarCarregamentoElemento(comboBoxCounty);
		DriverContextMobile.pressionarValorCombo(comboBoxCounty, country, "Erro ao selecionar combo");
		DriverContextMobile.aguardarCarregamentoElemento(campoState);
		campoState.sendKeys(state + "\n");
		DriverContextMobile.aguardarCarregamentoElemento(campoAddress);
		campoAddress.sendKeys(address);
		DriverContextMobile.aguardarCarregamentoElemento(campoCity);
		campoCity.sendKeys(city);
		DriverContextMobile.aguardarCarregamentoElemento(campoZip);
		campoZip.sendKeys(zip);
		DriverContextMobile.salvarEvidencia("preencher os campos Adress");
		DriverFactory.getDriver().hideKeyboard();
		return this;
	}

	public CadastroPage cilcarNoBotaoRegister() throws Exception {
        DriverContextMobile.aguardarCarregamentoElemento(botaoRegister);
        DriverContextMobile.tocarElemento(botaoRegister, "Erro ao tocar no botao Register");
		return this;
	}
}
