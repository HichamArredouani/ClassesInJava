public class Person {

    private String name;
    private String nickname;
    private int age;
    public static int population = 0;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        population++;
    }

    public static int getPopulation() {
        return population;
    }

    public String getName() {
        return name;
    }

    public String getNickname() {
        return nickname;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setName(String name, String nickname) {
        this.name = name + " " + nickname;
    }

    public void setAge(int age) {
        this.age = age;
    }

}



