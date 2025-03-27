import java.util.HashMap;
import java.util.Map;

public class Inventory{
    HashMap<String, Item> data;
    final int capacity;

    public Inventory(int capacity){
        data = new HashMap<>();
        this.capacity = capacity;
    }

    public void addItem(Item item){
        if(data.size() == this.capacity){
            System.out.println("Inventory full!");
            return;
        }
        data.put(item.getName(),item);
    }
    public Item findItem(String key){
        return data.get(key);
    }
    public boolean contains(String key){
        return data.containsKey(key);
    }
    public Item removeItem(String key){
        if(contains(key)){
            Item removed = data.get(key);
            data.remove(key);
            return removed;
        } else {
            return null;
        }
        
    }
    @Override
    public String toString(){
        String toPrint = "";
        for(Map.Entry<String, Item> entry : data.entrySet()){
            toPrint += entry.getKey() + "\n";
        }
        return toPrint;
    }

}