public class Main {
    public static void main(String[] args) {
        /*
        Livro livro = new Livro();
        livro.nome = "fundamentos java";
        livro.anoPublicacao = 2014;
        livro.categoria = "teóricos";
        livro.editora = "o'reilly";

        Cliente cliente = new Cliente();
        cliente.nome = "milena";
        cliente.telContato = "+1 203 403 506";
        cliente.email = "milena@gmail.com";
        */

        Emprestimo emprestimo = new Emprestimo();
        emprestimo.livro.nome = "fundamentos java";
        emprestimo.livro.editora = "o'reilly";
        emprestimo.livro.categoria = "TI - TEÓRICOS";
        emprestimo.cliente.nome = "milena";
        emprestimo.cliente.telContato = "+1 203 403 506";
        emprestimo.cliente.email = "milena@gmail.com";

        Pedido pedido = new Pedido();
        pedido.cliente.nome = "thiago";
        pedido.cliente.telContato = "+1 203 403 506";
        pedido.cliente.email = "thiago@gmail.com";
        pedido.prato.nome = "hamburguer";
        pedido.horaRegistro = "19h00";
    }
}