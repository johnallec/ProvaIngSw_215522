package main_package;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MyListUtil {
	
	private List<Integer> list;
	
	public MyListUtil() {
		List<Integer> tmp = new ArrayList<Integer>();
		Random r = new Random();
		for(int i=0; i<10; ++i) {
			int n = r.nextInt(10)+1;
			
			if(n % 2 == 0) tmp.add(n);
			else tmp.add(i+1);
		}
		this.list = tmp;
	}
	
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
