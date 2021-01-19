public class Account {
    // instance variables
    private String name;
    private int followers;
    private int posts;
    
    //constructor
    public Account(String n){
        this.name = n;
        this.followers = 0;
        this.posts = 0;
    }//end constructor method

    public String getName(){
        return this.name;
    }//end getName

    public int getFollowers(){
        return this.followers;
    }//end getFollowers

    public void changeName(String name){
        this.name = name;
    }//end changeName

    public void addFollowers(int max){
        this.followers += (int) (Math.random() * max + 1);
    }//end addFollowers
    
    public void newPosts(int i){
        this.posts += i;
    }//end newPost

    public String toString(){
        return "Name: " + this.name + ", Followers: " + this.followers + ", Posts: " + this.posts;
    }

}
