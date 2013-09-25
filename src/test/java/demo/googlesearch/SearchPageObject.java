package demo.googlesearch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

import demo.Client;

public class SearchPageObject{
	private final Client client;
	private final String resultXpath = "//div[@id=\"search\"]//h3/a";

    @FindBy(how = How.NAME, using = "q")
    private WebElement searchBox;
    
	public SearchPageObject(Client client) {
		this.client = client;
	}

	public WebElement getSearchBox() {
		return searchBox;
	}	
	
	public List<WebElement> getResultList(){
		client.waitUnit(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(resultXpath)), 20);
		return client.getDriver().findElements(By.xpath(resultXpath));
	}
}
