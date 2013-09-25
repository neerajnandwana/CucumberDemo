package demo.googlesearch;

import static org.junit.Assert.assertTrue;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchStepDefinitions {
	private final SearchWorkflow searchWorkFlow;
	private final String googleSearchUrl = "http://www.google.com";
	
	public SearchStepDefinitions(SearchWorkflow googleWorkFlow) {
		this.searchWorkFlow = googleWorkFlow;
	}

	@Given("^I have opened a google search page$")
	public void openPage() {
		searchWorkFlow.openPage(googleSearchUrl);
	}
	
	@When("I search for \"(.+)\"")
	public void textSearch(String text){
		searchWorkFlow.searchFor(text);
	}
	
	@Then("I can see the list of links related to \"(.+)\"")
	public void verifyResultList(String text){
		boolean pass = searchWorkFlow.verifySearchResults(text);
		assertTrue("search result contains different results", pass);
	}

	@After
	public void tearDown() {
		searchWorkFlow.stopClient();
	}
}
