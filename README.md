## Tratamento de Exeções/Erros ⚠️❌

Nessa atividade foi realizado o estudo completo para o tratamento de erros, seus tipos e também as suas prioridades. è observado que existem casos que a exceção é obrigatória pela classe ou função, e outras você deve tomar consciência de criar uma exceção ou um tratamento da mesma. 


### Checked and Uncheked Exceptions 🔐

Essas são os dois tipos de exceções principais, que devem ser levadas em consideração no momento que criar uma função ou classe que podem trazer erros, como digitar um texto no lugar de um inteiro, ou mais específicos como também, validação de email, ceps e entre outros. Esses tipos de exeção são:

- `Checked: `As exceções checked são aquelas que dentro das funções ou classes exigem a necessidade de realizar um tratamento de exceções (try-catch) ou utilizar o ***throws*** na classe com a Exeção requisitada. Caso não feita o tratamento a função seguirá a dar erro, ou seja, o programador é obriga a usar um tratamento

- `Unchecked: `Essas são as mais comuns, são as funções que não obrigam o programador utilizar um tratamento de exceções um throws, eles permitem que o código sejam executados mesmo que isso possa causar um erro, ficando sobre responsabilidade do programador previnir o erro e encontra-lo

> `Conclusão: ` O checked por obrigar o programador a utilizar um tratamento de exceções, a chance de ocorrer um erro diminui, em contra partida acaba se tornando massante. Ja o Unchecked pode ser usado quando a exceção é menos recorrente ou até mesmo simples de ser evitada, como o erro de String pra Número;

### Arquivos 📁📃

The workspace contains two folders by default, where:

- `CepInvalidoException`: Criação de uma exeção de cep para caso o usuario digite um cep menor que 8 digitos

``` java 
public class CepInvalidoException extends Exception {  }
```

- `CepFormatado`: O arquivo Main, onde é realizado a formatação de um cep do usuario, onde é obrigado a utilização do tratamento de exceções, ou seja, um ***Checked***.

``` java 
{FUNÇÃI} throws CepInvalidoException {

    if(Condição) {
        throw new CepInvalidoException;
        // Retorna e obriga o usuario a utilização do try-catch
    }
}
```

- `Execao`: Outro arquivo mais onde mostra um tratamento de exeção específico, o erro de converter String para Numbers, pode ser feitos diversos catch para mais específicos erros ou para um geral usando o **Exception**

``` java 
try {
    ....
} catch (Exception e) {
    System.out.println('Erro :', e);
}

```


> O código acima pode ser utilizado para o tratamento de todos os tipos de erros, mas ainda tem a possibilidade de tratar erros específicos alterando o 'Exception' pela a exceção desejada
