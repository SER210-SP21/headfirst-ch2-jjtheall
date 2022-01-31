package edu.quinnipiac.ser210.beeradviser;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    List<String> getBrands(String color){
        List<String> brands = new ArrayList<>();
        if(color.equals("amber")){
            brands.add("Jack Amber");
            brands.add("Red Moose");
            brands.add("Hop Head Read");
        }
        else if(color.equals("light")){
            brands.add("Bud Lite");
            brands.add("Michelob Ultra");
            brands.add("Corona");
        }
        else if(color.equals("dark")){
            brands.add("Guinness");
            brands.add("Alaskan Smoked Porter");
            brands.add("Expedition Stout");
        }
        else{
            brands.add("Brooklyn Brown Ale");
            brands.add("Newcastle Brown Ale");
            brands.add("Firestone Walker");
        }
        return brands;
    }
}
