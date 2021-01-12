public class AccountDriver {
    public static void main(String[] args) {
        Account account1 = new Account("MKolt", "00000");
        account1.displayFollowers();
        account1.addFollowers(16);
        account1.displayFollowers();

        Account account2 = new Account("JDoe", "00001");
        account2.changeName("JohnD");
        account2.displayName();

        Account account3 = new Account("BSmith", "00002");
        account3.displayPosts();
        account3.newPost();
        account3.displayPosts();
    }
}
