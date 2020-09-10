package stepsDefinitions;

import static org.junit.Assert.assertTrue;
import static utils.Utils.Na;
import static utils.Utils.driver;

import org.openqa.selenium.By;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CadastrarUsuarioPage;
import pageObjects.TelaInicialPage;


public class CadastrarUsuariosSteps {

	@Quando("eu acionar a aba admin")
	public void euAcionarAAbaAdmin() {
	    Na(TelaInicialPage.class).acionarAbaAdmin();
	}

	@Quando("acionar o botao add")
	public void acionarOBotaoAdd() {
	    Na(TelaInicialPage.class).acionarBotaoAdd();
	}

	@Quando("informar no campo employee name {string}")
	public void informarNoCampoEmployeeName(String employeeName) {
	    Na(CadastrarUsuarioPage.class).preencherCampoEmployeeName(employeeName);
	}

	@Quando("informar no campo user name {string}")
	public void informarNoCampoUserName(String userName) {
	    Na(CadastrarUsuarioPage.class).preeencherCampoUserName(userName);
	}

	@Quando("informar no campo password {string}")
	public void informarNoCampoPassword(String password) {
	    Na(CadastrarUsuarioPage.class).preencherCampoPassword(password);
	}

	@Quando("informar no campo confirmar password {string}")
	public void informarNoCampoConfirmarPassword(String confirmPassword) {
	    Na(CadastrarUsuarioPage.class).preencherCampoConfirmPassword(confirmPassword);
	}
	
	@E("^acionar o botao salvar$")
	public void acionarOBotaoSalvar() throws Throwable {
		Na(CadastrarUsuarioPage.class).acionarBotaoSalvar();
	}

	@Entao("^o sistema cadastra o usuario \"([^\"]*)\"$")
	public void oSistemaCadastraOUsuario(String usuarioCadastrado) throws Throwable {
		assertTrue(driver.findElement(By.xpath("//a[text()='" + usuarioCadastrado + "']")).isDisplayed());
	}
	
}
