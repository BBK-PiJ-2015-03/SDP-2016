package exercises.Week05;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.*;

import java.io.IOException;

/*
 * Created by J2FX on 02/02/2016.
 */
public class HTMLCapture {

    public static void main(String[] args) {
        HTMLCapture h = new HTMLCapture();
        try {
            h.submittingForm();
        } catch (Exception e) {
            System.out.println("DID NOT WORK!");
            //e.printStackTrace();
        }
    }


    public void submittingForm() {
        try (final WebClient webClient = new WebClient()) {

            // Get the first page
            HtmlPage page1 = null;
            try {
                page1 = webClient.getPage("https://www.middlesextextiles.com/login.php?action=create_account");
            } catch (IOException e) {
                System.out.println("COULD NOT CONNECT TO WEBSITE");
            }
            // Get the form that we are dealing with and within that form,
            // find the submit button and the field that we want to change.
            final HtmlForm form = page1.getFirstByXPath("//form[@action='return check_create_account_form()']");

            final HtmlSubmitInput button = form.getInputByValue("submit");
            final HtmlTextInput customerFirstName = form.getInputByName("FirstName");
            final HtmlTextInput customerLastName = form.getInputByName("LastName");
            final HtmlTextInput address = form.getInputByName("AddressLine1");
            final HtmlTextInput city = form.getInputByName("City");
            final HtmlTextInput phone = form.getInputByName("Phone");
            final HtmlTextInput email = form.getInputByName("EmailAddress");
            final HtmlTextInput password1 = form.getInputByName("Password");
            final HtmlTextInput password2 = form.getInputByName("ConfirmPassword");

            // Change the value of the text field
            customerFirstName.setValueAttribute("Jimbo");
            customerLastName.setValueAttribute("Jimbo");
            address.setValueAttribute("1 lolige town");
            city.setValueAttribute("London");
            phone.setValueAttribute("02929282848");
            email.setValueAttribute("testingjimboslice232@gmail.com");
            password1.setValueAttribute("root66676");
            password2.setValueAttribute("root66676");


            // Now submit the form by clicking the button and get back the second page.
            try {
                final HtmlPage page2 = button.click();
            } catch (IOException e) {
                System.out.println("COULD NOT CLICK REGISTER BUTTON");
            }
        }
    }
}
