/**
 * 
 */
package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * The Class TestRunner.
 *
 * @author choudhuryIqbal
 */
@CucumberOptions(features="Features", glue= {"stepDefinations"} )
@RunWith(Cucumber.class)
public class TestRunner {

}
