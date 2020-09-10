$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/CadastrarUsuario.feature");
formatter.feature({
  "name": "Cadastrar usuario",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@CadastrarUsuario"
    }
  ]
});
formatter.scenario({
  "name": "Cadastrar usuario",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@CadastrarUsuario"
    },
    {
      "name": "@Cadastro"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "eu acionar a aba admin",
  "keyword": "Quando "
});
formatter.match({
  "location": "stepsDefinitions.CadastrarUsuariosSteps.euAcionarAAbaAdmin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "acionar o botao add",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.CadastrarUsuariosSteps.acionarOBotaoAdd()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar no campo employee name \"Fiona Grace\"",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.CadastrarUsuariosSteps.informarNoCampoEmployeeName(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar no campo user name \"Antonio\"",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.CadastrarUsuariosSteps.informarNoCampoUserName(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar no campo password \"12345678\"",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.CadastrarUsuariosSteps.informarNoCampoPassword(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar no campo confirmar password \"12345678\"",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.CadastrarUsuariosSteps.informarNoCampoConfirmarPassword(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "acionar o botao salvar",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.CadastrarUsuariosSteps.acionarOBotaoSalvar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema cadastra o usuario \"Antonio\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "stepsDefinitions.CadastrarUsuariosSteps.oSistemaCadastraOUsuario(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "image");
formatter.after({
  "status": "passed"
});
});