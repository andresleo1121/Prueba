@RunAll
Feature: Falabella test cases

 @Login
  Scenario: Login Falabella
    Given the user is in the index page falabella
    When the user enters name and password
    And End
    
 @OrderPrice
 	Scenario: Order price streaming 
 		Given the user is in the index page falabella
 		When Select streaming
 		Then sort from lowest to highest price
 		And End
 		
	@Filterbrand
 	Scenario: filter by brand
 		Given the user is in the index page falabella
 		When Select categories tv
 		Then filter by brand
 		And End
 		
 	@AddBag
 	Scenario: Add bag
 		Given the user is in the index page falabella
 		When Select categories tv
 		Then filter by brand
 		And Select product
 		And End
 		
 	@FilterPrice
 	Scenario: filter price
 		Given the user is in the index page falabella
 		When Select categories pc
 		Then Select price
 		And End
 		
 		
 		
 		
    
    

