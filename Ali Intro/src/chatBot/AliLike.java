package chatBot;

public class AliLike implements Topic {
	
	private boolean inLikeLoop;
	private String likeResponse;
	
	public void talk(){
		AliBot.print("What are some things you like?");
		inLikeLoop= true;
		while(inLikeLoop){
			likeResponse = AliBot.getInput();
			int likePsn = AliBot.findKeyword();
		}
	}

}
