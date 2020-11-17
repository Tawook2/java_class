import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class E06_JSON {

	
	// # JSON
	//	- JavaScript에서 사용하는 Map타입
	//	- 문자열만으로 Map을 간결하게 표현할 수 있어서 인기가 많다
	//	- {Key : Value, Key : Value }의 형태를 가진다
	
	
	
	// # JSON Value에 사용되는 자바스크립트 타입들
	//	- '', "" : String
	//	- 숫자, 소수 : Number
	//	- [] : Array
	//	- {} : JSON
	
	// # JAVA에서는 JSON타입을 지원하지 않기 때문에 데이터들을
	// JSON 형태의 문자열로 만들어줘야 한다 (Parsing, Binding)
	
public static void jsonFileToMap(Map<String, Object> map2) throws IOException {
		
		FileReader fr = new FileReader("D:\\java_io\\data.json");
		
		String builder = new String();
		
		int ch;
		while((ch = fr.read()) != -1) {
			builder += ((char)ch);
		}
		String result = builder.substring(3, builder.length()-1);
		String[] bd = result.split(":|\t");
		
		
		
		
		System.out.println(Arrays.toString(bd));
		
		
		
		
		//System.out.println(builder);
		
//		{
//			"name"	 : '홍길동'
//		,
//			"tel"	 : '010-1234-1234'
//		,
//			"lotto"	 : [1,2,3,4,5,6]
//		,
//			"age"	 : 15
//		,
//			"programming"	 : ['JAVA','Python','JS']
//		}
		
		map2.put("name", "홍길동");
		map2.put("age", 15);
		map2.put("tel", "010-1234-1234");
		
		
		map2.put("programming", new String[] {"JAVA", "Python", "JS"});
		map2.put("lotto", new Integer[] {1, 2, 3, 4, 5, 6});
		
		
		fr.close();
		
		System.out.println("파일읽기 완료");
		
	}
	
	public static void main(String[] args) {
		
		HashMap<String, Object> map = new HashMap<>();
		map.put("name", "홍길동");
		map.put("age", 15);
		map.put("tel", "010-1234-1234");
		map.put("tall", 100.0);
		map.put("programming", new String[] {"JAVA", "Python", "JS"});
		
		// instanceof 연산자를 통해 해당 값의 타입을 구분할 수 있다
		System.out.println(map.get("name") instanceof String);
		System.out.println(map.get("age") instanceof String);
		System.out.println(map.get("age") instanceof Integer);
		System.out.println(map.get("programming") instanceof Object[]);
		
		// 출력{ "name":"홍길동", "age":15, "tel":"010-1234-1234"
		//		"programming" : ['JAVA', 'Python', 'JS']
		
		
		
		System.out.println(map);
		
		StringBuilder str = new StringBuilder();
		
		str.append("{");
		for(Entry<String, Object> entry : map.entrySet()) {
			
			if(entry.getValue() instanceof String)
			str.append("\"" + entry.getKey() + "\"" + ":" + "\""+entry.getValue() + "\",");
			
			else if(entry.getValue() instanceof Object[]) {
				

				str.append("\"" + entry.getKey() + "\""+ ":"  + Arrays.deepToString((Object[]) entry.getValue()));
				
			}
			else {
				str.append("\"" + entry.getKey() + "\"" + ":" + entry.getValue() + ",");
			}
			
		}
		
		str.append("}");
		System.out.println(str.toString());
		
	}
}
