class MyHashMap {

    //created Map Objects for key-value pair
    private class Entity{
        
        int key;
        int value;

        public Entity(int key, int value){
            this.key=key;
            this.value=value;
        }
    }


    private final int size=1000;
    private LinkedList<Entity>[] primaryList;

    public MyHashMap() {

        primaryList=new LinkedList[size];
        for(int i=0;i<size;i++){
            primaryList[i]=new LinkedList<>();
        }
        
    }

    public int hash(int key){
        return key%size;
    }
    
    public void put(int key, int value) {

        int index=hash(key);
        //trying update existing Map
        for(Entity entity: primaryList[index]){

            if(entity.key==key){
                entity.value=value;
                //getting out of the method after updating value
                //incase if key already exists
                return;
            }
        }
        //creating new pair if key does not exist already
        primaryList[index].add(new Entity(key,value));
    }
    
    public int get(int key) {
        
        int index=hash(key);

        //fetching the value againt given key
        for(Entity entity: primaryList[index]){

            if(entity.key==key){
                return entity.value;
            }
        }
        //if key does not exist
        return -1;
    }
    
    public void remove(int key) {

        int index=hash(key);
        Entity target=null;

        //fetching the pair
        for(Entity entity: primaryList[index]){

            if(entity.key==key){
                target=entity;
            }
        }
        
        //removing whole pair through index
        if(target!=null){
            primaryList[index].remove(target);
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */