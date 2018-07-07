# To Decrypt any key
use '{[/decrypt],methods=[POST]}' to decrypt config secrets like passwords.

# To Encrypt any key
1. use '{[/encrypt],methods=[POST]}'
2. write {cypher} followed br secret in properties before check-in.
    eg. {cypher}sadcsadfsdf where 'sadcsadfsdf' is generated secret. 

# If Working with spring data jpa then comment 'spring-boot-starter-actuator' dependency. 
