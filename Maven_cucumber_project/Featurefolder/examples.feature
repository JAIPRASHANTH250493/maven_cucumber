Feature: example keyyword scenario
Scenario Outline: login password for organg-hrm
Given user launched the orgaehrm
When he enter differenceusernameand passwrdchecks the messgae "<username>"  "<password>"
Then he clicks in the sign in button
And he now checks he login button
Then makes a error 

Examples:
| username | password |
	| JJIB  | KKNX |
	|  KAJJJD    | test456  |
| username | password |
	
	
	Scenario: sample scenario with outline
Given im asample
When im a sampletoo
Then samplethen