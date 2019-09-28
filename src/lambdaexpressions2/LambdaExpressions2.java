
package lambdaexpressions2;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author me
 */
public class LambdaExpressions2 {

    
    public static void main(String[] args) {
       
        List<Car> cars = Arrays.asList(
                new Car("Honda","Accord","Red",22300),
                new Car("Honda","Civic","Blue",17700),
                new Car("Toyota","Land Cruiser","White",45300),
                new Car("Toyota","Corolla","Black",23300),
                new Car("Toyota","Yaris","Blue",16300),
                new Car("Nissan","Skyline","White",56300),
                new Car("Mitsubishi","Gaant","White",45300),
                new Car("Jeep","Wrangler","Red",33300)
        );
    }
    
    public static void printCarsPriceRange(List<Car> cars,int low,int high){
        for(Car c:cars){
            if(low <= c.getPrice() && c.getPrice() <= high){
                c.printCar();
            }
        }
    }
    
    public static void printCarByColor(List<Car> cars,String color){
        for(Car c:cars){
            if(c.getColor().equals(color)){
                c.printCar();
            }
        }
    }
    
}
