package selenium_jenkins_exercise2;


import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ForgotPass {
    WebDriver driver;
    
    @Test
    public void verifyLogin() throws Exception {
        
        
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Thread.sleep(2000);
        
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.tagName("button")).click();
        String urls=driver.getCurrentUrl();
        System.out.println(urls);   
        Thread.sleep(3000);
        //<p class="oxd-userdropdown-name" data-v-bdd6d943="">Riya sundar</p>
        driver.findElement(By.className("oxd-userdropdown-name")).click();
        Thread.sleep(2000);
        
        
        //<p class="oxd-text oxd-text--p orangehrm-login-forgot-header" data-v-7b563373="" data-v-358db50f="">Forgot your password? </p>


        
        driver.findElement(By.partialLinkText("ogo")).click();
        Thread.sleep(1000);
        
        //forgot password
        
        driver.findElement(By.className("orangehrm-login-forgot")).click();
        Thread.sleep(2000);
        String URL=driver.getCurrentUrl();
        Thread.sleep(1000);
        System.out.println(URL);
        assertEquals("https://opensource-demo.orangehrmlive.com/web/index.php/auth/requestPasswordResetCode",URL);
        System.out.println("printed url");
        
        driver.close();
        
        

}
}
