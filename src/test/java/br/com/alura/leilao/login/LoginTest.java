package br.com.alura.leilao.login;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    @Test
    public void deveriaEfetuarLoginComDadosValidados(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.navigate().to("http://localhost:8080/login");
        webDriver.findElement(By.id("username")).sendKeys("fulano");
        webDriver.findElement(By.id("password")).sendKeys("pass");
        webDriver.findElement(By.id("login-form")).submit();

        Assert.assertFalse(webDriver.getCurrentUrl().equals("http://localhost:8080/login"));
        Assert.assertEquals("fulano", webDriver.findElement(By.id("usuario-logado")).getText());

    }
}
