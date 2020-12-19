public class test {
    public static void main(String[] args){
        try{String str = null;
            System.out.println(str.length());
        }catch(NullPointerException e){
            System.out.println("以下のようなエラーが出ました");
            System.out.println(e.getMessage());
        }

    }
}
