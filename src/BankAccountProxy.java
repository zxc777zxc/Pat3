class BankAccountProxy implements BankAccount {
    private RealBankAccount realAccount;
    private String accountHolder;

    public BankAccountProxy(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    @Override
    public void accessAccount() {
        if (authenticate()) {
            if (realAccount == null) {
                realAccount = new RealBankAccount(accountHolder);
            }
            realAccount.accessAccount();
        } else {
            System.out.println("Access denied for: " + accountHolder);
        }
    }

    private boolean authenticate() {
        return "authorizedUser".equals(accountHolder);
    }
}
