class LRUCache extends LinkedHashMap<Integer,Integer> {
    private final int capacity;

    public LRUCache(int capacity) {// inititalize the capacity of cache mem
        super(capacity,0.75f,true);
        this.capacity=capacity;
    }
    
    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer,Integer>eldest){
        return size()>capacity;
    }
        
        
    public int get(int key) {//returns the value of key if exists otherwise -1
        return super.getOrDefault(key,-1);
        
    }
    
    public void put(int key, int value) {//if key eixist update it otherwise remove the least recently used key value pair
        super.put(key,value);
        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */