package List;

public class Heroing implements Comparable<Heroing>{
	public String name;
    public float hp;
    public int damage;
    public Heroing() {
  
    }
    public Heroing(String name) {
        this.name = name;
    }
    public String toString() {
        return "Hero [name=" + name + ", hp=" + hp + ", damage=" + damage + "]\r\n";
    }
    public Heroing(String name, int hp, int damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }
    @Override
    public int compareTo(Heroing anotherHero) {
        if(damage<anotherHero.damage)
            return 1; 
        else
            return -1;
    }

}
