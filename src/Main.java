public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService(); // Создание локальная переменной "service" с типом BonusMilesService + создание нового значения типа BonusMilesService
        int price = 10_000; // Стоимость билета в рублях
        int miles = service.calculate(price); // Вычесления бонусных миль
        System.out.println(miles); // Бонусных миль за билет
    }
}