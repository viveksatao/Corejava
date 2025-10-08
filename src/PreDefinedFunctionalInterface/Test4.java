package PreDefinedFunctionalInterface;
import java.util.function.*;
public class Test4 {
	

		
		
		public static void main(String[] args) {
//			        ReturnType
			Supplier<Integer> s = ()->
			{
				return 23;
			};
			System.out.println(s.get());
		}
	}


