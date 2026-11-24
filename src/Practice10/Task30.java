package Practice10;

public class Task30 {

  abstract static class AbstractCustomer {
    public abstract double getDiscountPercent();
  }

  static class VipCustomer extends AbstractCustomer {
    @Override
    public double getDiscountPercent() {
      return 20;
    }
  }

  static class StudentCustomer extends AbstractCustomer {
    @Override
    public double getDiscountPercent() {
      return 10;
    }
  }

  static class RegularCustomer extends AbstractCustomer {
    @Override
    public double getDiscountPercent() {
      return 0;
    }
  }

  static double calculatePrice(double price, AbstractCustomer customer) {
    return price * (1 - customer.getDiscountPercent() / 100);
  }

  public static void main(String[] args) {
    for (AbstractCustomer c :
        new AbstractCustomer[] {new VipCustomer(), new StudentCustomer(), new RegularCustomer()})
      System.out.println(c.getClass().getSimpleName() + ": " + calculatePrice(1000, c));
  }
}
