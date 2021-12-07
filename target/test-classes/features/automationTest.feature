#language: pt
#encoding: utf-8
Funcionalidade: Validar Perfil nas plataformas

    @testProfile @testLinkedin
	Cenário: Verificar Profile Linkedin
		Dado que acessei o site do linkedin
		E me direciono a página de procurar pessoas conhecidas
        Quando pesquiso o perfil da pessoa com nome "Marlon" e sobrenome "Junior"
        E seleciono o com o titulo "Desenvolvedor de Testes Automatizados Pleno na Accenture" e nome "Marlon Junior"
        Então verifico o curriculo

    @testProfile @testGitHub
	Cenário: Verificar Profile gitHub
		Dado que acessei o site do GitHub
        Quando pesquiso o "Users" com nome "marlonrfjunior"
        Então verifico a pagina do Usuário
