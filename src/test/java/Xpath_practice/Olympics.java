package Xpath_practice;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Olympics {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String country = s.nextLine();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://olympics.com/en/olympic-games/tokyo-2020/medals");
		driver.findElement(By.xpath("//button[.='Yes, I am happy']")).click();
		String gold = driver.findElement(By.xpath("//span[.='" + country
				+ "']/ancestor::div[contains(@data-row-id,'country-medal-row')]/following-sibling::div[contains(@data-medal-id,'gold-medals-row')][1]//span[contains(@class,'OcsTextstyles__')]"))
				.getText();
		String silver = driver.findElement(By.xpath("//span[.='" + country
				+ "']/ancestor::div[contains(@data-row-id,'country-medal-row')]/following-sibling::div[contains(@data-medal-id,'silver-medals-row')][1]//span[contains(@class,'OcsTextstyles__')]"))
				.getText();
		String bronze = driver.findElement(By.xpath("//span[.='" + country
				+ "']/ancestor::div[contains(@data-row-id,'country-medal-row')]/following-sibling::div[contains(@data-medal-id,'bronze-medals-row')][1]//span[contains(@class,'OcsTextstyles__')]"))
				.getText();
		System.out.println(country + "=== " + gold + " Gold / " + silver + " Silver / " + bronze + " Bronze");
		s.close();

	}

}