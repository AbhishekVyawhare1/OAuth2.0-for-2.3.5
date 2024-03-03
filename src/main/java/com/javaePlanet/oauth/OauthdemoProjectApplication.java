package com.javaePlanet.oauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OauthdemoProjectApplication {

    // Main method to start the Spring Boot application
    public static void main(String[] args) {
        SpringApplication.run(OauthdemoProjectApplication.class, args);
    }

}
//
//WebSecurityConfiguration:
//
//This class configures Spring Security for the web application.
//It extends WebSecurityConfigurerAdapter.
//It autowires CustomUserDetailsService to provide user details for authentication.
//It overrides configure(AuthenticationManagerBuilder auth) to specify the authentication mechanism. Here, it sets the custom user details service for authentication.
//It declares a bean authenticationManagerBean() which exposes the AuthenticationManager as a bean.

//AuthorizationServerConfiguration:
//
//This class configures the Authorization Server for OAuth 2.0.
//It extends AuthorizationServerConfigurerAdapter.
//It enables Authorization Server with @EnableAuthorizationServer.
//It defines the token store (here, it's an in-memory store).
//It autowires AuthenticationManager for user authentication and CustomUserDetailsService to load user details.
//It configures AuthorizationServerEndpointsConfigurer to set the token store, authentication manager, and user details service.
//It configures clients allowed to access the Authorization Server in configure(ClientDetailsServiceConfigurer clients). Here, it's configured to allow access with a specific client ID, grant types, scopes, and client secret.

//ResourceServerConfiguration:
//
//This class configures the Resource Server, which validates tokens and authorizes requests.
//It extends ResourceServerConfigurerAdapter.
//It enables the Resource Server with @EnableResourceServer.
//It sets the resource ID for the server.
//It configures security rules using HttpSecurity. Requests are restricted based on roles and authentication status.

//Flow:
//
//When a client requests access to a protected resource, it sends its credentials to the Authorization Server.
//The Authorization Server authenticates the client and generates an access token if the client is authorized.
//The client includes this access token in the request to the Resource Server.
//The Resource Server validates the access token.
//If the token is valid and authorized, the Resource Server grants access to the requested resource.
//The WebSecurityConfiguration handles authentication of users.
//The AuthorizationServerConfiguration generates access tokens and authorizes clients.
//The ResourceServerConfiguration validates tokens and authorizes access to protected resources.
//Overall, the flow involves client authentication, token generation, token validation, and resource access authorization. Each class plays a specific role in this flow.