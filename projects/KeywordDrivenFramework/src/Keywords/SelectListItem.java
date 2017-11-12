package Keywords;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import common.KeywordUtilities;

public class SelectListItem implements Keyword{
WebElement selectBox;	
	@Override
	public boolean validateObject(List<String> params) {
		String locator = params.get(0);	
		selectBox = KeywordUtilities.getElement(locator);
		if(selectBox!=null)
			return true;
		return false;
	}
	@Override
	public void execute(List<String> params) {
		Select select = new Select(selectBox);
		select.selectByValue(params.get(1));
		
	}

}
