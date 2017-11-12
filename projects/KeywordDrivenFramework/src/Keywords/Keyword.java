package Keywords;
import java.util.List;
public interface Keyword {
	public boolean validateObject(List<String> params);
	public void execute(List<String> params);
}
