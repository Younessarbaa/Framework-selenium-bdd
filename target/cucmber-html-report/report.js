$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("accueil/accueil.feature");
formatter.feature({
  "line": 2,
  "name": "Accueil-OrangeHRM",
  "description": "En tant que utilisateur orange je souhaite acceder au module Buzz",
  "id": "accueil-orangehrm",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@accueil"
    }
  ]
});
formatter.before({
  "duration": 25266529996,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "Je me connecte sur l application OrangeHRM",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Je saisie le login \"Admin\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Je saisie le mot de passe \"admin123\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "je clique sur login",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "je clique sur le module Recruitment",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "je verifie l affichage de la page Recruitment",
  "keyword": "Then "
});
formatter.match({
  "location": "AuthentificationOutlineStepDefinition.je_me_connecte_sur_l_application_OrangeHRM()"
});
formatter.result({
  "duration": 3064756700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 20
    }
  ],
  "location": "AuthentificationOutlineStepDefinition.je_saisie_le_Admin(String)"
});
formatter.result({
  "duration": 160059012,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin123",
      "offset": 27
    }
  ],
  "location": "AuthentificationOutlineStepDefinition.je_saisie_le_mot_de_passe_admin(String)"
});
formatter.result({
  "duration": 112995117,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationOutlineStepDefinition.je_clique_sur_login()"
});
formatter.result({
  "duration": 2639664850,
  "status": "passed"
});
formatter.match({
  "location": "AccueilStepDefinition.je_clique_sur_le_module_Recruitment()"
});
formatter.result({
  "duration": 9720046446,
  "status": "passed"
});
formatter.match({
  "location": "AccueilStepDefinition.je_verifie_l_affichage_de_la_page_Recruitment()"
});
formatter.result({
  "duration": 63366193,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Acceder au module PIM",
  "description": "",
  "id": "accueil-orangehrm;acceder-au-module-pim",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@PIM"
    },
    {
      "line": 13,
      "name": "@jddok"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "je clique sur le module PIM",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "je verifie l affichage de la page PIM",
  "keyword": "Then "
});
formatter.match({
  "location": "AccueilStepDefinition.je_clique_sur_le_module_PIM()"
});
formatter.result({
  "duration": 2506166912,
  "status": "passed"
});
formatter.match({
  "location": "AccueilStepDefinition.je_verifie_l_affichage_de_la_page_PIM()"
});
formatter.result({
  "duration": 35526176,
  "status": "passed"
});
formatter.after({
  "duration": 5787299451,
  "status": "passed"
});
});