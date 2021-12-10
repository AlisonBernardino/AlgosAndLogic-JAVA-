package baseCourse.exercises.module03;

public abstract class l05AMeal {
    protected float totalPreparationTime;
    protected float mealPrice;
    protected float totalDeliveryTime;
    protected float orderDistance;
    protected float totalOrderPrice;

    public abstract void setTotalPreparationTime();
    public abstract void calculateTotalOrderPrice();
    public abstract void calculateDeliveryTime();
}
