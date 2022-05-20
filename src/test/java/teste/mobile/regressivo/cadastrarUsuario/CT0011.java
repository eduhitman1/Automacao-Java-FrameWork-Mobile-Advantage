package teste.mobile.regressivo.cadastrarUsuario;

import org.testng.annotations.Test;

import com.edsoft.framework.annotations.Jornada;
import com.edsoft.framework.base.mobile.TestInitializeMobile;
import com.edsoft.framework.constantes.Jornadas;
import com.edsoft.framework.constantes.massa.Massa;

import funcionalidade.mobile.criarConta.CadastrarContaFunc;
import funcionalidade.mobile.login.LoginFunc;
import funcionalidade.mobile.menu.MenuFunc;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

@Jornada(Jornadas.CADASTRARUSUARIO)
public class CT0011 extends TestInitializeMobile {
	
	MenuFunc menu = new MenuFunc();
	LoginFunc login = new LoginFunc();
	CadastrarContaFunc cadastrar = new CadastrarContaFunc();

	@Test(description = "REG.CADAS.11 - Cadastrar Usuário no Sistema \\\"advantage\\\".\"")
	@Description("Validar Usuário Cadastrado no Sistema")
	@Severity(SeverityLevel.NORMAL)
	public void CT0011() throws Exception {
		menu.carregaAplicacao();
		menu.abrirPopUpLogin();

		login.clicarNoLinkCriarConta();

        cadastrar.preemchimentoDetails(recuperarMassa(Massa.USERNAME), recuperarMassa(Massa.EMAIL),
				recuperarMassa(Massa.PASSWORD), recuperarMassa(Massa.CONFIRMPASSWORD));
		cadastrar.preemchimentoPersonalDetalis(recuperarMassa(Massa.FIRSTNAME), recuperarMassa(Massa.LASTNAME),
				recuperarMassa(Massa.PHONENUMBER));
		cadastrar.preemchimentoAddress(recuperarMassa(Massa.COUNTRY), recuperarMassa(Massa.STATE),
				recuperarMassa(Massa.ADDRESS), recuperarMassa(Massa.CITY), recuperarMassa(Massa.POSTALCODE));
        cadastrar.finalizarCadastro();
	}

}
