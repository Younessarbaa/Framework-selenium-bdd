@connexion
Feature: Authentification - OrangeHRM
  En tant que utilisateur je souhaite m authentifier

  @ct-passant @jddo
  Scenario: Authentification - OrangeHRM
    Given Je me connecte sur l application OrangeHRM
    When Je saisie le login "Admin"
    And Je saisie le mot de passe "admin123"
    And je clique sur login
    Then Redirection vers l accueil

  @ct-non-passant @jdd
  Scenario Outline: Authentification - OrangeHRM
    Given Je me connecte sur l application OrangeHRM
    When Je saisie le login "<login>"
    And Je saisie le mot de passe "<password>"
    And je clique sur login
    Then je verifie le message d erreur de la page connexion "<message>"

    Examples: 
      | login  | password | message                  |
      | Admin  | admin123 |       |
      |        | admin123 | Username cannot be empty |
      | test   | test123  | Invalid credentials      |
      | testoo | teto     | Invalid credentials      |

  @forgot-password
  Scenario: Verification mot de passe oublié
    Given Je me connecte l application OrangeHRM
    When Je clique sur le lien "forgot your password"
    And Je verfie la page forgot your password
    And Je saisie username
    And Je clique sur le button Reset Password

  @widgets
  Scenario: Verification des widgets
    Given Je me connecte l application OrangeHRM
    When Je clique sur le widget Linkedin
    Then Redirection vers la page Linkedin
    When Je clique sur le widget Facebook
    Then Redirection vers la page Facebook
    When Je clique sur le widget twitter
    Then Redirection vers la page twitter
    When Je clique sur le widget youtube
    Then Redirection vers la page youtube
  #@connexion
  #Scenario Outline: Authentification - OrangeHRM
    #Given Je me connecte sur l application OrangeHRM
    #When Je saisie le login "<login>"
    #And Je saisie le mot de passe "<password>"
    #And je clique sur login
    #Then Redirection vers l accueil
#
    #Examples: 
      #| login | password |
      #| Admin | admin123 |
