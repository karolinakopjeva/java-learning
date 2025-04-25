package lv.acodemy;

public class Variables {
    public static void main(String[] args) {
        System.out.println("Variables Homework");

        // byte data type - whole numbers from -128 to 127
        byte level = 15; // например как уровень игры
        byte speed = 50; // например скорость машины
        byte grade = 10;
        byte temperature = -2; // так как byte это любые значения от - до +, выбрала минусовое значение
        byte batteryLevel = 80; // уровень зарядки телефона
        byte homeNumber = 11;
        byte weight = 55; // вес человека

        // short data type for high numbers from -32,768 to 32,767
        short height = 165;
        short salary = 1500;
        short goodsInStock = 10000; // надеюсь, так можно формулировать переменную ))
        short orders = 190; // например для кол-ва заказов за день
        short employeeId = 4173; // у меня такой айди номер был, когда работала в Эво
        short students = 822; // можно обозначить кол-во учеников в школе, универе и т.д
        short daysInYear = 365;

        // int data type
        int views = 1806; // количество просмотров видео на ютубе
        int likes = 157; // кол-во лайков на том же видео
        int orderId = 189012;
        int residentsInRiga = 633_071; // взяла из википедии, на момент 1.01.2019
        int emailLetters = 7241;
        int productCode = 2539;
        int areaOfLatviaKm = 64589;

        // long data type
        long worldPopulation = 8_062_000_000L;
        long nationalDebtRiga = 18_800_000_000L;
        long fileSize = 190_839_585_037L;
        long distanceToMoon = 384_467_000L;
        long phoneNumber = 371_200_808_68L;
        long iphoneSalesIncome = 64_140_000_000L;
        long earthAreaKm = 510_100_000L;

        // float data type
        float temperatureC = 36.6f;
        float heigthM = 1.65f;
        float fuel = 42.5f;
        float gradeAverage = 8.72f;
        float price = 9.99f;
        float rating = 7.3f;
        float weigthKg = 5.38f; //например вес товара

        // double data type
        double gravity = 9.80665;
        double earthRadius = 6371.0;
        double euroExchangeRateToUsd = 1.1097;
        double fuelPricePerLiter = 1.5432;
        double bankInterestRate = 3.574;

        //boolean type
        boolean isRaining = false;
        boolean isWifiWorking = true;
        boolean isItFriday = false;
        boolean isDogBarking = true;
        boolean isSunShining = true;
        boolean isTvOn = false;
        boolean isUserLoggedIn = true;

        //string
        String thanks = "Thank you for checking my homework<3";
        System.out.println(thanks);
    }
}
