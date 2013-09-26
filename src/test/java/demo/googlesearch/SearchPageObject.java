package demo.googlesearch;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfAllElementsLocatedBy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

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
		return client.waitUntil(visibilityOfAllElementsLocatedBy(By.xpath(resultXpath)), 20);
	}
}
