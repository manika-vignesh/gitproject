package orange;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homepagetest {
	
	Homepafeobject homepage;
	Basepage baspage;

	
		
	 @Test
	 public void getTabDisplay(){
		Assert.assertTrue(homepage.womentabDisplay().isDisplayed());
		Assert.assertTrue(homepage.dresstabDisplay().isDisplayed());
		Assert.assertTrue(homepage.T_shirtstabDisplay().isDisplayed());
	 }
	 
	 @Test
	 public void Tabverification(){
    	homepage.verifyWomentab();
    	String title = homepage.getTitlte();
    	Assert.assertTrue(title.contains("women"));
    	
    	homepage.verifyDresstab();
    	Assert.assertTrue(homepage.getTitlte().contains("Dresses"));
    	
    	homepage.verifyTshirttab();
    	Assert.assertTrue(homepage.getTitlte().contains("T_shirts"));
    	
		 
		 
	 
		 
		 
		 
	 }

}
















































