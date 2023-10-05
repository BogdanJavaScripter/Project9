
package hobbyclasses;

    class Swimmer {
    // Private properties
    private String name;
    private int age;
    private String favoriteType;
    private int totalDistanceSwum;


    public Swimmer(String name, int age, String favoriteType, int totalDistanceSwum) {
        this.name = name;
        this.age = age;
        this.favoriteType = favoriteType;
        this.totalDistanceSwum = totalDistanceSwum;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public String getFavoriteType() {
        return favoriteType;
    }


    public void setFavoriteType(String favoriteType) {
        this.favoriteType = favoriteType;
    }


    public int getTotalDistanceSwum() {
        return totalDistanceSwum;
    }


    public void setTotalDistanceSwum(int totalDistanceSwum) {
        this.totalDistanceSwum = totalDistanceSwum;
    }


    public double calculateSpeed() {
        return totalDistanceSwum / 2.0;
    }



    public void printDescription() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Favorite Type: " + favoriteType);
        System.out.println("Total Distance Swum: " + totalDistanceSwum + " meters");
        System.out.println("Swimming Speed: " + calculateSpeed() + " meters per minute");
    }

}









