package cogent.infotech.com.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ChatService {
	private final ChatRoomService chatRoomService;
	private final HistoryService historyService;
	@Autowired
	public ChatService(ChatRoomService chatRoomService, HistoryService historyService) {
		super();
		this.chatRoomService = chatRoomService;
		this.historyService = historyService;
	}
	
	public void chat() {
		historyService.store();
		chatRoomService.start();
	}
}
