public abstract class Item {
    private String name;
    private String type;
    private int id;
    private String stat;
    private int value;
    
    protected Item(String name, String type, int id, String stat, int value){
        this.name = name;
        this.type = type;
        this.id = id;
        this.stat = stat;
        this.value = value;
    }
    public String getName(){
        return this.name;
    }
    public String getType(){
        return this.type;
    }
    public int getId(){
        return this.id;
    }
    public String getStat(){
        return this.stat;
    }
    public int getValue(){
        return this.value;
    }

}
