class MyCalendar {
    TreeMap<Integer, Integer> map;
    public MyCalendar() {
        map = new TreeMap<>();
    }
    
    public boolean book(int a, int b) {
        Integer key = map.lowerKey(b); // Use Integer (not int) to allow null
        if (key != null && map.get(key) > a) return false; 
        map.put(a, b);
        return true;
  }

}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(startTime,endTime);
 */