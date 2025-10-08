package PreDefinedFunctionalInterface;
import java.util.function.*;

public class Test5 {

	public static void main(String[] args) {
		BiPredicate <Integer,Integer> bp = (x,y)->((x+y)/2)%2==0;
		System.out.println(bp.test(12,12));
		
		BiConsumer<String,String>  bcon = (str1,str2)->System.out.println(str1+" "+str2);
		bcon.accept("Vivek","Satao");
		
		
		BiFunction<Integer,Integer,Integer> bif = (x,y)->x+y;
		System.out.println("Addition is :"+bif.apply(20,30));
		
	}
}
