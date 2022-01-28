package lab3forNik;

public abstract class ABasicBorder {
	public String symbol = "+*-~=."; // строка с рандомными символами коробки
	public String word;

	
	abstract void printFrame(String frame); 
	abstract String setUpper();
	abstract String setBody();
	abstract String setBottom();

}
