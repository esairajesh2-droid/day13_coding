class Longest{
    public static void main(String[] args) {
        String word="Java programming is amazing";
         String[] words=word.split("\\s+");
         String longest="Java";
         for(int i=0;i<words.length;i++){
            if(words[i].length()>longest.length()){
                longest=words[i];
            }
         }
         System.out.println(longest);
    }
}