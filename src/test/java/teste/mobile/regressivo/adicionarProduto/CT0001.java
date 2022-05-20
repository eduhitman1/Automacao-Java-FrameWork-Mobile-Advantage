package teste.mobile.regressivo.adicionarProduto;

import org.testng.annotations.Test;

import com.edsoft.framework.annotations.Jornada;
import com.edsoft.framework.base.mobile.TestInitializeMobile;
import com.edsoft.framework.constantes.Jornadas;
import com.edsoft.framework.constantes.massa.Massa;

import funcionalidade.mobile.login.LoginFunc;
import funcionalidade.mobile.menu.MenuFunc;
import funcionalidade.mobile.quantidadeProduto.QuantidadeProdutoFunc;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

@Jornada(Jornadas.ADICIONARPRODUTO)
public class CT0001 extends TestInitializeMobile {

	MenuFunc menu = new MenuFunc();
	LoginFunc login = new LoginFunc();
	QuantidadeProdutoFunc telaProduto = new QuantidadeProdutoFunc();

	@Test(description = "REG.ARPRO.01 - Adicionar produto no carrinho \\\"advantage\\\".\"")
	@Description("Validar quando finalizar a quantidade de produto adicionado")
	@Severity(SeverityLevel.NORMAL)
	public void CT0001() throws Exception {
		menu.carregaAplicacao();
		menu.abrirPopUpLogin();

		login.realizaLogin(recuperarMassa(Massa.USERNAME), recuperarMassa(Massa.PASSWORD));
		login.clicarBotaoLogar();

        menu.selecionarCategoria(recuperarMassa(Massa.CATEGORIA));
        
        telaProduto.selecionarProduto(recuperarMassa(Massa.PRODUTO));
        telaProduto.adicionarQuantidade(recuperarMassa(Massa.QUANTIDADE)).clicarEmApply();
        
		telaProduto.adicionarAoCarrinho();
		
	}

}
