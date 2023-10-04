# Mini_Projeto1-LPII

Mini Projeto 1 – Linguagem de Programação II – 2023.2
Obs.: deve-se utilizar os conceitos de orientação a objetos, herança,
polimorfismo e MVC
Programe um pequeno organizador de empréstimo de livros de uma biblioteca 
comunitária. A ideia é motivar um clubinho de leitura e incentivar crianças e 
adultos a lerem.
Em geral a biblioteca possui um cadastro de todos os exemplares. Os 
exemplares podem ser livros ou revistas (hqs, mangas, ...) cada um com suas 
características compartilhadas e próprias. 
O cadastro de cada item deve possuir ao menos título, autores, resumo, editora, 
ano, quantidade de páginas, gênero. No caso de revista, o exemplar também 
possui volume e mês da publicação.
Um mesmo livro pode ter vários exemplares no acervo, o mesmo se aplica aos 
demais tipos. 
Como funcionalidades, o sistema precisa:
a) Permitir o cadastro de todo o acervo
b) Permitir a consulta ao acervo por
 - título
 - autor
 - resumo
 sendo que para tanto o usuário irá informar uma substring (palavras chave) a 
ser buscada
c) Permitir cadastro e manutenção de usuários da biblioteca
 - Criar usuário com nome, cpf, data de nascimento, indicador de adulto ou 
criança
 - Permitir editar campos de usuário
d) Permitir o registro de movimentação feita pelos usuários:
 - Registrar o usuário que está fazendo a movimentação, assim como a data da 
mesma
 - Empréstimo de exemplar 
 * limite máximo para devolução de 7 dias
 ** Um exemplar já emprestado, não pode ser novamente emprestado, nem 
renovado
 *** Um usuário só pode realizar um empréstimo por vez. Assim se ele já tiver 
um exemplar em mãos, deve devolvê-lo primeiro
 - Devolução de exemplar 
 * registrar a data da devolução e coletar se o usuário leu a obra ou não
 - Emitir relatório de leitura por usuário
 * somente contar obras que o usuário afirmou ter lido
e) Emitir relatório de empréstimo/devolução para o acervo todo
f) Emitir relatório ranking de leitura para todos os usuários
 - Somente para usuários que forem crianças
 - Somente contar obras que o usuário afirmou ter lido
