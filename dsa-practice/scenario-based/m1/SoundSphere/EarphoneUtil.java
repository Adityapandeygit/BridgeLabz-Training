package m1.SoundSphere;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EarphoneUtil {
	public Stream<Earphone> getEarphonesByBrandName(Stream<Earphone> earphoneStream, String brandName){
		Stream<Earphone> ans = earphoneStream.filter(x->x.brandName.equals(brandName));
		return ans;
	}
	
	public List<Earphone> getEarphonesWithinPriceRange(Stream<Earphone> earphoneStream, double minimumPrice, double maximumPrice){
		List<Earphone> ans = earphoneStream.filter(x->(x.price>=minimumPrice && x.price<=maximumPrice)).collect(Collectors.toList());
		return ans;
	}

	

}
