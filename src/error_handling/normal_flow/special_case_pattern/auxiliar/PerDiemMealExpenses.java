package error_handling.normal_flow.special_case_pattern.auxiliar;

public class PerDiemMealExpenses implements MealExpenses{
    private final int PER_DIEM_AMOUNT = 100;

    @Override
    public int getTotal() {
        return PER_DIEM_AMOUNT;
    }
}
