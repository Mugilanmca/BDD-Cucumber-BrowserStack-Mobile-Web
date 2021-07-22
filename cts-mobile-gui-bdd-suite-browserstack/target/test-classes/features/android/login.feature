@android_native
Feature: User Enrollment - I want to make enrollment with new user sign-in details.

@login @testmugi1
Scenario: Verify new personal user able to sign-in to the application
Given I am enrolled as a new user
When I login with valid user credentials
Then I am taken to the home screen


@login @testmugi10
Scenario: Verify new Business user able to sign-in to the application
Given I am enrolled as a new BUsiness user
When I login with valid user credentials
Then I am taken to the home screen