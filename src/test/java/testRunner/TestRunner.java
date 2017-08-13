/**
 * 
 */
package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * @author choudhuryIqbal
 *
 */
@CucumberOptions(features="Features", glue= {"stepDefinations"} )
@RunWith(Cucumber.class)
public class TestRunner {

}
