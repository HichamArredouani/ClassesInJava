public class Cat {
    private String name;

    public Cat(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void eat (){
        System.out.println(name + "is eating");
    }
    public void purr (){
        System.out.println(name + "is purring");
    }

}
