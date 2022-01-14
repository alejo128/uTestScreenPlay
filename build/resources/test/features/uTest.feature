# Autor: Jose Alejandro Diaz Urrego
  # language: en
@stories
Feature: uTest sign up
  As a user, I want to sign up in the uTest webpage
  @scenario1
  Scenario: Sign up in the uTest webpage
    Given than Alejandro Diaz wants to sign up in the uTest webpage, he press the join today button
      | strFirstName     |  strLastName      | strEmail  |  strBirthMonth | strBirthDay | strBirthYear |
      | yourName         |   yourLastName    | yourEmail |  1             | 28          | 1993         |
    When he fill the information for the step 2
      | strCity   | strZip      | strCountry  |
      | yourCity  | yourZipCode | Colombia    |
    When he fill the information for the step 3
      | strOSBrand   | strOSVersion      | strOSLanguage    |
      | yourOSBrand  | yourOSVersion     | yourOSLanguage   |
    Then he finish the signup picking the password
      | strPassword    |  strConfirmPassword  |
      | password123*   |  password123*        |