public class BankFactory {
    private BankFactory() {
    }

    public static Bank getBank(BankType bankType) {
        return switch (bankType) {
                    case TPBank -> new TPBank();
                    case VietinBank -> new VietinBank();
                    case AgriBank -> new AgriBank();
                    default -> throw new IllegalArgumentException("This bank type is unsupported");
        };
    }
}
