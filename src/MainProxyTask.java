public class MainProxyTask {
    public static void main(String[] args) {
        BankAccount authorizedAccount = new BankAccountProxy("authorizedUser");
        authorizedAccount.accessAccount();  // Доступ разрешен

        BankAccount unauthorizedAccount = new BankAccountProxy("unauthorizedUser");
        unauthorizedAccount.accessAccount();  // Доступ запрещен
    }
}
