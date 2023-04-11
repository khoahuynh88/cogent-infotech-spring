package cogent.infotech.com.annotations;

import org.springframework.stereotype.Component;

@Component
public class HistoryService {
	public void store() {
		System.out.println("history store");
	}
}
