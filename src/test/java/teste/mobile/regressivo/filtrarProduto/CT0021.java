package teste.mobile.regressivo.filtrarProduto;

import org.testng.annotations.Test;

import com.edsoft.framework.annotations.Jornada;
import com.edsoft.framework.base.mobile.TestInitializeMobile;
import com.edsoft.framework.constantes.Jornadas;
import com.edsoft.framework.constantes.massa.Massa;

import funcionalidade.mobile.login.LoginFunc;
import funcionalidade.mobile.menu.MenuFunc;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

@Jornada(Jornadas.ADICIONARPRODUTO)
public class CT0021 extends TestInitializeMobile {

	MenuFunc menu = new MenuFunc();
	LoginFunc login = new LoginFunc();

	@Test(description = "REG.FILT.021 - Filtrar produto \\\"advantage\\\".\"")
	@Description("Filtrar produto em estoque")
	@Severity(SeverityLevel.NORMAL)
	public void CT0021() throws Exception {
		menu.carregaAplicacao();
		menu.abrirPopUpLogin();

		login.realizaLogin(recuperarMassa(Massa.USERNAME), recuperarMassa(Massa.PASSWORD));
		login.clicarBotaoLogar();

		menu.pesquisaProduto(recuperarMassa(Massa.PESQUISAPRODUTO));

	}
}
