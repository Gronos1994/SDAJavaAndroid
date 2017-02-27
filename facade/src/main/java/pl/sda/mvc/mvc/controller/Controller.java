package pl.sda.mvc.mvc.controller;


import pl.sda.mvc.mvc.model.Model;
import pl.sda.mvc.mvc.model.ModelFacade;

import java.util.List;
import java.util.Random;

public class Controller {
    public int getFibValue(int n) {
        Random random = new Random();
        int val = random.nextInt(2000);
        ModelFacade.addValueFromModel(val);
        return val;
    }

    public double average() {
        double sum = 0;
        List<Integer> values = ModelFacade.getValuesFromModel();
        for (int val : values) {
            sum = sum + val;
        }
        return sum / values.size();
    }
}
