# Atividade_POO_Final_Samuel
 Atividade final de Programação Orientada a Objetos em Java.
# Aplicativo de Manipulação de Dados de Pessoa

Este é um aplicativo em Java para manipular os dados de uma pessoa e persisti-los em um banco de dados MySQL.

## Pré-requisitos

- Java Development Kit (JDK) 8 ou superior instalado
- MySQL Server instalado e em execução
- IDE (como o IntelliJ IDEA ou Eclipse) instalada
- Conexão com a internet para baixar dependências (se necessário)

## Configuração do Projeto

1. Clone o repositório para o seu computador ou faça o download do código-fonte.

2. Abra a sua IDE e importe o projeto.

3. Certifique-se de que o driver JDBC do MySQL está configurado no projeto. Se não estiver configurado, siga as instruções no arquivo "Adicionando o Driver JDBC" abaixo.

## Adicionando o Driver JDBC

1. Faça o download do driver JDBC do MySQL.

2. Abra o projeto na sua IDE.

3. Adicione o arquivo JAR do driver JDBC ao classpath do projeto. Para fazer isso no IntelliJ IDEA, siga estas etapas:

   - Clique com o botão direito no nome do projeto no painel de navegação esquerdo e selecione "Open Module Settings" (Configurações do Módulo).
   - Na janela "Project Structure" (Estrutura do Projeto), selecione o módulo do projeto no painel esquerdo.
   - Na guia "Dependencies" (Dependências), clique no botão "+" no canto superior direito e selecione "JARs or directories" (Arquivos JAR ou diretórios).
   - Navegue até o local onde você baixou o arquivo JAR do driver JDBC e selecione-o.
   - Clique em "OK" para adicionar o driver JDBC ao projeto.

## Configuração do Banco de Dados

1. Certifique-se de que o MySQL Server está instalado e em execução no seu computador.

2. Crie um banco de dados vazio no MySQL Server para ser usado pelo aplicativo.

## Configuração da Conexão com o Banco de Dados

1. Abra o arquivo "PessoaDAO.java" no pacote "src" do projeto.

2. No início da classe, altere as constantes `URL`, `USUARIO` e `SENHA` com as informações corretas do seu banco de dados.

## Executando o Aplicativo

1. Na sua IDE, execute a classe `GerenciadorPessoas` para iniciar o aplicativo.

2. Siga as instruções exibidas no console ou nas caixas de diálogo para criar, atualizar, listar e deletar pessoas.


