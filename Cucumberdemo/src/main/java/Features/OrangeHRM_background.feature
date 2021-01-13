Feature: OrangeHRM Login

  Background: Below are the background steps
    Given I launch the chrome broweser
    When I open the OrangeHRM Homepage

  Scenario: Logo presence on orangeHRM homepage
    Then I verify that logo present on the page
    And I close the browser

  Scenario: login to OrangeHRM with valid credential
    And Enter username and password
    And click on the login button
    Then User must succesfully login to the Dashboard page
    And I close the browser

  #Passing parameters to step
  Scenario: login to OrangeHRM with valid credential
    And Enter username "Admin" and password "admin123"
    And click on the login button
    Then User must succesfully login to the Dashboard page
    And I close the browser

  #Passing Mulitple parameters using scenario outline and Example Keyword
  Scenario Outline: login to OrangeHRM with Multiple Parameter
    And Enter username "<username>" and password "<password>"
    And click on the login button
    Then User must succesfully login to the Dashboard page
    And I close the browser

    Examples: 
      | username | password |
      | admin    | admin123 |
      | admin    | admin123 |

  #Passing parameters using data table
  Scenario: login to OrangeHRM with Datatable parameter
    And Enter username  and password from Datatable
      | admin | admin123 |
    And click on the login button
    Then User must succesfully login to the Dashboard page
    And I close the browser
