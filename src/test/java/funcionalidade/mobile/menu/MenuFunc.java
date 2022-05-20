package funcionalidade.mobile.menu;

import static com.edsoft.framework.base.mobile.DriverFactory.getDriver;

import java.io.IOException;

import com.edsoft.framework.base.mobile.BaseFuncionalidadeMobile;
import com.itextpdf.text.DocumentException;

import pagina.mobile.home.HomePage;

public class MenuFunc extends BaseFuncionalidadeMobile {
	/**
	 * Carregar página da aplicação @throws Exception, ClassNotFoundException,
	 * IOException, DocumentException
	 */
	public void carregaAplicacao() throws ClassNotFoundException, IOException, DocumentException, Exception {
		new HomePage(getDriver());
	}

	/**
	 * Abrir PopUp Login @throws Exception
	 */
	public void abrirPopUpLogin() throws ClassNotFoundException, IOException, DocumentException, Exception {
		new HomePage(getDriver()).
		validaPageMenu().
		menuIntenelScreen().
		loginAbaInterna();
	}
	
	/**
	 * Selecionar categoria 
	 * @throws 
	 * Exception
	 */
	public void selecionarCategoria(String categoria) throws ClassNotFoundException, IOException, DocumentException, Exception {
		new HomePage(getDriver()).selecionarCategoria(categoria);
	}
	
	/**
	 * perquisa produto "rota filtrar produto"
	 * @throws 
	 * ClassNotFoundException, IOException, DocumentException, Exception 
	 */
	public void pesquisaProduto(String campoPesquisa) throws ClassNotFoundException, IOException, DocumentException, Exception {
		new HomePage(getDriver()).digitarCampoPesquisa(campoPesquisa);
		
	}
	
	
	

}
