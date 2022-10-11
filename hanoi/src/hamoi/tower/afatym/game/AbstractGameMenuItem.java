package hamoi.tower.afatym.game;

public abstract class AbstractGameMenuItem {
    private String id;


    private String name;


    public AbstractGameMenuItem(String id, String name){
        this.name = name;
        this.id = id;
    }

    public String getId(){
        return this.id;
    }

    public String getName() {
        return name;
    }

    protected void display(){
        System.out.println(id+") "+name);
    }

    protected abstract void doItem();
}

