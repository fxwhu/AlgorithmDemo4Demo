

import java.util.HashMap;


import com.kyson.chapter1.section1.DumplicateElements;
import com.kyson.chapter1.section1.EquivalentKey;
import com.kyson.chapter1.section1.Histogram;
import com.kyson.chapter1.section2.Point2D;

public class FileIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap<String, String> map = new HashMap<>();
		
		/****
		 *  section 1
		 */
		//找到重复元素
		map.put("1.1.28", DumplicateElements.class.getName());
		map.put("1.1.29", EquivalentKey.class.getName());
		map.put("1.1.32", Histogram.class.getName());
		
		/***
		 * section 2
		 */
		map.put("1.2.1", Point2D.class.getName());

	}

}
