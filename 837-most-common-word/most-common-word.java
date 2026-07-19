class Solution {
    public String mostCommonWord(String ph, String[] banned) {
       ph=ph.toLowerCase().replaceAll("[!?',;.]"," ");
       Set<String> ban=new HashSet<>();
       for(String str:banned){
        ban.add(str);
       }

       HashMap<String,Integer> map=new HashMap<>();
       String ans="";
       int max=0;
       for(String str:ph.split("\\s+")){
            if(ban.contains(str) || str.length()==0) continue;
            map.put(str,map.getOrDefault(str,0)+1);
            if(map.get(str)>max){
                ans=str;
                max=map.get(str);
            }
       }
       return ans;
    }
}