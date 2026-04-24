class MyHashSet {

    //initialising the prinary list which will contain LL
    private final int size=1000;
    private List<Integer>[] primaryList;

    public MyHashSet() {

        primaryList= new LinkedList[size];
        //initialising the child LinkedList
        for(int i=0; i<size; i++){
            primaryList[i]= new LinkedList<>();
        }
    }
    
    //returning hashkey value to point integers against a key
    public int hash(int key){
        return key%size;
    }

    public void add(int key) {

        int index =  hash(key);
        if(!primaryList[index].contains(key)){
            primaryList[index].add(key);
        }
        
    }
    
    public void remove(int key) {

        int index =  hash(key);
        primaryList[index].remove(Integer.valueOf(key));
    }
    
    public boolean contains(int key) {
        
        int index =  hash(key);
        return primaryList[index].contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */