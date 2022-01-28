package lab3forNik;

import java.util.Random;

public class FrameTilda extends ABasicBorder{

	private int y;
	/*
	 * y - height
	 * */
	Random rnd = new Random();
	public FrameTilda(String word, int y) {
		this.word = word;
		this.y = y;
		this.symbol = Character.toString(symbol.charAt(rnd.nextInt(5)));
	}
	@Override
	public void printFrame(String body) {
		System.out.println(body);
	}
	@Override
	public String setUpper() {
		String upper = "";
		
		for(int i = 0; i < 2+word.length(); i++) {
			upper += symbol ;
		}
		return upper +"\n";
	}
	@Override
	public String setBody() {
		String body = "";
		String whiteSpace = "";
		for(int i = 0; i < word.length(); i++)
		{
			whiteSpace += " ";
		}
		for(int i = 0; i < y; i++) {
			if(i == (y / 2) ) body += String.format("%s%s%s\n", symbol ,word,symbol);
			else body += String.format("%s%s%s\n",symbol, whiteSpace,symbol);
		}
		return body+ "";
	}
	@Override
	public String setBottom() {
		String bottom = "";
		for(int i = word.length() + 2; i > 0; i--) {
			bottom += symbol;
		}
		return bottom;
	}
}
