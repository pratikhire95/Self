package Ms1_Day4;


class HandleException extends Exception{

    HandleException(){};
    HandleException(String str){
        super(str);
    }
    public static void main(String[] args)throws Exception {
        int[] id = {101, 102, 103, 104, 105};
        String[] name2 = {"Ashish", "Jigar", "Pratik"};

        try{
            for (int i = 0; i < id.length; i++) {
                if(id[i] < 103){
                    HandleException e = new HandleException("WHy is it");
                    throw e;
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }

        
        
    }
}
