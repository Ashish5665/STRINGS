package index;

public class getbytes {
    public static void main(String[] args) {
        String s1 = "ABCDEFG";
        byte[] barr = s1.getBytes();
        for(int i=0;i<barr.length;i++){
            System.out.println(barr[i]);
        }
        String s2 = new String(barr);
        System.out.println(s2);
    }
}
//Katta Ashish kumar
//210303126123
//19th division