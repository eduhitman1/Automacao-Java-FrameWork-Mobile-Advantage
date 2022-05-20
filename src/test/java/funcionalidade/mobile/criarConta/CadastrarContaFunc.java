package funcionalidade.mobile.criarConta;

import static com.edsoft.framework.base.mobile.DriverFactory.getDriver;

import java.io.IOException;

import com.edsoft.framework.base.mobile.BaseFuncionalidadeMobile;
import com.itextpdf.text.DocumentException;

import pagina.mobile.cadastro.CadastroPage;

public class CadastrarContaFunc extends BaseFuncionalidadeMobile {

	/**
	 * Preemcher os campos Details
	 * 
	 * @throws Exception, ClassNotFoundException, IOException, DocumentException
	 */
	public void preemchimentoDetails(String username, String email, String password, String confirmPassword)
			throws ClassNotFoundException, IOException, DocumentException, Exception {
		new CadastroPage(getDriver()).preemcherDetails(username, email, password, confirmPassword);
	}

	/**
	 * Preemcher os campos Personal Details
	 * 
	 * @throws Exception, ClassNotFoundException, IOException, DocumentException
	 */
	public void preemchimentoPersonalDetalis(String firstName, String lastName, String phoneNumber)
			throws ClassNotFoundException, IOException, DocumentException, Exception {
		new CadastroPage(getDriver()).preemcherPersonalDetails(firstName, lastName, phoneNumber);
	}

	/**
	 * Preemcher os campos Address
	 * 
	 * @throws Exception, ClassNotFoundException, IOException, DocumentException
	 */
	public void preemchimentoAddress(String country, String state, String address, String city, String zip)
			throws ClassNotFoundException, IOException, DocumentException, Exception {
		new CadastroPage(getDriver()).preemcherAddress(country, state, address, city, zip);
	}

	/**
	 * Finalizar cadastro
	 * 
	 * @throws Exception, ClassNotFoundException, IOException, DocumentException
	 */
	public void finalizarCadastro() throws ClassNotFoundException, IOException, DocumentException, Exception {
		new CadastroPage(getDriver()).cilcarNoBotaoRegister();
	}

}
