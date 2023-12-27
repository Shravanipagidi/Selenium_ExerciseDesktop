package selenium_jenkins_exercise2;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginLogout extends BaseTest2{
    
    
    @Test
    public void verifyLogin() throws Exception {
        
        Thread.sleep(3000);
        
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.tagName("button")).click();
        
        
        Thread.sleep(2000);
        System.out.println("application URL after login: " + driver.getCurrentUrl());
        
        
        driver.findElement(By.className("oxd-userdropdown-name")).click();
        Thread.sleep(2000);
        
        
        
        
        
//      driver.findElement(By.linkText("Logout")).click();
        
        
//      driver.findElement(By.partialLinkText("Logo")).click();
        
        
        driver.findElement(By.partialLinkText("ogo")).click();
        
        
        Thread.sleep(3000);
        System.out.println("application URL after logout: " + driver.getCurrentUrl());
        
        
        
    }

}
