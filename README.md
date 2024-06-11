## 👦 Integrantes:
Igor Henrique Mori
(1072413641)

Nizio Antônio Martins de Araújo Filho 
(1072413071)

Brandow Bully Coelho Cezimbra
(1072320038)

Bruno Ambrozio 
(1072417985)

## 🛠️ Projeto de Emprestimo de ferramentas 🛠️ 

- Contexto: Criar um programa que rode localmente para efetuar e gerenciar empréstimos de ferramentas.

## 👨‍💻 Funcionalidades Básicas:

`Cadastrar Ferramenta:` Arquivos responsáveis pela funcionalidade são: TelaCadastroFerramenta - Entrada, Ferramentas - Processamento, CadastrarFerramentaDAO - Envio para o banco

`Modificar Registro de Ferramenta:` Arquivos Responsáveis pela funcionalidade: TelaCadastroModificaFerramenta - entrada, Ferramentas - processamento, GerenciarFerramentaDAO - Envio para o banco

`Deletar Ferramenta:` Arquivos Responsáveis pela funcionalidade: TelaDeletarFerramenta - entrada, Ferramentas - processamento, GerenciarFerramentaDAO - Envio para o banco


`Cadastrar Amigos:` Arquivos responsáveis pela funcionalidade são: TelaCadastroAmigo - entrada, Amigos - processamento, CadastroAmigoDAO - Envio para o banco

`Modificar Registro de Amigo:` Arquivos Responsáveis pela funcionalidade: TelaCadastroModificaAmigo - entrada, Amigos - processamento, GerenciarAmigoDAO - Envio para o banco

`Deletar Registro de Amigo:` Arquivos Responsáveis pela funcionalidade: TelaDeletarAmigo - entrada, Amigos - processamento, GerenciarAmigoDAO - Envio para o banco

`Registrar Empréstimos:` Arquivos Responsáveis pela funcionalidade: TelaEmprestar - entrada, Emprestimos - processamento, CadastroEmprestimoDAO - Envio para o banco

`Concluir Empréstimos:` Arquivos Responsáveis pela funcionalidade: TelaConcluir - entrada, Emprestimos - processamento, ConcluirEmprestimoDAO - Envio para o banco

## Exibições

`Histórico de Empréstimos:` Arquivos Responsáveis pela exibição: TelaHistoricoEmprestimos - saída, Empréstimos - processamento, PegarDadosEmprestimos - Busca os dados no BD

`Visualizar ferramentas e gasto total:` Arquivos Responsáveis pela exibição: TelaFerramentas - saída, Ferramentas - processamento, PegarDadosFerramentas - Busca os dados no BD

`Visualizar amigos e amigo com mais empréstimos:` Arquivos Responsáveis pela exibição: TelaAmigos - saída, Amigos - processamento, PegarDadosAmigos - Busca os dados no BD

`Empréstimos de Amigos:` Arquivos Responsáveis pela exibição: TelaVisualizarEmp - saída, histEmp - processamento, PegarDadoshistEmp - Busca os dados no BD

`Empréstimos Ativos:` Arquivos Responsáveis pela exibição: TelaPrincipal - saída, Emprestimos - processamento, PegarDadosEmprestimos - Busca os dados no BD

> O usuário pode acessar todas as funcionalidades a partir da tela `TelaPrincipal.java`

## 📁 Estrutura do Projeto:

- No projeto estamos usando o padrão de arquitetura de software `MVC` onde dividimos o programa em camadas

As pastas estão localizadas em:
- `src/main/java/files`
Onde:
 - `DAO:` Pasta responsável por conter os arquivos de CRUD do banco de dados;
 - `model:` Pasta responsável por conter os arquivos de processamento do programa com gets e sets;
 - `principal:` Pasta que irá conter a classe principal (método main);
 - `view:` Pasta que contém as telas front-end do programa;

## Links Úteis: 

- [`Requisitos`](https://github.com/IgorHenM/A3_Emprestimo_de_Ferramentas/blob/main/Requisitos)
- [`Configurações BD`](https://github.com/IgorHenM/A3_Emprestimo_de_Ferramentas/blob/main/DB_config)


## Observações:

- Quando clonar este repositório, é recomendável adicionar a pasta dele na raiz do Disco C: para que as imagens funcionem
- Lembre-se de alterar as informações de conexão ao banco de dados em a3_programacao/src/main/java/files/DAO.ConexaoDAO.java

  > Projeto Concluido!
