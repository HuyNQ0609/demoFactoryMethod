public class Client {
    public static void main(String[] args) {
        Bank bank1 = BankFactory.getBank(BankType.TPBank);
        Bank bank2 = BankFactory.getBank(BankType.VietinBank);
        Bank bank3 = BankFactory.getBank(BankType.AgriBank);
        System.out.println(bank1.getBankName());
        System.out.println(bank2.getBankName());
        System.out.println(bank3.getBankName());
    }
    /**
     *   Khách hàng chỉ cần gọi duy nhất 1 method là BankFactory.getBank() là có thể sử dụng được
     *   dịch vụ của một ngân hàng bất kỳ.
     */
}