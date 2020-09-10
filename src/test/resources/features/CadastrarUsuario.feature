#language: pt
#encoding: UTF-8

@CadastrarUsuario
Funcionalidade: Cadastrar usuario

@Cadastro
Cenario: Cadastrar usuario
	Quando eu acionar a aba admin
	E acionar o botao add
	E informar no campo employee name "Fiona Grace"
	E informar no campo user name "Antonio"
	E informar no campo password "12345678"
	E informar no campo confirmar password "12345678"
	E acionar o botao salvar
	Entao o sistema cadastra o usuario "Antonio"