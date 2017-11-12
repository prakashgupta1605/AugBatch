package Keywords;
import java.util.List;
import org.openqa.selenium.WebElement;
import common.KeywordUtilities;

public class EnterText implements Keyword{
WebElement textBox;	
	@Override
	public boolean validateObject(List<String> params) {
		String locator = params.get(0);	
		textBox = KeywordUtilities.getElement(locator);
		if(textBox!=null)
			return true;
		return false;
	}
	@Override
	public void execute(List<String> params) {
		textBox.sendKeys(params.get(1));		
	}

}
