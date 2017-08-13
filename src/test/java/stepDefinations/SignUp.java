/**
 * 
 */
package stepDefinations;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import net.phptravels.BaseUtil;

/**
 * @author choudhuryIqbal
 *
 */
public class SignUp extends BaseUtil{
	private  BaseUtil base;
	public SignUp(BaseUtil base) {
		this.base=base;
	}

	@Given("^user navigage to hommepage$")
	public void user_navigage_to_hommepage() throws Throwable {
		

	}

	@Given("^User click my account$")
	public void user_click_my_account() throws Throwable {
	
	}

	@Given("^User enter first name as \"([^\"]*)\"$")
	public void user_enter_first_name_as(String arg1) throws Throwable {
		

	}

	@Given("^User enter lastName as \"([^\"]*)\"$")
	public void user_enter_lastName_as(String arg1) throws Throwable {
		

	}

	@Given("^User enter mobile number as \"([^\"]*)\"$")
	public void user_enter_mobile_number_as(String arg1) throws Throwable {
		

	}

	@Given("^User enter email as \"([^\"]*)\"$")
	public void user_enter_email_as(String arg1) throws Throwable {
		
		System.out.println("your email is " + arg1);
	}

	@Given("^User enter password as \"([^\"]*)\"$")
	public void user_enter_password_as(String arg1) throws Throwable {
	

	}

	@Given("^User confirms password as \"([^\"]*)\"$")
	public void user_confirms_password_as(String arg1) throws Throwable {
	

	}

	@Given("^User Click sign up$")
	public void user_Click_sign_up() throws Throwable {
		

	}

	@When("^User click sign up button$")
	public void user_click_sign_up_button() throws Throwable {
		

	}

	@Then("^User will be able to sign up successfully$")
	public void user_will_be_able_to_sign_up_successfully() throws Throwable {
		

	}
	@Given("^User enter Choudhury$")
	public void user_enter_Choudhury() throws Throwable {
	   
	}

	@Given("^User enter Iqbalnnn$")
	public void user_enter_Iqbalnnn() throws Throwable {
	   
	}

	@Given("^User enter (\\d+)$")
	public void user_enter(int arg1) throws Throwable {
	 
	}

	@Given("^User enter <email>$")
	public void user_enter_email() throws Throwable {

	}

	@Given("^User enter <password>$")
	public void user_enter_password() throws Throwable {
	    
	}

	@Given("^User confirms with different userAdmin$")
	public void user_confirms_with_different_userAdmin() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

	}

	@Then("^User won't able to sign up$")
	public void user_won_t_able_to_sign_up() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	
	}

	@Given("^User confirms with different userAdmin(\\d+)$")
	public void user_confirms_with_different_userAdmin(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

}
