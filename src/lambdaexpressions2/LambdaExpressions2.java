
package lambdaexpressions2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

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
        

        System.out.println("Printing cars between price 19000 and 25000");
        //        printCarsPriceRange(cars, 19000, 25000);
        printCars(cars, (c)-> 19000 <= c.getPrice() && c.getPrice() <= 25000);
        
        
        System.out.println("Printing red cars ");
        //        printCarByColor(cars, "Red");
        printCars(cars, (c)-> c.getColor().equals("Red"));
        
        
        Function<Car,String> priceAndColor = (c)-> " price: "+c.getPrice()+" ,color: "+c.getColor();
        String stringCar = priceAndColor.apply(cars.get(0));
        System.out.println(stringCar);
    }
    
//    public static void printCarsPriceRange(List<Car> cars,int low,int high){
//        for(Car c:cars){
//            if(low <= c.getPrice() && c.getPrice() <= high){
//                c.printCar();
//            }
//        }
//    }
//    
//    public static void printCarByColor(List<Car> cars,String color){
//        for(Car c:cars){
//            if(c.getColor().equals(color)){
//                c.printCar();
//            }
//        }
//    }
    
    public static void printCars(List<Car> cars,Predicate<Car> predicate){
        for(Car c:cars){
            if(predicate.test(c)){
                c.printCar();
            }
        }
    }
    
    
}
//
//@FunctionalInterface
//interface Condition<T>{
//    public boolean test(T t);
//}
