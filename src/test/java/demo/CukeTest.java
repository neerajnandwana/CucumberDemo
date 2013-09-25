package demo;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        format={"pretty", "html:target/cucumber-html-report"},
        monochrome=true,
        features={"."}, 
        strict=true)

public class CukeTest {

}