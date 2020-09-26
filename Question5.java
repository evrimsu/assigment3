package assigment3_arithmetic;

public class Question5 {

	public static void main(String[] args) {
		
		int hours,minutes;
	 int Seconds=3695;
	int remainingSecond;
	   
	
	minutes=(Seconds%3600)/60;

	System.out.println(minutes);
	
	remainingSecond=Seconds%60;
	System.out.println(remainingSecond);
	
	hours=Seconds/3600;
	System.out.println(hours);
	
	System.out.println(hours+"hours, " +minutes + "minutes,and "+ remainingSecond +"seconds");
	
	
	
	
	
	
	}

}
