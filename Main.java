package lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class project {
    public static void main(String[] args) {
        System. setProperty( "webdriver.chrome.driver" ,"C:\\Users\\Dell\\Desktop\\jar files\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver. get ("https://www.pixwox.com/profile/upes_dehradun/");

        //driver.switchTo().newWindow(WindowType.TAB);
        //driver.navigate().to("https://www.pixwox.com/post/6849591757571867666752/");
        //System.out.println(driver.findElement(By.className("sum_full")).getText());
        //String a = driver.findElement(By.className("sum_full")).getText();
        //System.out.println(a);

        //driver.switchTo().newWindow(WindowType.TAB);
        //driver.navigate().to("https://www.pixwox.com/post/6849196529402552605836/");
        //System.out.println(driver.findElement(By.className("sum_full")).getText());
        //String b = driver.findElement(By.className("sum_full")).getText();
        //System.out.println(b);

        //driver.switchTo().newWindow(WindowType.TAB);
        //driver.navigate().to("https://www.pixwox.com/post/6849102173542053704141/");
        //System.out.println(driver.findElement(By.className("sum_full")).getText());
        //String c = driver.findElement(By.className("sum_full")).getText();
        //System.out.println(c);

        //driver.switchTo().newWindow(WindowType.TAB);
        //driver.navigate().to("https://www.pixwox.com/post/6849366121645322661855/");
        //System.out.println(driver.findElement(By.className("sum_full")).getText());
        //String d = driver.findElement(By.className("sum_full")).getText();
        //System.out.println(d);

        //driver.switchTo().newWindow(WindowType.TAB);
        //driver.navigate().to("https://www.pixwox.com/post/6849463937681049294071/");
        //System.out.println(driver.findElement(By.className("sum_full")).getText());
        //String e = driver.findElement(By.className("sum_full")).getText();
        //System.out.println(e);

        for(int i=0;i<=5;i++){
            driver.findElement(By.xpath("//*[@class='preview']")).click();
            //driver.findElement(By.name("data-src")).getText();
        }
        //try {
        //    Thread.sleep(2000);
        //} catch (InterruptedException e1) {
        //
        //
        //}
        //driver.quit();


    }



}