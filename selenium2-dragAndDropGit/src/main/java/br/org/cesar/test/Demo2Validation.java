package br.org.cesar.test;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.org.cesar.common.Demo2Page;
import br.org.cesar.util.Utils;

public class Demo2Validation extends BaseTestcase{
	/**
	 * Example app is from Selenium 2 for beginners book
	 * Simple drag and drop app
	 */

	@Before
	public void before(){
		driver.navigate().refresh();
		WebElement frameElement = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frameElement);
	}
	/**
	 *  Drags item to yellow block 
	 */
	@Test
	public void dragToTargetBlock() {
		Demo2Page.assertTargetTextBeforeDrop();
		Demo2Page.dragItemToLocation();
		Demo2Page.assertTargetTextAfterDrop();
	}
	
	/**
	 *  Drags item to specified position
	 *  10, 10 nao é suficiente para chegar ao alvo
	 */
	@Test
	public void dragToSpecifiedPosition() {
		Demo2Page.assertTargetTextBeforeDrop();
		Demo2Page.dragItemToPosition(10, 10);
		Demo2Page.assertTargetTextBeforeDrop();
	}
}
