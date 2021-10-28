package main_package;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MyListUtil {
	
	public Object[] sort(Object[] l, int n) {
		ArrayList<Integer> tmp = new ArrayList<Integer>();
		for(int i=0; i<l.length; ++i) {
			tmp.add((Integer) l[i]);
		}
		if(n==0) {
			Collections.sort(tmp);
		}
		else if(n==1) {
			Collections.sort(tmp);
			Collections.reverse(tmp);
		}
		for(int i=0; i<l.length; ++i) {
			l[i]=tmp.get(i);
		}
		return l;
	}
}
