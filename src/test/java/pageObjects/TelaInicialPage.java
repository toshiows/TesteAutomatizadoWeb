package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import static utils.Utils.*;

public class TelaInicialPage extends BasePage{
	
	Actions acao = new Actions(driver);

	@FindBy(id = "btnAdd")
	public WebElement botaoAdd;
	
	
	public void acionarAbaAdmin() {
		abaAdmin.click();
	}
	
	public void acionarBotaoAdd() {
		botaoAdd.click();
	}
	
	public void moverMouseParaAbaPim() {
		acao.moveToElement(abaPim).build().perform();
	}
	
	public void moverMenuConfiguration() {
		acao.moveToElement(abaConfiguration).build().perform();
	}
	
	public void moverMenuField() {
		acao.moveToElement(abaCustomFields).click().build().perform();
		
	}
	
	public void acessarMenuCustomField() {
		moverMouseParaAbaPim();
		moverMenuConfiguration();
		moverMenuField();
	}
}

