
# Info about Okta metadata URI
Audience URI(SP Entity ID) = security.saml2.metadata-url

# to generate Key Store
keytool -genkey -v -keystore keystore.jks -alias spring -keyalg RSA -keysize 2048 -validity 10000

# Pom.xml additional Entries
```
<repositories>
	<repository>
	  <id>spring-milestones</id>
	  <name>Spring Milestones</name>
	  <url>https://repo.spring.io/libs-milestone</url>
	</repository>
</repositories>
	
<dependency>
	<groupId>org.springframework.security.extensions</groupId>
	<artifactId>spring-security-saml-dsl</artifactId>
	<version>1.0.0.M3</version>
</dependency>

<dependency>
	<groupId>org.springframework.security.extensions</groupId>
	<artifactId>spring-security-saml2-core</artifactId>
	<version>1.0.3.RELEASE</version>
</dependency>	
```
