package com.RunnerFile;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)

@CucumberOptions(features = "src//test//java//com//FeatureFile//AdactinHotel.feature", glue = "com.StepDefinition")

public class AdactinHotelRunner {

	
	
	
}
