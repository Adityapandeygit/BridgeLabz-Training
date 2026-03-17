package m1.offerOnBrand;

import java.util.ArrayList;
import java.util.List;

public class Implementation {
	public List<String> getModelName(List<Model> list){
		List<String> modelList = new ArrayList<>();
		for(Model m : list) {
			modelList.add(m.getModel());
		}
		return modelList;
	}
	
	public Model getModelInfo(List<Model> list,String model,int speed){
		for(Model m : list) {
			if(m.getModel().equals(model) && m.getcarSpeed()==speed) {
				return m;
			}
		}
		return null;
	}
	
	
}
