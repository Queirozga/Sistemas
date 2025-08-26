package model;

public class Cat {
            
    private String name;
    private int age;
    private String gender;
    private int weight;
    private String color;

    public Cat(String name, int age, String gender, int weight, String color) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
        this.color = color;
    }
    
    public Cat(){
        this.name = "";
        this.age = 0;
        this.gender = "";
        this.weight = 0;
        this.color = "";
    }    

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge(){
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getGender() {
        return gender;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
        
    
}
