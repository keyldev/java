package lab6;

import java.util.function.Function;
import java.util.function.Predicate;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Double, String> myFunc = d ->{ // ��� ����� �� ���������� ���������, �� ������� � ���� ����
			if(d < 0) return "�������������";
			if(d == 0) return "����";
			if(d > 0) return "�������������";
			return "idk";
		};
		
		System.out.println(myFunc.apply(-3.5));
		System.out.println(myFunc.apply(0.0));
		System.out.println(myFunc.apply(3.5));
	}

}
// own interface
interface CheckDigit<T>{
	public String checkDigit(T digit);
}
/*
 * ���� ����������, ���������� ���������.
 CheckDigit<Double> digit = (x) -> {
			if(x>0) return "�������������";
			if(x < 0) return "�������������"
					;
			return "����";
		};
		System.out.println(digit.checkDigit(-1.0)); // double
  */
