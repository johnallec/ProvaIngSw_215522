package main_package;

import java.util.Collections;
import java.util.List;

public class MyListUtil {
	
	private List<Integer> list;
	
	public MyListUtil(List<Integer> list) {
		this.list = list;
	}
	
	public void sort(int n) {
		if(n==0) {
			Collections.sort(list);
		}
		else if(n==1) {
			Collections.sort(list);
			Collections.reverse(list);
		}
	}
}
