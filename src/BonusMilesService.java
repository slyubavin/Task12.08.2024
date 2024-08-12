public class BonusMilesService {
    public int calculate(int price)/* Создание метода "calculate" и добавление параметра "price" (Стоимость билета в рублях) */ {
        int priceBonusMiles = 20; // Цена в рублях за 1 бонусную милю
        int BonusMiles = price / priceBonusMiles; // Бонусных миль за билет
        return BonusMiles;
    }
}
