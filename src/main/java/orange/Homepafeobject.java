package orange;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepafeobject  extends Basepage{
	
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[1]/a")
	private WebElement womentab;
	
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[2]/a")
	private WebElement dresstab;
	
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[3]/a")
	private WebElement T_shirtstab;
	
	
	public Homepafeobject(){
		PageFactory.initElements(driver, this);
		
	}
	
	public WebElement womentabDisplay(){
		return womentab;
	}
	public WebElement dresstabDisplay(){
		return dresstab;
	}	
	public WebElement tshitDisplay(){
		return T_shirtstab;
	}	
	public void verifyWomentab(){
		 womentab.click();;
	}	
	public void verifyDresstab(){
		 dresstab.click();;
	}	
	public void verifyTshirttab (){
		 T_shirtstab.click(); ;
	}
	@FindBy (id="newsletter-input")
	 WebElement enterMailID;
	
	public void setEmailID(String mailID){
		setText(enterMailID, mailID);
	}
	@FindBy(name="submitNewsletter")
	WebElement submit;
	
	public void clickNewsletter(){
		submit.click();
	}
	
	
	
	
	
	@FindBy (className="title_block")
	private WebElement womentabverification;
	
	@FindBy (className="cat_desc")
	private WebElement dresstabverification;
	
	@FindBy (xpath="//*[@id='center_column']/h1/span[1]")
	private WebElement T_shirtstabvarification;
	
	
	
	
	
	
	@FindBy (xpath="//*[@ class='alert alert-success']")
	private WebElement subscriptionmsg;


	public WebElement T_shirtstabDisplay() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	


	
	}
	
	
	
	
	
	
	
	
	


