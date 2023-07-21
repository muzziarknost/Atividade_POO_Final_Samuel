# Atividade_POO_Final_Samuel
 Atividade final de Programação Orientada a Objetos em Java.
# Aplicativo de Gerenciamento de Usuários

Este é um aplicativo Java simples para gerenciamento de usuários, onde você pode criar, atualizar, listar e deletar informações de usuários. Os dados são armazenados em um banco de dados MySQL.

## Requisitos

Para executar o aplicativo, você precisará das seguintes ferramentas instaladas em seu computador:

1. **Java Development Kit (JDK)**: É necessário ter o JDK instalado para compilar e executar o código Java. Você pode baixar o JDK no site oficial da Oracle ou usar uma distribuição OpenJDK.
   - Link para download: [Java SE Development Kit](https://www.oracle.com/java/technologies/javase-jdk16-downloads.html)

2. **MySQL Database**: O aplicativo utiliza um banco de dados MySQL para persistir os dados dos usuários. Certifique-se de ter o MySQL Server instalado em seu computador ou tenha acesso a um servidor MySQL remoto.
   - Link para download: [MySQL Community Server](https://dev.mysql.com/downloads/mysql/)

3. **MySQL Workbench**: O MySQL Workbench é uma ferramenta gráfica para gerenciamento e administração de bancos de dados MySQL. É útil para criar bancos de dados, tabelas e executar consultas SQL.
   - Link para download: [MySQL Workbench](https://dev.mysql.com/downloads/workbench/)

4. **IDE (Ambiente de Desenvolvimento Integrado)**: Você pode escolher uma IDE de sua preferência para desenvolver o projeto. Duas IDEs populares são:
   - Eclipse IDE: Uma IDE de código aberto muito usada para desenvolvimento Java.
     - Link para download: [Eclipse IDE](https://www.eclipse.org/downloads/)
   - IntelliJ IDEA: Uma poderosa IDE desenvolvida pela JetBrains com uma versão gratuita da comunidade disponível.
     - Link para download: [IntelliJ IDEA Community](https://www.jetbrains.com/idea/download/)

## Como executar o aplicativo

1. Faça o download e instale o Java Development Kit (JDK) apropriado para o seu sistema operacional.

2. Instale o MySQL Community Server e siga as instruções para configurar um usuário e senha para acesso ao banco de dados.

3. Faça o download e instale o MySQL Workbench para criar o banco de dados necessário para o aplicativo.

4. Clone este repositório em seu computador ou baixe-o como arquivo ZIP e descompacte-o.

5. Abra o MySQL Workbench e conecte-se ao seu servidor MySQL.

6. No MySQL Workbench, crie um novo banco de dados chamado `gerenciamento_usuarios`.

7. Abra a IDE de sua escolha (por exemplo, Eclipse ou IntelliJ IDEA) e importe o projeto Java para criar o aplicativo.

8. Certifique-se de que o driver JDBC para o MySQL esteja presente na biblioteca do projeto. Caso contrário, faça o download do driver JDBC do site oficial do MySQL e adicione-o à biblioteca do projeto.

9. Localize o arquivo `src/BancoDados.java` e atualize as informações de conexão para o seu banco de dados (URL, usuário e senha).

10. Execute o aplicativo Java e a interface do aplicativo de gerenciamento de usuários será exibida.

Agora você pode usar a interface para criar, atualizar, listar e deletar informações de usuários. Os dados serão persistidos no banco de dados MySQL configurado.
