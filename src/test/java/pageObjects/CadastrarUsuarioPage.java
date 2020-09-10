package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CadastrarUsuarioPage {

	@FindBy(id = "systemUser_employeeName_empName")
	public WebElement campoEmployeeName;
	
	@FindBy(id = "systemUser_userName")
	public WebElement campoUsername;
	
	@FindBy(id = "systemUser_password")
	public WebElement campoPassword;
	
	@FindBy(id = "systemUser_confirmPassword")
	public WebElement campoConfirmPassword;
	
	@FindBy(id = "btnSave")
	public WebElement botaoSalvar;
	
	
	public void preencherCampoEmployeeName(String employeeName) {
		campoEmployeeName.sendKeys(employeeName);
	}
	
	public void preeencherCampoUserName(String userName) {
		campoUsername.sendKeys(userName);
	}
	
	public void preencherCampoPassword(String password) {
		campoPassword.sendKeys(password);
	}
	
	public void preencherCampoConfirmPassword(String confirmPassword) {
		campoConfirmPassword.sendKeys(confirmPassword);
	}
	
	public void acionarBotaoSalvar() {
		botaoSalvar.click();
	}
}
