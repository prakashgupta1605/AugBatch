package Keywords;
import java.util.List;
import org.openqa.selenium.WebElement;
import common.KeywordUtilities;

public class ClickButton implements Keyword{
WebElement button;	
	@Override
	public boolean validateObject(List<String> params) {
		String locator = params.get(0);	
		button = KeywordUtilities.getElement(locator);
		if(button!=null)
			return true;
		return false;
	}
	@Override
	public void execute(List<String> params) {
		button.click();	
	}

}
