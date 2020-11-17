import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class E06_JSON {

	
	// # JSON
	//	- JavaScript���� ����ϴ� MapŸ��
	//	- ���ڿ������� Map�� �����ϰ� ǥ���� �� �־ �αⰡ ����
	//	- {Key : Value, Key : Value }�� ���¸� ������
	
	
	
	// # JSON Value�� ���Ǵ� �ڹٽ�ũ��Ʈ Ÿ�Ե�
	//	- '', "" : String
	//	- ����, �Ҽ� : Number
	//	- [] : Array
	//	- {} : JSON
	
	// # JAVA������ JSONŸ���� �������� �ʱ� ������ �����͵���
	// JSON ������ ���ڿ��� �������� �Ѵ� (Parsing, Binding)
	
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
//			"name"	 : 'ȫ�浿'
//		,
//			"tel"	 : '010-1234-1234'
//		,
//			"lotto"	 : [1,2,3,4,5,6]
//		,
//			"age"	 : 15
//		,
//			"programming"	 : ['JAVA','Python','JS']
//		}
		
		map2.put("name", "ȫ�浿");
		map2.put("age", 15);
		map2.put("tel", "010-1234-1234");
		
		
		map2.put("programming", new String[] {"JAVA", "Python", "JS"});
		map2.put("lotto", new Integer[] {1, 2, 3, 4, 5, 6});
		
		
		fr.close();
		
		System.out.println("�����б� �Ϸ�");
		
	}
	
	public static void main(String[] args) {
		
		HashMap<String, Object> map = new HashMap<>();
		map.put("name", "ȫ�浿");
		map.put("age", 15);
		map.put("tel", "010-1234-1234");
		map.put("tall", 100.0);
		map.put("programming", new String[] {"JAVA", "Python", "JS"});
		
		// instanceof �����ڸ� ���� �ش� ���� Ÿ���� ������ �� �ִ�
		System.out.println(map.get("name") instanceof String);
		System.out.println(map.get("age") instanceof String);
		System.out.println(map.get("age") instanceof Integer);
		System.out.println(map.get("programming") instanceof Object[]);
		
		// ���{ "name":"ȫ�浿", "age":15, "tel":"010-1234-1234"
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
