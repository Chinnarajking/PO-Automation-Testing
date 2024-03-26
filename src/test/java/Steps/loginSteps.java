package Steps;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import Helpers.BaseClass;
import Pages.AddPurchaseOrder;
import Pages.PurchaseOrderPage;
import Pages.loginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class loginSteps extends BaseClass {
	
	//public WebDriver driver;

	@Given("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
		browserLaunch("https://13.52.99.208/login#login");
	}
	@When("clicks on login button")
	public void clicks_on_login_button() {
	   
		loginPage a = new loginPage();
		btnClick(a.getAdvanced());
		btnClick(a.getProceed());
		inputText(a.getUsername(), "chinnaraj@riverstonetech.in");
		inputText(a.getPassword(), "Lion@9848");
		btnClick(a.getLogin());
		
	}
	@And("user is navigated to the purchase order page")
	public void user_is_navigated_to_the_purchase_order_page() throws InterruptedException {
		PurchaseOrderPage b = new PurchaseOrderPage();
		Thread.sleep(3000);
		inputText(b.getSearch(), "Purchase Order");
		Thread.sleep(2000);
		btnClick(b.getPurchaseOrder());
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
	    assertTextEquals(b.getAssertPO(), "Purchase Order");
	    getText(b.getAssertPO());
	   
	
	}
	
	@When("user click on Add Purchase Order")
	public void user_click_on_add_purchase_order() throws InterruptedException {
	AddPurchaseOrder c = new AddPurchaseOrder();
	//Thread.sleep(2000);
	btnClick(c.getAddPurchaseOrder());
	Thread.sleep(3000);
	assertTextEquals(c.getAssertNewPurchaseOrder(), "New Purchase Order");
	getText(c.getAssertNewPurchaseOrder());
	inputText(c.getSupplier(), "TEST VENDOR");
	Thread.sleep(2000);
	enter(c.getSupplier());
	dropDownText(c.getPurchaseOrderType(), "Regular");
	dropDownText(c.getIsImport(), "No");
	inputText(c.getTargetPhysicalWarehouse(), "California - Commerce (USA) - UPIL");
	Thread.sleep(2000);
	enter(c.getTargetPhysicalWarehouse());
	btnClick(c.getItemTableClick());
	inputText(c.getItemcode(), "85323");
	Thread.sleep(3000);
	enter(c.getItemcode());
	Thread.sleep(3000);
	scrollDown();
	cleartext(c.getQty());
	Thread.sleep(2000);
	JavaScriptExecutor(c.getQty(), "5");
	enter(c.getQty());
	Thread.sleep(2000);
	btnClick(c.getClickdownArrow());
	Thread.sleep(1000);
	btnClick(c.getSave());
	Thread.sleep(3000);
	btnClick(c.getActions());
	btnClick(c.getSubmitForApproval());
	Thread.sleep(2000);
	btnClick(c.getActions());
	Thread.sleep(2000);
	btnClick(c.getApprove());
	Thread.sleep(3000);
	assertTextEquals(c.getAssertToReceiveandBill(), "To Receive and Bill");
	getText(c.getAssertToReceiveandBill());
	Thread.sleep(2000);
	assertTextEquals(c.getShipementStatus(), "To be shipped");
	getText(c.getShipementStatus());
	Thread.sleep(2000);
	assertTextEquals(c.getPurchaseOrderTypes(), "Regular");
	Thread.sleep(1000);
	getText(c.getPurchaseOrderTypes());
	
	
     
     LocalDateTime currentDateTime = LocalDateTime.now();
     LocalDate currentDate = currentDateTime.toLocalDate();
     LocalTime currentTime = currentDateTime.toLocalTime();
     
     // Check if the current time is before 12:30
     if (currentTime.isBefore(LocalTime.of(12, 30))) {
         // Subtract one day from the current date
         currentDate = currentDate.minusDays(1);
         System.out.println(currentDate);
     }
	}
}