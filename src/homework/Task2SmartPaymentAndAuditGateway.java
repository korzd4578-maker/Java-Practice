package Homework;


interface CashbackCapable {
    double MAX_CASHBACK_UAH = 500.0;
    double getCashbackRate();
    default double calculateCashback(double baseAmount) {
        return Math.min(MAX_CASHBACK_UAH, baseAmount * getCashbackRate());
    }
}

interface Refundable {
    boolean requestRefund(String reason);
    boolean isRefunded();
}

interface BlockchainVerifiable {
    String getTxHash();
    int getConfirmations();
    default boolean isFinalized() {
        return getConfirmations() >= 12;
    }
}

abstract class AbstractPaymentTransaction {
    private final String txId;
    private final double baseAmountUah;
    private boolean processed = false;

    public AbstractPaymentTransaction(String txId, double baseAmountUah) {
        this.txId = txId;
        this.baseAmountUah = baseAmountUah;
    }

    public String getTxId() { return txId; }
    public double getBaseAmountUah() { return baseAmountUah; }
    public boolean isProcessed() { return processed; }

    public abstract double calculateFee();
    public abstract String getPaymentChannel();

    public final boolean process() {
        if (baseAmountUah <= 0 || processed) return false;
        processed = true;
        return true;
    }

    public final double getTotalCharged() {
        return baseAmountUah + calculateFee();
    }
}

class PremiumCardPayment extends AbstractPaymentTransaction implements CashbackCapable, Refundable {
    private final String maskedPan;
    private final double cashbackRate;
    private boolean refunded = false;

    public PremiumCardPayment(String txId, double amount, String maskedPan, double cashbackRate) {
        super(txId, amount);
        this.maskedPan = maskedPan;
        this.cashbackRate = cashbackRate;
    }

    @Override
    public double calculateFee() { return getBaseAmountUah() * 0.01; }

    @Override
    public String getPaymentChannel() { return "Visa Infinite"; }

    @Override
    public double getCashbackRate() { return cashbackRate; }

    @Override
    public boolean requestRefund(String reason) {
        if (isProcessed() && !refunded) {
            refunded = true;
            return true;
        }
        return false;
    }

    @Override
    public boolean isRefunded() { return refunded; }
}

class CryptoUsdtPayment extends AbstractPaymentTransaction implements CashbackCapable, BlockchainVerifiable {
    private final String txHash;
    private final int confirmations;

    public CryptoUsdtPayment(String txId, double amount, String txHash, int confirmations) {
        super(txId, amount);
        this.txHash = txHash;
        this.confirmations = confirmations;
    }

    @Override
    public double calculateFee() { return 40.0; }

    @Override
    public String getPaymentChannel() { return "USDT TRC-20"; }

    @Override
    public double getCashbackRate() { return 0.01; }

    @Override
    public String getTxHash() { return txHash; }

    @Override
    public int getConfirmations() { return confirmations; }
}

final class TaxTreasuryPayment extends AbstractPaymentTransaction implements Refundable {
    private final String taxCode;
    private boolean refunded = false;

    public TaxTreasuryPayment(String txId, double amount, String taxCode) {
        super(txId, amount);
        this.taxCode = taxCode;
    }

    @Override
    public double calculateFee() { return 0.0; }

    @Override
    public String getPaymentChannel() { return "ДержКазначейство"; }

    @Override
    public boolean requestRefund(String reason) {
        if (isProcessed() && !refunded) {
            refunded = true;
            return true;
        }
        return false;
    }

    @Override
    public boolean isRefunded() { return refunded; }
}

public class Task2SmartPaymentAndAuditGateway {
    public static void main(String[] args) {
        System.out.println("================ ПРОЦЕСИНГОВИЙ ЦЕНТР FINTECH (POLYMORPHISM & INTERFACES) ================");
        AbstractPaymentTransaction[] ledger = {
                new PremiumCardPayment("TX-101", 20000.0, "4149****1111", 0.03),
                new CryptoUsdtPayment("TX-102", 8500.0, "0x9f8a...c4", 18),
                new TaxTreasuryPayment("TX-103", 5000.0, "11010100")
        };

        double totalTurnover = 0;
        double totalFees = 0;
        double totalCashback = 0;

        System.out.println("[1. ПРОВЕДЕННЯ ПАКЕТУ ТРАНЗАКЦІЙ (final process())]:");
        for (AbstractPaymentTransaction tx : ledger) {
            if (tx.process()) {
                totalTurnover += tx.getBaseAmountUah();
                totalFees += tx.calculateFee();
                System.out.printf("  ✅ [%s | %-16s] Сума: %8.2f грн | Комісія: %6.2f грн | Всього: %8.2f грн\n",
                        tx.getTxId(), tx.getPaymentChannel(), tx.getBaseAmountUah(), tx.calculateFee(), tx.getTotalCharged());
            }
        }

        System.out.println("\n[2. АВТОМАТИЧНИЙ АУДИТ МОЖЛИВОСТЕЙ (Pattern Matching instanceof)]:");
        boolean firstRefundDone = false;
        for (AbstractPaymentTransaction tx : ledger) {
            if (tx instanceof CashbackCapable cb) {
                double earned = cb.calculateCashback(tx.getBaseAmountUah());
                totalCashback += earned;
                System.out.printf("  💰 [CashbackCapable] %s: нараховано %.2f грн\n", tx.getTxId(), earned);
            }
            if (tx instanceof BlockchainVerifiable bv) {
                System.out.printf("  ⛓️ [BlockchainVerifiable] %s: Hash=%s, Підтверджень=%d (Finalized: %b)\n",
                        tx.getTxId(), bv.getTxHash(), bv.getConfirmations(), bv.isFinalized());
            }
            if (tx instanceof Refundable ref && !firstRefundDone) {
                boolean ok = ref.requestRefund("Подвійне списання");
                System.out.printf("  🔄 [Refundable] Спроба повернення %s ('Подвійне списання'): %s\n",
                        tx.getTxId(), ok ? "УСПІШНО ПОВЕРНЕНО!" : "ВІДМОВА");
                firstRefundDone = true;
            }
        }

        System.out.println("\n[ПІДСУМКОВИЙ ЗВІТ ШЛЮЗУ]:");
        System.out.printf("  Сумарний базовий оборот:  %.2f грн\n", totalTurnover);
        System.out.printf("  Сумарна комісія шлюзу:      %.2f грн\n", totalFees);
        System.out.printf("  Сумарний виплачений кешбек: %.2f грн\n", totalCashback);
        System.out.println("=========================================================================================");
    }
}
