package com.interview;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Airbnb {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chrom c\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		String[] a = { "Amazing pools", "Farms", "Beachfront", "Castles" };
		d.get("https://www.airbnb.co.in/");
		Thread.sleep(3000);
		/*
		 * WebElement c =
		 * d.findElement(By.xpath("//span[@class='i1h5tsj6 dir dir-ltr']"));
		 * 
		 * if (c.isDisplayed()) {
		 * 
		 * c.click();
		 * 
		 * } else {
		 * 
		 * System.out.println("Add is not there");
		 * 
		 * }
		 */

		List<WebElement> alloptions = d.findElements(By.xpath("//span[@class='t1h65ots dir dir-ltr']"));
		List<String> text = new ArrayList<String>();

		for (String b : a) {

			for (int i = 0; i < alloptions.size(); i++) {

				if (b.equals(alloptions.get(i).getText())) {

					System.out.println(b + " is available in ui");

				} else {

					// System.out.println("");

				}

			}
		}

	}

}