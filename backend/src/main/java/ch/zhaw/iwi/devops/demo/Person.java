package ch.zhaw.iwi.devops.demo;

public class Person {

    private int id;
    private String title;
    private String description;

    public Person() {
    }
    
    public Person(int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public int getId() {
        return id;
    }    

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
    
}
