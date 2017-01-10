Scenario: Checking personal folders on github
Given the user 'artur_dvorak@epam.com' with password 'Apm7390708' is on main github page
When the user opens personal repository
Then amount of repositories should be printed