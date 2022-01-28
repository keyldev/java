package lab6;

import java.util.function.Function;
import java.util.function.Predicate;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Double, String> myFunc = d ->{ // это чтобы не изобретать велосипед, по дефолту в жабе есть
			if(d < 0) return "Отрицательное";
			if(d == 0) return "Ноль";
			if(d > 0) return "Положительное";
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
 * Своя реализация, изобретаем велосипед.
 CheckDigit<Double> digit = (x) -> {
			if(x>0) return "Положительное";
			if(x < 0) return "Отрицательное"
					;
			return "Ноль";
		};
		System.out.println(digit.checkDigit(-1.0)); // double
  */
