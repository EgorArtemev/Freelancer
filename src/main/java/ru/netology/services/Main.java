import ru.netology.services.FreelanceService;

public class Main {
    public static void main(String[]args){
        FreelanceService service = new FreelanceService();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;

        int monthsOutOfWork = service.calculate(income,expenses,threshold);
        System.out.println("В этом году фрилансер отдохнет " + monthsOutOfWork + " месяцев ");
    }
}
