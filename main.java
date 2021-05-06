public class main {

    public static void main(string[] args) {

        Autor autor1 = new Autor("Stephen Hawking", "Reino Unido");

        System.out.println(autor1.nome + autor1.nacionalidade);

        Autor autor2 = new Autor("Stephen Covey", "Estados Unidos");

        System.out.println(autor2.nome + autor2.nacionalidade);

        Aluno aluno = new Aluno("Filype", "0207");

        System.out.println(aluno.nome + aluno.codigo);

        Professor professor = new Professor("Efrain", "0102");

        System.out.println(professor.nome + professor.codigo);

        Livro livro1 = new Livro("O nome do Livro é: " " Uma breve historia do tempo ",autor1);
        Livro1.emprestadoPor = aluno;

        System.out.println(livro1.nome + autor1.nome);
        System.out,println(emprestador Por: "+livro1.emprestadoPor.nome");

        Livro livro2 = new Livro("O nome do livro é: " "os 7 habitos das pessoas altamente eficazes", autor2);

        Livro2.emprestadoPor = professor;

        System.out.println(livro2.nome + autor2.nome);
        System.out.println(emprestado por:"+livro2.emprestadoPor.nome");  

        }
 }