package chatBot;

import datatype8.AliBot;

public class School implements Topic {
	private boolean inSchoolLoop;
	public String schoolResponse;
	public School(){
		
	}
	public void talk() {
		inSchoolLoop = true;
		while(inSchoolLoop){
			AliBot.print("Tell me about school.");
			schoolResponse = AliBot.getInput();
			if(schoolResponse.indexOf("stop")> 0){
				inSchoolLopp = false;
				AliBot.talkForever();
				
			}
			
			else{
				AliBot.print(s);
			}
		}
		public boolean isTriggered(String userInput){
			if(AliBot.findKeyword(userInput, "school", 0) >= 0){
				return true;
			}
			
			
		}
	}

}
