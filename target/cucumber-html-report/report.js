$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/Resources/HomePage.feature");
formatter.feature({
  "line": 1,
  "name": "Argos website homepage functionality",
  "description": "",
  "id": "argos-website-homepage-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 20060404500,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Argos HomePage",
  "description": "",
  "id": "argos-website-homepage-functionality;argos-homepage",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is on argos homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user search puma",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user can see all puma product",
  "keyword": "Then "
});
formatter.match({
  "location": "HomepageStepDef.user_is_on_argos_homepage()"
});
formatter.result({
  "duration": 3142645900,
  "status": "passed"
});
formatter.match({
  "location": "HomepageStepDef.user_serach_puma()"
});
formatter.result({
  "duration": 1498254100,
  "status": "passed"
});
formatter.match({
  "location": "HomepageStepDef.user_can_see_all_puma_product()"
});
formatter.result({
  "duration": 32400,
  "status": "passed"
});
formatter.after({
  "duration": 1918702000,
  "status": "passed"
});
});