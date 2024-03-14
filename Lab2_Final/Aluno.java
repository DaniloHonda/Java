public class Aluno
{
    // Variaveis da classe aluno
    private String nome;
    private int idade;
    private String cpf;
    private double notaFinal;

    // Get e setter para nome
    public String getNome()
    {
        return nome;
    }


    public boolean setNome(String nome)
    {
        if (nome != null && !nome.isEmpty())
        {
            this.nome = nome;
            return true;
        }
        else
        {
            System.out.println("O nome do aluno não pode ser uma string vazia ou nula.");
            return false;
        }
    }

    // Get e setter para idade
    public int getIdade()
    {
        return idade;
    }

    public boolean setIdade(int idade)
    {
        if (idade>5 && idade<100)
        {
            this.idade = idade;
            return true;
        }
        else
        {
            System.out.println("A idade do aluno não pode ser menor que 6 nem acima do numero 120.");
            return false;
        }
    }

    // Get e setter para cpf
    public String getCpf()
    {
        return cpf;
    }

    // Metodo para verificar CPF
    public boolean setCpf(String cpf)
    {
        // Verifica se nao ha nenhum carater nao numerico
        if (!cpf.equals(cpf.replaceAll("\\D", "")))
        {
            System.out.println("CPF invalido.");
            return false;
        }
        // Verifica se o CPF tem 11 digitos
        if (cpf.length() != 11)
        {
            System.out.println("CPF invalido.");
            return false;
        }
        // Verifica se todos os digitos sao iguais
        if (cpf.matches("(\\d)\\1*"))
        {
            System.out.println("CPF invalido.");
            return false;
        }
        // Calcula e verifica os digitos verificadores
        int soma = 0;
        int resto;
        for (int i = 0; i < 9; i++)
        {
            soma += Integer.parseInt(cpf.substring(i, i + 1)) * (10 - i);
        }
        resto = 11 - soma % 11;
        if (resto == 10 || resto == 11)
        {
            resto = 0;
        }
        if (resto != Integer.parseInt(cpf.substring(9, 10)))
        {
            System.out.println("CPF invalido.");
            return false;
        }

        soma = 0;
        for (int i = 0; i < 10; i++)
        {
            soma += Integer.parseInt(cpf.substring(i, i + 1)) * (11 - i);
        }
        resto = 11 - soma % 11;
        if (resto == 10 || resto == 11)
        {
            resto = 0;
        }
        if (resto != Integer.parseInt(cpf.substring(10, 11))) {
            System.out.println("CPF invalido.");
            return false;
        }

        // Se passou por tudo, CPF = valido
        this.cpf = cpf;
        return true;
    }

    // Get e setter para notaFinal
    public double getNotaFinal()
    {
        return notaFinal;
    }

    public String getEstado()
    {
        return  setEstado(notaFinal);
    }

    public String setEstado(double notaFinal)
    {
        if (notaFinal >= 5 && notaFinal< 6)
        {
            return "Recuperação";
        }
        else if (notaFinal >= 6)
        {
            return "Aprovado";
        }
        else
        {
            return "Reprovado";
        }
    }

    public boolean setNotaFinal(double notaFinal)
    {
        if (notaFinal>=0 && notaFinal<=10)
        {
            this.notaFinal = notaFinal;
            return true;
        }
        else
        {
            System.out.println("Nota final precisa ser um numero entre 0 e 10");
            return false;
        }
    }
}
