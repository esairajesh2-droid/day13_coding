class ReverseWord{
    public static void main(String[] args){
        String word="Java is awesome";
        String reversed="";
        String words[]=word.split(" ");
        for(int i=words.length-1;i>=0;i--){
            reversed+=words[i]+" ";
        }
        reversed=reversed.trim();

        for(int j=reversed.length()-1;j>=0;j--){
            System.out.print(reversed.charAt(j));
        }
}
}