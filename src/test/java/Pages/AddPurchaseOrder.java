package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helpers.BaseClass;

public class AddPurchaseOrder extends BaseClass {
	
	public AddPurchaseOrder() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//div[@id=\"page-List/Purchase Order/List\"]//span)[66]")
	private WebElement AddPurchaseOrder; 
	
	@FindBy(xpath = "//h3[text()=\"New Purchase Order\"]")
	private WebElement AssertNewPurchaseOrder;
	
	@FindBy(xpath = "(//*[@id=\"purchase-order-__details\"]//input)[2]")
	private WebElement Supplier;

	@FindBy(xpath = "(//select[@type='text'])[5]")
	private WebElement PurchaseOrderType;
	
	@FindBy(xpath = "(//*[@id=\"purchase-order-__details\"]//select)[5]")
    private WebElement IsImport;	 
	
	@FindBy(xpath = "(//*[@id=\"purchase-order-__details\"]//input)[27]")
	private WebElement TargetPhysicalWarehouse;
	
	@FindBy(xpath = "(//*[@id=\"purchase-order-__details\"]//div)[374]")
	private WebElement ItemTableClick;
	
	@FindBy(xpath = "(//*[@id=\"purchase-order-__details\"]//input)[31]")
	private WebElement Itemcode;
	
	@FindBy(xpath = "(//input[@type='text'])[39]")
	private WebElement Qty;
	
	@FindBy(xpath = "(//*[@id=\"purchase-order-__details\"]//button)[2]")
	private WebElement ClickdownArrow;
	
	@FindBy(xpath = "(//*[@id=\"page-Purchase Order\"]//button)[8]")
	private WebElement Save;
	
	@FindBy(xpath = "(//*[@id=\"page-Purchase Order\"]//span)[35]")
    private WebElement Actions;
	
	@FindBy(xpath = "(//div[@id=\"page-Purchase Order\"]//span)[37]")
	private WebElement SubmitForApproval;

	@FindBy(xpath = "(//div[@id=\"page-Purchase Order\"]//span)[37]")
    private WebElement Approve;
	
	@FindBy(xpath = "//span[text()=\"To Receive and Bill\"]")
	private WebElement AssertToReceiveandBill;
	
	@FindBy(xpath = "(//*[@id=\"purchase-order-__details\"]//select)[2]//option[1]")
	private WebElement ShipementStatus;
	
	@FindBy(xpath = "//div[text()=\"Regular\"]")
	private WebElement PurchaseOrderTypes;
	

	public WebElement getAddPurchaseOrder() {
		return AddPurchaseOrder;
	}

	public WebElement getAssertNewPurchaseOrder() {
		return AssertNewPurchaseOrder;
	}
	
	public WebElement getSupplier() {
		return Supplier;
	}

	public WebElement getPurchaseOrderType() {
		return PurchaseOrderType;
	}
	
	public WebElement getIsImport() {
		return IsImport;
	}
	
	public WebElement getTargetPhysicalWarehouse() {
		return TargetPhysicalWarehouse;
	}
	
	public WebElement getItemTableClick() {
		return ItemTableClick;
	}
	
	public WebElement getItemcode() {
		return Itemcode;
	}
	
	public WebElement getQty() {
		return Qty;
	}
	
	public WebElement getClickdownArrow() {
		return ClickdownArrow;
	}
	
	public WebElement getSave() {
		return Save;
	}

	public WebElement getActions() {
		return Actions;
	}
	public WebElement getSubmitForApproval() {
		return SubmitForApproval;
	}

	public WebElement getApprove() {
		return Approve;
	}

	public WebElement getAssertToReceiveandBill() {
		return AssertToReceiveandBill;
	}

	public WebElement getShipementStatus() {
		return ShipementStatus;
	}

	public WebElement getPurchaseOrderTypes() {
		return PurchaseOrderTypes;
	}
	
}