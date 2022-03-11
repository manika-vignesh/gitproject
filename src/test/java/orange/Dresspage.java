package orange;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dresspage extends Basepage{
	
	
	
	@FindBy(xpath ="//*[@id='block_top_menu']/ul/li[1]/a")
	private WebElement womentab;
	
	@FindBy(xpath ="//*[@id='ul_layered_id_attribute_group_1']")
	private WebElement size_s;
	
	@FindBy(xpath="")

}
