public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "M"; //B / T

        if (plano == "B") {
            System.out.println("100 minutos de ligação");
        } else if (plano == "M") {
            System.out.println("WhatsApp e Instagram grátis");
            System.out.println("100 minutos de ligação");
        } else if (plano == "T") {
            System.out.println("WhatsApp e Instagram grátis");
            System.out.println("100 minutos de ligação");
            System.out.println("5Gb YouTube");
        }
    }
}
