package Homework;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
abstract class Payment {
    private final String id;
    private final String shopName;
    private final double amount;

    public Payment(String id, String shopName, double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Сума має бути > 0");
        this.id = id;
        this.shopName = shopName;
        this.amount = amount;
    }

    public String getId() { return id; }
    public String getShopName() { return shopName; }
    public double getAmount() { return amount; }

    public abstract double calculateFee();

    public double getNetAmount() {
        return amount - calculateFee();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Payment payment)) return false;
        return Objects.equals(id, payment.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

class CardPayment extends Payment {
    public CardPayment(String id, String shopName, double amount) {
        super(id, shopName, amount);
    }

    @Override
    public double calculateFee() {
        return getAmount() * 0.015;
    }
}

class TransferPayment extends Payment {
    public TransferPayment(String id, String shopName, double amount) {
        super(id, shopName, amount);
    }

    @Override
    public double calculateFee() {
        return getAmount() * 0.02 + 20.0;
    }
}

class PaymentProcessor {
    private final ArrayList<Payment> payments = new ArrayList<>();
    private final HashSet<String> blockedShops;
    private final double maxLimit;

    public PaymentProcessor(HashSet<String> blockedShops, double maxLimit) {
        this.blockedShops = new HashSet<>(blockedShops);
        this.maxLimit = maxLimit;
    }

    public void addPayment(Payment p) {
        if (p != null) payments.add(p);
    }

    public HashSet<String> getBlockedShopsCopy() {
        return new HashSet<>(blockedShops);
    }

    public ArrayList<Payment> getPaymentsCopy() {
        return new ArrayList<>(payments);
    }

    public int cleanPayments() {
        int removedCount = 0;
        HashSet<String> seenIds = new HashSet<>();
        Iterator<Payment> it = payments.iterator();

        while (it.hasNext()) {
            Payment p = it.next();
            if (!seenIds.add(p.getId())) {
                System.out.printf("  ❌ [ДУБЛІКАТ]      %s | %s (%.2f грн) — видалено!\n", p.getId(), p.getShopName(), p.getAmount());
                it.remove();
                removedCount++;
            } else if (blockedShops.contains(p.getShopName())) {
                System.out.printf("  ❌ [ЧОРНИЙ СПИСОК] %s | %s (%.2f грн) — видалено!\n", p.getId(), p.getShopName(), p.getAmount());
                it.remove();
                removedCount++;
            } else if (p.getAmount() > maxLimit) {
                System.out.printf("  ❌ [ПОНАД ЛІМІТ]   %s | %s (%.2f грн) — видалено!\n", p.getId(), p.getShopName(), p.getAmount());
                it.remove();
                removedCount++;
            }
        }
        return removedCount;
    }

    public double getTotalGross() {
        double sum = 0;
        for (Payment p : payments) sum += p.getAmount();
        return sum;
    }

    public double getTotalFees() {
        double sum = 0;
        for (Payment p : payments) sum += p.calculateFee();
        return sum;
    }

    public HashSet<String> getApprovedShops() {
        HashSet<String> shops = new HashSet<>();
        for (Payment p : payments) shops.add(p.getShopName());
        return shops;
    }
}

public class Task2PaymentFilterAndAudit {
    public static void main(String[] args) {
        System.out.println("================ 🛡️ БАНКІВСЬКИЙ ПЛАТІЖНИЙ ФІЛЬТР 🛡️ ================");
        HashSet<String> blacklist = new HashSet<>(Arrays.asList("ScamShop", "FakeStore"));
        PaymentProcessor processor = new PaymentProcessor(blacklist, 20000.0);

        processor.addPayment(new CardPayment("P-01", "Rozetka", 4000.0));
        processor.addPayment(new CardPayment("P-01", "Rozetka", 4000.0)); // дублікат
        processor.addPayment(new TransferPayment("P-02", "Comfy", 10000.0));
        processor.addPayment(new CardPayment("P-03", "ScamShop", 5000.0)); // чорний список
        processor.addPayment(new TransferPayment("P-04", "LuxWatch", 25000.0)); // понад ліміт
        processor.addPayment(new CardPayment("P-05", "Rozetka", 2000.0));
        processor.addPayment(new TransferPayment("P-06", "Allo", 5000.0));

        System.out.println("Чорний список магазинів: " + processor.getBlockedShopsCopy());
        System.out.println("Ліміт одного платежу: 20000.00 грн | Вхідних платежів: " + processor.getPaymentsCopy().size());

        System.out.println("\n--- Очищення черги через Iterator.remove() ---");
        int removed = processor.cleanPayments();

        ArrayList<Payment> approved = processor.getPaymentsCopy();
        System.out.println("\n--- Схвалені платежі (залишилось " + approved.size() + ") ---");
        for (Payment p : approved) {
            System.out.printf("  ✅ %s | %-7s | Сума: %8.2f | Комісія: %6.2f | Нетто: %8.2f грн\n",
                    p.getId(), p.getShopName(), p.getAmount(), p.calculateFee(), p.getNetAmount());
        }

        System.out.println("\n--- Фінансовий підсумок ---");
        System.out.println("Видалено платежів: " + removed + " | Схвалено: " + approved.size());
        System.out.printf("Загальна сума (брутто): %.2f грн\n", processor.getTotalGross());
        System.out.printf("Загальна комісія:       %.2f грн\n", processor.getTotalFees());
        System.out.printf("Чиста сума (нетто):     %.2f грн\n", (processor.getTotalGross() - processor.getTotalFees()));
        System.out.println("Унікальні магазини [" + processor.getApprovedShops().size() + "]: " + processor.getApprovedShops());
        System.out.println("====================================================================");
    }
}