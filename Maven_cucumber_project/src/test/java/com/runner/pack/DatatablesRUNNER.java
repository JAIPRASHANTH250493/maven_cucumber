package com.runner.pack;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="Featurefolder",
                 glue= {"com.steps.pack","Hookspack"},
                 dryRun=false,
                 plugin= {"pretty","html:Firstpage/datatablereport","json:jsonreport/databalereport.json"},
                 monochrome=true)

public class DatatablesRUNNER {

	
}
