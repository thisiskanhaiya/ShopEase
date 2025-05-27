/* package com.ecom.shopease.controller;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import org.springframework.http.MediaType;

import com.ecom.shopease.model.User;
import com.ecom.shopease.repository.UserRepository;

@WebMvcTest(AuthController.class)
public class AuthControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserRepository userRepository;

    @Test
     public void testRegisterUser_Success() throws Exception {
        // Mock repository behavior
        Mockito.when(userRepository.findByEmail("john.doe@example.com")).thenReturn(java.util.Optional.empty());

        // Perform POST request
        mockMvc.perform(post("/api/auth/register")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"name\": \"John Doe\", \"email\": \"john.doe@example.com\", \"password\": \"password123\"}"))
                .andExpect(status().isOk())
                .andExpect(content().string("User registered successfully"));
    }

    @Test
    public void testRegisterUser_EmailAlreadyExists() throws Exception {
        // Mock repository behavior
        User existingUser = new User();
        existingUser.setEmail("john.doe@example.com");
        Mockito.when(userRepository.findByEmail("john.doe@example.com")).thenReturn(java.util.Optional.of(existingUser));

        // Perform POST request
        mockMvc.perform(post("/api/auth/register")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"name\": \"John Doe\", \"email\": \"john.doe@example.com\", \"password\": \"password123\"}"))
                .andExpect(status().isBadRequest())
                .andExpect(content().string("Email is already in use"));
    }
    
} */
