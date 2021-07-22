@ios_native
Feature: User Enrollment - I want to make enrollment with new user sign-in details.

  @searchProduct @testmugi2
  Scenario Outline: Verify Guest user able to search product details
    Given I am login as a guest user and launch the app
    When I search for the "<product>" in home screen
    Then I am able to navigate to Product list page with the product

    Examples: 
      | tc_id | product     |
      |   001 | iPhone      |
      #|   002 | iPad        |
      #|   003 | iMac        |
      #|   004 | Apple watch |
      #|   005 | Macbook     |
      #|   006 | Watch       |
