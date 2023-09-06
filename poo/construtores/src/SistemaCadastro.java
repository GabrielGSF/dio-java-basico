public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa marcos = new Pessoa("06724506716", "Marcos Silva");

        System.out.println(marcos.getNome() + "-" + marcos.getCpf());
    }
}
