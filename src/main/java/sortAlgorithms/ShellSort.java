package sortAlgorithms;

import java.util.List;

public class ShellSort {
	
	public List<Integer> shellSort(List<Integer> arr) {
		if(arr.size() <= 1) { return arr; }
		
		for(int gap=(int) Math.floor(arr.size()/2); gap>0; Math.floor(gap/=2)) {
			for(int i=gap; i<arr.size(); i++) {
				for(int j=i; j>=gap && arr.get(j-gap) > arr.get(j); j-=gap) {
					int temp = arr.get(j-gap);
					arr.set(j-gap, arr.get(j));
					arr.set(j, temp);
				}
			}
		}
		
		return arr;
	}
}
