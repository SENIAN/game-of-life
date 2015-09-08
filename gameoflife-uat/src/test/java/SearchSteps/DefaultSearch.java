package SearchSteps;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

/**
 * Created by Mohammed on 7-9-2015.
 */

public class DefaultSearch  {

    public DefaultSearch(){}



        protected WebDriver driver;
        private static final String url = "http://telfort.nl/";


    /*    Given I am on the Telfort start page
        When I type <keyword> in the search box
        Then The search result page<page> is shown
    */
        @Before
        public void setup () {
            //driver = new ChromeDriver();

        }

        @Given("^I am on the Telfort start page$")

        public void I_am_at_telfort_start_page () {
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //driver.get(url);
        System.out.println("I am on the Telfort start page");
        }

        @When("^I type <keyword> in the search box$")

        public void I_type_keyword_in_the_search_box (String keyword) {
            // WebElement TelfortSearchBox = driver.findElement(By.id("search"));
            // TelfortSearchBox.sendKeys(keyword);

            // WebElement searchButton = driver.findElement(By.id("search"));
            // searchButton.click();
            System.out.println("I am on the Telfort start page");
        }

        @Then("^The search result page<page> is shown$")

        public void the_search_result_page_is_shown (String Expectedresult) {

            //  WebElement getSearch = driver.findElement(By.id("searchresult"));
            //  String result = getSearch.getText();
            //  Assert.assertEquals(result, Expectedresult);
            System.out.println("I am on the Telfort start page");
          //  driver.close();
        }

    }

