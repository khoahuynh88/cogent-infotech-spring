package cogent.infotech.com.annotations;

import org.springframework.stereotype.Component;

@Component("chatroom")
public class ChatRoomService {
 public void start () {
	 System.out.println("Chat start");
 }
}
