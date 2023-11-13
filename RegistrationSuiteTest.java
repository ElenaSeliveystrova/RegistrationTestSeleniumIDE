// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class DefaultSuiteTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void emailAlreadyExists() {
    // Test name: emailAlreadyExists
    // Step # | name | target | value
    // 1 | open | https://www.greencity.social/#/greenCity | 
    driver.get("https://www.greencity.social/#/greenCity");
    // 2 | click | css=.header_sign-up-btn > span | 
    driver.findElement(By.cssSelector(".header_sign-up-btn > span")).click();
    // 3 | type | id=email | magicnimfa@gmail.com
    driver.findElement(By.id("email")).sendKeys("magicnimfa@gmail.com");
    // 4 | type | id=firstName | Elena
    driver.findElement(By.id("firstName")).sendKeys("Elena");
    // 5 | type | //*[@id="password"] | 123$qweR
    driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123$qweR");
    // 6 | type | //*[@id="repeatPassword"] | 123$qweR
    driver.findElement(By.xpath("//*[@id=\"repeatPassword\"]")).sendKeys("123$qweR");
    // 7 | click | //button[@class="greenStyle"] | 
    driver.findElement(By.xpath("//button[@class=\"greenStyle\"]")).click();
    // 8 | verifyText | //div[@class="error-message error-message-show ng-star-inserted"] | The user with this email already exists
    assertThat(driver.findElement(By.xpath("//div[@class=\"error-message error-message-show ng-star-inserted\"]")).getText(), is("The user with this email already exists"));
  }
  @Test
  public void emailInvalid() {
    // Test name: emailInvalid
    // Step # | name | target | value
    // 1 | open | https://www.greencity.social/#/greenCity | 
    driver.get("https://www.greencity.social/#/greenCity");
    // 2 | click | css=.header_sign-up-btn > span | 
    driver.findElement(By.cssSelector(".header_sign-up-btn > span")).click();
    // 3 | type | id=email | lena@lkcom
    driver.findElement(By.id("email")).sendKeys("lena@lkcom");
    // 4 | type | id=firstName | Elena
    driver.findElement(By.id("firstName")).sendKeys("Elena");
    // 5 | verifyText | //*[@id="email-err-msg"]/app-error/div |  Please check that your e-mail address is indicated correctly 
    assertThat(driver.findElement(By.xpath("//*[@id=\"email-err-msg\"]/app-error/div")).getText(), is(" Please check that your e-mail address is indicated correctly "));
  }
  @Test
  public void nameEmpty() {
    // Test name: nameEmpty
    // Step # | name | target | value
    // 1 | open | https://www.greencity.social/#/greenCity | 
    driver.get("https://www.greencity.social/#/greenCity");
    // 2 | click | css=.header_sign-up-btn > span | 
    driver.findElement(By.cssSelector(".header_sign-up-btn > span")).click();
    // 3 | type | id=email | magicnimfa@gmail.com
    driver.findElement(By.id("email")).sendKeys("magicnimfa@gmail.com");
    // 4 | click | id=email | 
    driver.findElement(By.id("email")).click();
    // 5 | type | //*[@id="password"] | 123$qweR
    driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123$qweR");
    // 6 | click | //label[@for="firstName"] | 
    driver.findElement(By.xpath("//label[@for=\"firstName\"]")).click();
    // 7 | assertText | //*[@id="firstname-err-msg"]/app-error/div |  User name is required 
    assertThat(driver.findElement(By.xpath("//*[@id=\"firstname-err-msg\"]/app-error/div")).getText(), is(" User name is required "));
  }
  @Test
  public void nameInvalid() {
    // Test name: nameInvalid
    // Step # | name | target | value
    // 1 | open | https://www.greencity.social/#/greenCity | 
    driver.get("https://www.greencity.social/#/greenCity");
    // 2 | click | css=.header_sign-up-btn > span | 
    driver.findElement(By.cssSelector(".header_sign-up-btn > span")).click();
    // 3 | type | id=email | magicnimfa@gmail.com
    driver.findElement(By.id("email")).sendKeys("magicnimfa@gmail.com");
    // 4 | type | //*[@id="firstName"] | ElenaSeliveystrova11111111111111
    driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("ElenaSeliveystrova11111111111111");
    // 5 | click | //*[@id="password"] | 
    driver.findElement(By.xpath("//*[@id=\"password\"]")).click();
    // 6 | verifyText | //*[@id="firstname-err-msg"]/app-error/div |  The field is required. The name must contain 1-30 characters and can contain letters(a-z; а-я), numbers(0-9) and a dot(.), dot at the start, at the end and consecutive dot is forbidden
    assertThat(driver.findElement(By.xpath("//*[@id=\"firstname-err-msg\"]/app-error/div")).getText(), is(" The field is required. The name must contain 1-30 characters and can contain letters(a-z; а-я), numbers(0-9) and a dot(.), dot at the start, at the end and consecutive dot is forbidden"));
  }
  @Test
  public void passwordChort() {
    // Test name: passwordChort
    // Step # | name | target | value
    // 1 | open | https://www.greencity.social/#/greenCity | 
    driver.get("https://www.greencity.social/#/greenCity");
    // 2 | click | css=.header_sign-up-btn > span | 
    driver.findElement(By.cssSelector(".header_sign-up-btn > span")).click();
    // 3 | type | id=email | magicnimfa@gmail.com
    driver.findElement(By.id("email")).sendKeys("magicnimfa@gmail.com");
    // 4 | type | //*[@id="firstName"] | ElenaSeliveystrova
    driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("ElenaSeliveystrova");
    // 5 | type | //*[@id="password"] | 1234
    driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("1234");
    // 6 | type | //*[@id="repeatPassword"] | 1234
    driver.findElement(By.xpath("//*[@id=\"repeatPassword\"]")).sendKeys("1234");
    // 7 | verifyText | //*[@id="password-err-msg"]/app-error/div |  Password must be at least 8 characters long without spaces
    assertThat(driver.findElement(By.xpath("//*[@id=\"password-err-msg\"]/app-error/div")).getText(), is(" Password must be at least 8 characters long without spaces"));
  }
  @Test
  public void passwordEmpty() {
    // Test name: passwordEmpty
    // Step # | name | target | value
    // 1 | open | https://www.greencity.social/#/greenCity | 
    driver.get("https://www.greencity.social/#/greenCity");
    // 2 | click | css=.header_sign-up-btn > span | 
    driver.findElement(By.cssSelector(".header_sign-up-btn > span")).click();
    // 3 | type | id=email | magicnimfa@gmail.com
    driver.findElement(By.id("email")).sendKeys("magicnimfa@gmail.com");
    // 4 | type | //*[@id="firstName"] | ElenaSeliveystrova
    driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("ElenaSeliveystrova");
    // 5 | click | //*[@id="password"] | 
    driver.findElement(By.xpath("//*[@id=\"password\"]")).click();
    // 6 | click | //label[@for="firstName"] | 
    driver.findElement(By.xpath("//label[@for=\"firstName\"]")).click();
    // 7 | verifyText | //*[@id="password-err-msg"]/app-error/div |  Password is required
    assertThat(driver.findElement(By.xpath("//*[@id=\"password-err-msg\"]/app-error/div")).getText(), is(" Password is required"));
  }
  @Test
  public void passwordInvalid() {
    // Test name: passwordInvalid
    // Step # | name | target | value
    // 1 | open | https://www.greencity.social/#/greenCity | 
    driver.get("https://www.greencity.social/#/greenCity");
    // 2 | click | css=.header_sign-up-btn > span | 
    driver.findElement(By.cssSelector(".header_sign-up-btn > span")).click();
    // 3 | type | id=email | magicnimfa@gmail.com
    driver.findElement(By.id("email")).sendKeys("magicnimfa@gmail.com");
    // 4 | type | //*[@id="firstName"] | ElenaSeliveystrova
    driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("ElenaSeliveystrova");
    // 5 | type | //*[@id="password"] | 12345678
    driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("12345678");
    // 6 | click | //label[@for="firstName"] | 
    driver.findElement(By.xpath("//label[@for=\"firstName\"]")).click();
    // 7 | verifyText | //*[@id="password-err-msg"]/app-error/div |  Password must contain at least one uppercase letter (A-Z), one lowercase letter (a-z), a digit (0-9), and a special character (~`!@#$%^&*()+=_-{}[]|:;”’?/<>,.)
    assertThat(driver.findElement(By.xpath("//*[@id=\"password-err-msg\"]/app-error/div")).getText(), is(" Password must contain at least one uppercase letter (A-Z), one lowercase letter (a-z), a digit (0-9), and a special character (~\\\`!@#$%^&*()+=_-{}[]|:;”’?/<>,.)"));
  }
  @Test
  public void passwordsNotMatch() {
    // Test name: passwordsNotMatch
    // Step # | name | target | value
    // 1 | open | https://www.greencity.social/#/greenCity | 
    driver.get("https://www.greencity.social/#/greenCity");
    // 2 | click | css=.header_sign-up-btn > span | 
    driver.findElement(By.cssSelector(".header_sign-up-btn > span")).click();
    // 3 | type | id=email | magicnimfa@gmail.com
    driver.findElement(By.id("email")).sendKeys("magicnimfa@gmail.com");
    // 4 | type | //*[@id="firstName"] | ElenaSeliveystrova
    driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("ElenaSeliveystrova");
    // 5 | type | //*[@id="password"] | 123$qweR
    driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123$qweR");
    // 6 | type | //*[@id="repeatPassword"] | 123$qweRR
    driver.findElement(By.xpath("//*[@id=\"repeatPassword\"]")).sendKeys("123$qweRR");
    // 7 | click | //label[@for="firstName"] | 
    driver.findElement(By.xpath("//label[@for=\"firstName\"]")).click();
    // 8 | verifyText | //*[@id="confirm-err-msg"]/app-error/div |  Passwords do not match
    assertThat(driver.findElement(By.xpath("//*[@id=\"confirm-err-msg\"]/app-error/div")).getText(), is(" Passwords do not match"));
  }
  @Test
  public void positiveScenarios() {
    // Test name: positiveScenarios
    // Step # | name | target | value
    // 1 | open | https://www.greencity.social/#/greenCity | 
    driver.get("https://www.greencity.social/#/greenCity");
    // 2 | click | css=.header_sign-up-btn > span | 
    driver.findElement(By.cssSelector(".header_sign-up-btn > span")).click();
    // 3 | type | id=email | magicnimfa44@gmail.com
    driver.findElement(By.id("email")).sendKeys("magicnimfa44@gmail.com");
    // 4 | type | id=firstName | Elena
    driver.findElement(By.id("firstName")).sendKeys("Elena");
    // 5 | type | //*[@id="password"] | 123$qweR
    driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123$qweR");
    // 6 | type | //*[@id="repeatPassword"] | 123$qweR
    driver.findElement(By.xpath("//*[@id=\"repeatPassword\"]")).sendKeys("123$qweR");
    // 7 | click | //button[@class="greenStyle"] | 
    driver.findElement(By.xpath("//button[@class=\"greenStyle\"]")).click();
    // 8 | assertText | //*[@id="cdk-overlay-2"]/snack-bar-container/simple-snack-bar/span | Congratulations! You have successfully registered on the site. Please confirm your email address in the email box.
    assertThat(driver.findElement(By.xpath("//*[@id=\"cdk-overlay-2\"]/snack-bar-container/simple-snack-bar/span")).getText(), is("Congratulations! You have successfully registered on the site. Please confirm your email address in the email box."));
  }
}