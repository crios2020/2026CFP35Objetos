public class GeneradorDeExceptions {
    
    public static void generar(){
        int[] vector=new int[10];
        vector[20]=5;
    }

    public static void generar(boolean x){
        if(x) System.out.println(10/0);
    }

    public static void generar(String nro){         //"26x"
        int n=Integer.parseInt(nro);
    }

    public static void generar(String texto, int index){        //null,2
        if(texto==null || index<0 || index>=texto.length()) return;
        System.out.println(texto.charAt(index));
    }

}
