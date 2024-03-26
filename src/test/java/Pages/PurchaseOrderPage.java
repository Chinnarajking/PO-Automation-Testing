package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helpers.BaseClass;

public class PurchaseOrderPage extends BaseClass {

	public PurchaseOrderPage() {
		PageFactory.initElements(driver, this);
	
}
	@FindBy(id = "navbar-search")
	private WebElement Search;

	@FindBy(xpath = "//ul[@id=\"awesomplete_list_1\"]//li[1]")
	private WebElement PurchaseOrder;
	
	@FindBy(xpath = "//div//h3[text()=\"Purchase Order\"]")
	private WebElement AssertPO;
	
	
	public WebElement getSearch() {
		return Search;
	}

	public WebElement getPurchaseOrder() {
		return PurchaseOrder;
	}
	
	public WebElement getAssertPO() {
		return AssertPO;
	}
		
	}		
