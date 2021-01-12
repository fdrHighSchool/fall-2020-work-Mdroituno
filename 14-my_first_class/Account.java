public class Account {
    // instance variables
    private String name;
    private String id;
    private int followers;
    private int posts;
    
    //constructor
    public Account(String n, String i){
        this.name = n;
        this.id = i;
        this.followers = 0;
        this.posts = 0;
    }//end constructor method

    public String getName(){
        return this.name;
    }//end getName

    public String getID(){
        return this.id;
    }//end getID

    public int getFollowers(){
        return this.followers;
    }//end getFollowers

    public void changeName(String name){
        this.name = name;
    }//end changeName

    public void addFollowers(int amount){
        this.followers += amount;
    }//end addFollowers
    
    public void newPost(){
        this.posts++;
    }//end newPost

    public void displayName(){
        System.out.println("Name: " + this.name);
    }//end displayName

    public void displayFollowers(){
        System.out.println("Followers: " + this.followers);
    }//end displayFollowers

    public void displayPosts(){
        System.out.println("Posts: " + this.posts);
    }//end displayPosts

}
