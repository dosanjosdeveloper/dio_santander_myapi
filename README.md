# dio_santander_myapi
My first Java API for consumption and learning.

Segue a publicação de minha api onde a mesma consome o banco de dados local MySql.
Para testar a mesma deve-se alterar o arquivo application.properties com dados de sua conexão.

Para Efetuar o Inser na API utilizar o caminho 



## POST
http://localhost:8080/admin
Seguindo o JSON exemplo:
    
    {
 	"anoLancamento"	: "2013",
	"faixaetaria":0,
	"nomeGame" : "Remember Me",
	"genero":"Aventura e Plataforma",
	"plataforma":"PS3",
	"tipoMidia":"Download Pirate",
	"sinopse":"O jogador controla Nilin, uma caçadora de memórias amnésica, nas ruas de uma neo-Paris no ano 2084. Este futuro distópico apresenta um estado de vigilância."
    }

## GET
* Retorna toda a lista de dados cadastrada
    http://localhost:8080/admin/lista
* Retorna a lista a partir do ID informado após admin
    http://localhost:8080/admin/5

## DELETE
* Para o metodo delete, apenas mudando o tipo de requisição e mantendo o id desejado no final.
    http://localhost:8080/admin/5


# O que falta?
* Impelementar autenticação com oSpring Boot Security
* Elaborar a pagina web de consumo da API
* Efetuar Filtro de Validação dos Dados
* Melhorar a estrutura para regra de negócios
* Utilizar o Swagger para documentação.
