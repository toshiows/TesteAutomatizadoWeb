package stepsDefinitions;

import static org.junit.Assert.assertTrue;
import static utils.Utils.Na;
import static utils.Utils.driver;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.TelaInicialPage;

public class TestandoActionsSteps {

	@Quando("^eu acionar o submenu customfield$")
	public void euAcionarOSubmenuCustomfield() throws Throwable {
		Na(TelaInicialPage.class).acessarMenuCustomField();
	}

	@Entao("^o sistema apresenta a tela customField$")
	public void oSistemaApresentaATelaCustomField() throws Throwable {
		assertTrue(driver.findElement(By.xpath("//div//h1[@id='heading'][text()='Add Custom Field']")).isDisplayed());
	}
}
