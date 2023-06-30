package br.com.alura.leilao;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class PageObject {
	
	protected WebDriver browser;

	public PageObject(WebDriver browser) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		if (browser != null) {
			this.browser = browser;
		} else {
			this.browser = new ChromeDriver();
		}
		//serve caso tenha alguma coisa que está pesando o carregamento da pagina
		this.browser.manage().timeouts()
				.implicitlyWait(5, TimeUnit.SECONDS);
	}

	/*
	public void fechar() {
		this.browser.quit();
	}
	*/
}
