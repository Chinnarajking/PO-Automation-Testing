package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helpers.BaseClass;

public class PurchaseReceipt extends BaseClass {
public PurchaseReceipt() {
	PageFactory.initElements(driver, this);
	
}

@FindBy(xpath = "(//button[@type='button'])[11]")
private WebElement ClickCreate;

@FindBy(xpath = "(//a[text()='Purchase Receipt'])[1]")
private WebElement ClickPurchaseReceipt;

@FindBy(xpath = "(//*[@id=\"purchase-receipt-__details\"]//input)[1]")
private WebElement Supplier;

@FindBy(xpath = "(//*[@id=\"purchase-receipt-__details\"]//input)[14]")
private WebElement Currency;

@FindBy(xpath = "(//*[@id=\"purchase-receipt-__details\"]//input)[16]")
private WebElement PriceList;

@FindBy(xpath = "(//*[@id=\"purchase-receipt-__details\"]//input)[20]")
private WebElement PhysicalAcceptedWarehouse;

@FindBy(xpath = "//a[text()=\"85323: DECKBOX,5 SET BUNDLE\"]")
private WebElement ItemCode;

@FindBy(xpath = "(//div[text()=\"5\"])[2]")
private WebElement AcceptedQuantity;
 

}

