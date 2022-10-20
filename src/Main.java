public class Main {
    public static void main(String[] args) {

        Car granta = new Car();
        granta.brand = "Лада";
        granta.model = "Гранта";
        granta.engineCapacity = 1.7;
        granta.colour = "Желтый";
        granta.yearOfProduction = 2015;
        granta.country = "Россия";
        System.out.println("Автомобиль марка "+granta.brand+ " модель "+granta.model+
                " объем двигателя в литрах "+granta.engineCapacity+
                " цвет "+granta.colour+" год производства "+granta.yearOfProduction+
                " страна производства "+granta.country);

        Car audi = new Car();
        audi.brand = "Audi";
        audi.model = "A8 50 L TDI quattro";
        audi.engineCapacity = 3.0;
        audi.colour = "Черный";
        audi.yearOfProduction = 2020;
        audi.country = "Германия";
        System.out.println("Автомобиль марка "+audi.brand+ " модель "+audi.model+
                " объем двигателя в литрах "+audi.engineCapacity+
                " цвет "+audi.colour+" год производства "+audi.yearOfProduction+
                " страна производства "+audi.country);

        Car BMW = new Car();
        BMW.brand = "BMW";
        BMW.model = "Z8";
        BMW.engineCapacity = 3.0;
        BMW.colour = "Черный";
        BMW.yearOfProduction = 2021;
        BMW.country = "Германия";
        System.out.println("Автомобиль марка "+BMW.brand+ " модель "+BMW.model+
                " объем двигателя в литрах "+BMW.engineCapacity+
                " цвет "+BMW.colour+" год производства "+BMW.yearOfProduction+
                " страна производства "+BMW.country);

        Car Kia = new Car();
        Kia.brand = "Kia";
        Kia.model = "Sportage 4-го поколения";
        Kia.engineCapacity = 2.4;
        Kia.colour = "Красный";
        Kia.yearOfProduction = 2018;
        Kia.country = "Южная Корея";
        System.out.println("Автомобиль марка "+Kia.brand+ " модель "+Kia.model+
                " объем двигателя в литрах "+Kia.engineCapacity+
                " цвет "+Kia.colour+" год производства "+Kia.yearOfProduction+
                " страна производства "+Kia.country);

        Car Hyundai = new Car();
        Hyundai.brand = "Hyundai";
        Hyundai.model = "Avante";
        Hyundai.engineCapacity = 1.6;
        Hyundai.colour = "Оранжевый";
        Hyundai.yearOfProduction = 2016;
        Hyundai.country = "Южная Корея";
        System.out.println("Автомобиль марка "+Hyundai.brand+ " модель "+Hyundai.model+
                " объем двигателя в литрах "+Hyundai.engineCapacity+
                " цвет "+Hyundai.colour+" год производства "+Hyundai.yearOfProduction+
                " страна производства "+Hyundai.country);
    }
}