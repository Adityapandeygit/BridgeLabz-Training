package m1.offerOnBrand;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Implementation imp = new Implementation();

        List<Model> model = new ArrayList<>();
        model.add(new Model("SUV",500));
        model.add(new Model("SEDAN",800));

        System.out.println(imp.getModelName(model));

        Model result = imp.getModelInfo(model, "SUV", 500);
        System.out.println(result);
    }
}
