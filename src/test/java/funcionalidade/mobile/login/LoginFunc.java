package funcionalidade.mobile.login;

import static com.edsoft.framework.base.mobile.DriverFactory.getDriver;

import java.io.IOException;

import com.edsoft.framework.base.mobile.BaseFuncionalidadeMobile;
import com.itextpdf.text.DocumentException;

import pagina.mobile.home.LoginPage;

public class LoginFunc extends BaseFuncionalidadeMobile {
	/**
	 * Preemcher o campos de login @throws Exception, ClassNotFoundException,
	 * IOException, DocumentException
	 */
	public void realizaLogin(String username, String password)
			throws ClassNotFoundException, IOException, DocumentException, Exception {
		new LoginPage(getDriver()).login(username, password);
	}

	/**
	 * Clicar em logar @throws Exception, ClassNotFoundException, IOException,
	 * DocumentException
	 */
	public void clicarBotaoLogar()
			throws ClassNotFoundException, IOException, DocumentException, Exception {
		new LoginPage(getDriver()).logar();
	}
	

	/**
	 * Clicar no link criar conta
	 *  @throws Exception, ClassNotFoundException, IOException, DocumentException
	 */
	public void clicarNoLinkCriarConta() throws ClassNotFoundException, IOException, DocumentException, Exception{
		new LoginPage(getDriver()).criarConta();
	}

}
