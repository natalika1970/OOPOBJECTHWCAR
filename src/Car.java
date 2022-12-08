public class Car {

    public String brand;
    public String model;
    public double engineCapacity;
    public String colour;
    public int yearOfProduction;
    public String country;

    public Car(String brand, String model, double engineCapacity,
               String colour, int yearOfProduction, String country) {
        if(brand==null){
            this.brand = "default";
            }else{
            this.brand = brand;
        }

        if(model==null){
            this.model = "default";
        }else{
            this.model = model;
        }

        if(country==null){
            this.country = "default";
        }else {
            this.country = country;
        }
        if (Double.compare(engineCapacity, 0) == 0) {// сравнение с дабл

            this.engineCapacity = 1.5;
        } else {
            this.engineCapacity = engineCapacity;
        }
        if(colour==null){
            this.colour = "белый";
        }else {
            this.colour = colour;
        }
        if (yearOfProduction == 0) {
            this.yearOfProduction = 2000;
        } else {
            this.yearOfProduction = yearOfProduction;
        }
    }

}
