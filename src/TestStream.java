import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.Test;


public class TestStream {
	
	List<Employee> emps = Arrays.asList(
			new Employee("zhangsan",12, 4545.9),
			new Employee("lisi",32, 9545.9),
			new Employee("wuwang",20, 5256.9),
			new Employee("zhaoliu",17, 3244.9)
			);

	
	
	@Test
	public void test2(){
		Stream<Employee> se=emps.stream().filter((e) ->e.getAge()>19);
		
		se.forEach(System.out::println);
		
	}
	
	
	//创建流的方式
	@Test
	public void test1(){
		
		List<String> lists 	= new ArrayList<String>();
		Stream<String> stream1 = lists.stream();
		
		Employee [] emps = new Employee[10];
		Stream<Employee>stream2 =Arrays.stream(emps);
		
		Stream<String> stream3=Stream.of("aa","bb","cc");
		
		// 除了上面三种方式创建Stream, 还可以无限创建流
		Stream<Integer> stream4 = Stream.iterate(0, (x) -> x+2);
		
		
		
		
	}
}
