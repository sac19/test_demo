//Destination City solution leetCode using HashMap
class Solution {
    public String destCity(List<List<String>> paths) {
        Map<String,String> m=new HashMap<>();
        for(List<String> r:paths){
            m.put(r.get(0),r.get(1));
        }
        for(String key:m.keySet()){
            String value=m.get(key);
            
            if(!m.containsKey(value))
                return value;
        }
        return null;
    }
}