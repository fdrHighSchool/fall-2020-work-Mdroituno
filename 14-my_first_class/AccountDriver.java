public class AccountDriver {
    public static void main(String[] args) {
        Account account1 = new Account("MKolt");
        account1.changeName("MKoltov");
        account1.addFollowers(45);
        account1.newPosts(1);

        Account account2 = new Account("JDoe");
        account2.changeName("JohnD");
        account2.addFollowers(45);
        account2.newPosts(13);

        Account account3 = new Account("BSmth");
        account3.changeName("BSmith");
        account3.addFollowers(45);
        account3.newPosts(2);

        System.out.println(account1);
        System.out.println(account2);
        System.out.println(account3);

    }
}
