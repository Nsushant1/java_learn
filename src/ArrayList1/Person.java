package ArrayList1;

public class Person {
    private String name;
    private int id;

    Person (String name, int id){
        this.name=name;
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
}
