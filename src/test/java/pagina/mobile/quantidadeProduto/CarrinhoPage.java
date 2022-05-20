package pagina.mobile.quantidadeProduto;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.edsoft.framework.base.mobile.BasePaginaMobile;
import com.edsoft.framework.base.mobile.DriverContextMobile;
import com.edsoft.framework.base.mobile.DriverFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CarrinhoPage extends BasePaginaMobile {
	
	public CarrinhoPage(AppiumDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public void swipeElementEsquerdaId(String opcao) {
		DriverContextMobile.swipeElementy(DriverFactory.getDriver().findElement(By.id(opcao)), 0.1, 0.9);
	}
	public void swipeElementDireitaId(String opcao) {
//		swipeElementy(DriverFactory.getDriver().findElement(By.id(opcao)), 0.9, 0.1);
	}
	
	public void swipeElementEsquerda(String opcao) {
//		swipeElementy(DriverFactory.getDriver().findElement(By.xpath("//*[@text='" + opcao + "']/..")), 0.1, 0.9);
	}
    public void swipeElementDireita(String opcao) {
//		swipeElementy(DriverFactory.getDriver().findElement(By.xpath("//*[@text='" + opcao + "']/..")), 0.9, 0.1);
	}
    
    public void removerProduto() {
        DriverFactory.getDriver().findElement(By.id("com.Advantage.aShopping:id/relativeLayoutCartRemove")).click();
//        clicarId("com.Advantage.aShopping:id/relativeLayoutCartRemove");
//        clicarPorXPath("//android.support.v4.widget.DrawerLayout[@content-desc=\"Cart Details\"]/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]");    
    }
}
