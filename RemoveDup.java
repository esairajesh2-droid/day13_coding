class RemoveDup{
    public static void main(String[] args) {
        String s="programming";
        boolean[] a=new boolean[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int index=ch-'a';
            if(!a[index]){
                System.out.print(ch);
                a[index]=true;
            }

        }
    }
}