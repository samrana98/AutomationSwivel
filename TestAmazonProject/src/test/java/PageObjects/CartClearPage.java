package PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartClearPage {
	
	private WebDriver driver;
	private By itemName = By.className("a-truncate-cut");
	private By currentQuantity = By.xpath("//span[@id='sc-subtotal-label-buybox']");
	private By totalPrice= By.xpath("//span[@id='sc-subtotal-amount-activecart']");
	private By deleteBtn = By.className("a-color-link");
	

	
	public CartClearPage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	public String getItemName() throws Exception {
		try {
			//get book title from Cart Clear Page
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			String bookTitle = driver.findElement(itemName).getText();
			return bookTitle;
		} catch (Exception e) {
			throw e;
		}
	}
	
	public String getTotalPrice() throws Exception {
		try {
			//get Total price from Cart Clear Page
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			String bookPrice = driver.findElement(totalPrice).getText();
			return bookPrice;
		} catch (Exception e) {
			throw e;
		}
	}
	
	
	public String getCurrentQuantity() throws Exception {
		try {
			//get book quantity from Cart Clear Page
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			String bookQuantity = driver.findElement(currentQuantity).getText();
			return bookQuantity;
		} catch (Exception e) {
			throw e;
		}
	}
	
	public FinalPage itemDelete() throws Exception{
		try {
			//Delete the item from the cart
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.findElement(deleteBtn).click();
			
			return new FinalPage(driver);
		} catch (Exception e) {
			throw e;
		}
	}
	

}
