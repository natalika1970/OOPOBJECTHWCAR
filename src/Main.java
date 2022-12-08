public class Main {
    public static void main(String[] args) {

        Car granta = new Car("Лада",null,1.7,"Желтый",
                2015,"Россия");
                System.out.println("Автомобиль марка "+granta.brand+ " модель "+granta.model+
                " объем двигателя в литрах "+granta.engineCapacity+
                " цвет "+granta.colour+" год производства "+granta.yearOfProduction+
                " страна производства "+granta.country);

        Car audi = new Car("Audi","A8 50 L TDI quattro",
                3.0,"Черный",2020,null);
                System.out.println("Автомобиль марка "+audi.brand+ " модель "+audi.model+
                " объем двигателя в литрах "+audi.engineCapacity+
                " цвет "+audi.colour+" год производства "+audi.yearOfProduction+
                " страна производства "+audi.country);

        Car BMW = new Car("BMW","Z8",3.0,
                null,2021,"Германия");
                System.out.println("Автомобиль марка "+BMW.brand+ " модель "+BMW.model+
                " объем двигателя в литрах "+BMW.engineCapacity+
                " цвет "+BMW.colour+" год производства "+BMW.yearOfProduction+
                " страна производства "+BMW.country);

        Car Kia = new Car("Kia","Sportage 4-го поколения",
                2.4,"Красный",0,"Южная Корея");
                System.out.println("Автомобиль марка "+Kia.brand+ " модель "+Kia.model+
                " объем двигателя в литрах "+Kia.engineCapacity+
                " цвет "+Kia.colour+" год производства "+Kia.yearOfProduction+
                " страна производства "+Kia.country);

        Car Hyundai = new Car("Hyundai","Avante",
                1.6,"Оранжевый",2016,"Южная Корея");
                System.out.println("Автомобиль марка "+Hyundai.brand+ " модель "+Hyundai.model+
                " объем двигателя в литрах "+Hyundai.engineCapacity+
                " цвет "+Hyundai.colour+" год производства "+Hyundai.yearOfProduction+
                " страна производства "+Hyundai.country);
    }
}