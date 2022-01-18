public class TesteConexao {

    public static void main(String[] args) {

        // So e possivel usar o try com no minimo um catch, ou com um try finally ou com
        // os 3 como no exemplo abaixo, mais nunca somente o try

        try(Conexao conexao = new Conexao()){
            conexao.leDados();
        } catch (IllegalAccessError exeception){
            System.out.println("Deu erro na conexão");
        }
        
        /*
         * Conexao conexao = null;
         * 
         * try {
         * conexao = new Conexao();
         * conexao.leDados();
         * } catch (IllegalStateException exception) {
         * System.out.println("Deu erro na conexão");
         * } finally {
         * System.out.println("finally");
         * if(conexao != null){
         * conexao.close();;
         * }
         * 
         * }
         */

    }

}
