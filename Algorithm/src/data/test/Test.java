package data.test;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.remove(new Integer(6));
		System.out.println("大小："+list.size());
		System.out.println("大小："+list.get(5));
		
		/*List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		
		 Map<String, Object> map1 = new HashMap<String, Object>();
	        map1.put("name", "p");
	        map1.put("cj", "5");
	        Map<String, Object> map2 = new HashMap<String, Object>();
	        map2.put("name", "h");
	        map2.put("cj", "12");
	        Map<String, Object> map3 = new HashMap<String, Object>();
	        map3.put("name", "f");
	        map3.put("cj", "31");
	        list.add(map1);
	        list.add(map3);
	        list.add(map2);
	        
		//排序前 
        for (Map<String, Object> map : list) {
            System.out.println(map.get("cj"));
        }
        Collections.sort(list, new Comparator<Map<String, Object>>() {
            public int compare(Map<String, Object> o1, Map<String, Object> o2) {
                Integer name1 = Integer.valueOf(o1.get("cj").toString()) ;//name1是从你list里面拿出来的一个 
                Integer name2 = Integer.valueOf(o2.get("cj").toString()) ; //name1是从你list里面拿出来的第二个name
                return name1.compareTo(name2);
            }
        });
        //排序后 
        System.out.println("-------------------");
        for (Map<String, Object> map : list) {
            System.out.println(map.get("cj"));
        }*/

	}

}
