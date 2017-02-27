package pl.sda.mvc.mvc.model;

import java.util.List;

/**
 * Created by RENT on 2017-02-27.
 */
public class ModelFacade {
    public static List<Integer> getValuesFromModel() {
        return Model.getValues();
    }

    public static void addValueFromModel(int newValue) {
        Model.addValue(newValue);
    }



}
