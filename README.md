# Concessionaria_Java
O CDIGO DO PROJETO TRAZ UMA UTILIZAO DE UMA CONCESSIONARIA DE CARROS USADOS ONDE POSSUEM CARROS DO TIPO EXPORTIVO E FAMILIAR, PARA ISSO FOI CRIADO AS CLASSES:
- CARRO
CARRO ESPORTIVO (HERDA DE CARRO)
CARRO FAMILIAR (HERDA DE CARRO)
PARA A DIFERENCIAO AO CADASTRAR UM NOVO VEICULO O SISTEMA PERGUNTA SE O MESMO É DA CLASSE ESPORTIVO, CASO FOR O SISTEMA SOLICITA A ENTRADA DOS DADOS:
POTENCIA DO MOTOR
- ACELERAÇÃO
JA NO CLASSE FAMILIAR ELE PEDE:
QUANTIDADE DE PASSAGEIROS
QUANTIDADE DO PORTA MALAS EM KG

O CDIGO APRESENTA A CLASSE VENDEDOR E COMPRADOR, AS QUAIS TEM ATRIBUTOS SIMPRES COMO NOME E ID DO VENDEDOR OU DO CLIENTE.
TEMBEM FOI CRIADA UMA CLASSE DE VENDA E DE REGISTRO DE VENDAS ONDE NA CLASSE VENDA É REGISTRADA A DATA DA VENDA A QUAL É CAPTURADA PELA DATA DO DIA QUE A VENDA
EST SENDO REGISTRADA NESSAS CLASSES UTILIZO AS BIBLIOTECAS:
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.text.SimpleDateFormat;

NA CLASSE DE REGISTRO DE VENDAS OCORRE TEMBEM UM METODO PARA UM RELATORIO MENSAL DE VENDA ONDE ELE INFORMA A QUANTIDADE DE CARRO VENDIDO EM CADA MES.

E POR FIM TEM A CLASSE MAIN QUE É A CONCESSIONARIA, NELA EST PRESENTE O MENU DE INTERAO COM SUAS RESPECTIVAS FUNCIONALIDADE



ESPLICAO DO MOTIVO DE UTILIAZAR AS BIBLIOTECAS 
O que é um ArrayList:

Um ArrayList é uma estrutura de dados no Java que faz parte da biblioteca de coleções (java.util). Ele é uma implementação da interface List e é usado para
armazenar e gerenciar um grupo de objetos de forma dinâmica. Isso significa que você pode adicionar, remover, acessar e modificar elementos em um ArrayList de
forma flexível, sem a necessidade de especificar um tamanho fixo.

Por que utilizar ArrayList?

A maior vantagem dele em relação ao vetor é o tamanho dele que é dinamico o qual nao precisa ter uma especificação do tamanho por ser mais dinamico, ele consegue
aumentar seu tamanho de forma automatica conforme é adicionado elementos;

Você pode percorrer um ArrayList de forma simples usando um loop for-each ou um loop for tradicional. Isso torna a iteração com os elementos mais legiveis e diminui
a chance de erros visto que o arrylist é dinamico e de facil manuseio

Em um geral o ArrayList me fornece maior flexibilidade, facilidade e redirecionamento automatico sem contar com seus amplos recursos presentes nele

Mas como ele funciona?

import java.util.ArrayList;


public class ExemploArrayList {
   
    public static void main(String[] args) {
        
        // Criar uma lista de tipo String
        ArrayList<String> listaDeNomes = new ArrayList<>();

        // Adiciona elementos
        listaDeNomes.add("Alice");
        listaDeNomes.add("Bob");
        listaDeNomes.add("Charlie");

        // Acessa elementos
        System.out.println("Primeiro nome: " + listaDeNomes.get(0));

        // Remove elementos (No casso ele esta excluindo o indice 1, nesse caso é Bob)
        listaDeNomes.remove(1); 

        //Itera com os elementos
        for (String nome : listaDeNomes) {
            System.out.println(nome);
        }
    }
}


SimpleDateFormat em Java: Formatando e Analisando Datas

Imagine que você está trabalhando em um programa Java e precisa lidar com datas. Uma ferramenta muito útil que você pode usar é o SimpleDateFormat, que faz parte
do pacote java.text. Essa classe ajuda a tornar as datas mais amigáveis para os humanos e permite que você converta facilmente entre datas e strings de data. 
Aqui estão algumas razões porque utilizei:

Formatação de Datas: Com o SimpleDateFormat, você pode pegar uma data e transformá-la em uma string formatada da maneira que desejar. Por exemplo, você pode
transformar "2023-09-13" em "13/09/2023".

Análise de Datas: Também é possível fazer o processo contrário: pegar uma string de data e transformá-la em um objeto de data em Java.

Personalização: Você tem controle total sobre como as datas e horas são apresentadas. Pode escolher o formato, a hora, o fuso horário e muito mais.

Internacionalização: O SimpleDateFormat também funciona bem com diferentes idiomas e formatos de data em todo o mundo.


java.util.Calendar: Lidando com Datas de Forma Flexível

Agora, suponha que você precise de mais recursos avançados para manipular datas em seu projeto Java. É aí que entra o java.util.Calendar, que faz parte do pacote
java.util. Esta classe oferece muitas maneiras flexíveis de trabalhar com datas:

Manipulação de Datas: O Calendar possui uma série de funções para fazer cálculos com datas, como adicionar ou subtrair dias, semanas, meses, anos e muito mais.

Configuração de Campos de Data: Você pode ajustar individualmente campos da data, como dia, mês, ano, hora, minuto e segundo, conforme necessário.

Conversão para Outros Tipos: Além disso, o Calendar é versátil e pode converter datas em diferentes formatos ou tipos, como objetos Date, números longos, strings
e assim por diante.

Internacionalização: Ele também suporta diferentes calendários e idiomas, tornando-o útil em um contexto internacional.


java.util.GregorianCalendar: Precisão e Padrão Internacional

Finalmente, se você está trabalhando em aplicações que precisam de precisão ao lidar com datas e segue o calendário gregoriano padrão amplamente aceito, o 
java.util.GregorianCalendar:

Padrão Internacional: O calendário gregoriano é o padrão globalmente reconhecido, e o GregorianCalendar segue esse padrão.

Precisão Avançada: Ele oferece uma precisão superior ao lidar com datas, levando em consideração regras complexas, como anos bissextos.

Manipulação Avançada de Datas: É especialmente útil quando você precisa realizar cálculos avançados, como calcular a diferença entre duas datas, encontrar uma 
data específica no futuro ou no passado, entre outras tarefas complexas envolvendo datas.

Espero que isso torne mais fácil entender como essas classes podem ajudar em suas tarefas relacionadas a datas em projetos Java!
