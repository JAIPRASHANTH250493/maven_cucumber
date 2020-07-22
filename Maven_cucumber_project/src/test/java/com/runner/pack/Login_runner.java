package com.runner.pack;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="Featurefolder/TitanLogin.feature",
                 glue="com.steps.pack",
                 dryRun=false,
                 plugin= {"pretty","html:Firstpage/firstpagereport","json:jsonreport/report.json"},
                 monochrome=true)

public class Login_runner {

}
