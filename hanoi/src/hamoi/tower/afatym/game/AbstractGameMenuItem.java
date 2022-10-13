package hamoi.tower.afatym.game;

 abstract class AbstractGameMenuItem {
    private String id;


    private String name;


    protected AbstractGameMenuItem(String id, String name){
        this.name = name;
        this.id = id;
    }

    protected String getId(){
        return this.id;
    }

    protected String getName() {
        return name;
    }

    protected void display(){
        System.out.println(id+") "+name);
    }

    protected abstract void doItem();
}

