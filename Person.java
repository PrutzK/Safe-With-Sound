package sws;

import java.util.ArrayList;
import java.util.List;

/**
 * Vector object to represent a face. 
 * <feature 0, feature 1, ...., feature n>
 *
 */
public class Person {
    private final List<Double> featuresList;
    Person(List<Double> features){
        featuresList = new ArrayList<>(features);
    }
    
    
    
}
