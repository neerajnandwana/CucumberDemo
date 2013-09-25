package demo.googlesearch;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import demo.Client;

public class SearchWorkflow {
	private final SearchPageObject searchPageObject;
	private final Client client;
	
	public SearchWorkflow(Client client, SearchPageObject searchPageObject) {
		this.client = client;
		this.searchPageObject = searchPageObject;
		PageFactory.initElements(client.getDriver(), searchPageObject);
	}

	public void openPage(String url) {
		client.openPage(url);
	}

	public void stopClient() {
		client.stop();
	}

	public void searchFor(String text) {
		WebElement searchcBox = searchPageObject.getSearchBox();
		searchcBox.sendKeys(text);
		searchcBox.submit();
	}

	public boolean verifySearchResults(String text) {
		boolean pass = true;
		List<WebElement> results = searchPageObject.getResultList();
		for(WebElement result: results){
			if(!result.getText().toLowerCase().contains(text.toLowerCase())){
				pass = false;
				break;
			}
		}
		return pass;
		
	}

}
