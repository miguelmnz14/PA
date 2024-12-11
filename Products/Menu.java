package Products;

import java.util.List;

public class Menu implements Products{
    private static int discount;
    private List<IndividualProduct> products;


    public IndividualProduct getProduct(int id){
        return products.get(id);
    }


    public int getNumProducts(){
        return products.size();
    }


    public String getName(){
        String names = "";
        for (IndividualProduct p : products){
            if (!names.isEmpty()){
                names += ", ";
            }
            names += p.getName();
        }
        return names;
    }


    public int getPrice(){
        int priceTotal = 0;
        for (IndividualProduct p : products){
            priceTotal += p.getPrice();
        }
        return priceTotal;
    }
}
