public class TestaBanco {
    public static void main(String[] args) {
        Cliente klayton = new Cliente();
        klayton.nome = "klayton a. souza";
        klayton.cpf = "701.793.904-22";
        klayton.profissao = "estudante";

        Conta contaDoKlayton = new Conta();
        contaDoKlayton.deposita(100);

        contaDoKlayton.titular = klayton;
        System.out.println(contaDoKlayton.titular.nome);

    }
}
