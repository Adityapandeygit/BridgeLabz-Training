package Demo.Junit;

import java.util.List;

public class ListManager {
	public void addElement(List<Integer> list, int element) {
        list.add(element);
    }

    public void removeElement(List<Integer> list, int element) {
        for(int i=0;i<list.size();i++) {
        	if(list.get(i)==element) {
        		list.remove(i);
        	}
        }
    }

    public int getSize(List<Integer> list) {
        return list.size();
    }
}
