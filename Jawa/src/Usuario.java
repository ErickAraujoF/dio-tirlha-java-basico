public class Usuario {
    public static void main(String[] args) throws Exception {
       SmartTv smartTv = new SmartTv();
       System.out.println("A tv esta ligada? " +smartTv.ligada);
       System.out.println("Canal atual: " +smartTv.canal);
       System.out.println("Volume atual: " +smartTv.volume);
    }
}
