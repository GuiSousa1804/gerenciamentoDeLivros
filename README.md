# gerenciamentoDeLivros
primeiro exercício da lista do primeiro bimestre da matéria de Programação avançada.

Uma aplicação Spring Boot para gerenciar livros. O objetivo é praticar
mapeamento JPA, criação de tabela customizada e uso do CRUD com operações
RESTful.

Requisitos:
. Crie uma entidade JPA chamada Livro com os atributos especificados
. Configure o nome da entidade JPA como Livro
. Configure o nome da tabela no banco como tb_livro
. Pelo menos dois atributos devem ter o nome do campo diferente do nome da coluna no banco, utilizando @Column(name="...")
. Implemente um repositório Spring Data JPA para a entidade
. Implemente um serviço para realizar as operações de CRUD
. Crie um controlador REST que exponha os seguintes endpoints

Endpoints RESTful:
. POST /livros — criar novo livro
. GET /livros — listar todos os livros
. GET /livros/{id} — buscar livro por ID
. DELETE /livros/{id} — deletar livro por ID
