package io.github.benkoff.springsecurity.controllers;

import io.github.benkoff.springsecurity.SpringsecurityApplication;
import io.github.benkoff.springsecurity.configuration.SecurityConfig;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.user;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

/**
 * Created by Ben Novikov on 2018 March 24
 */
@RunWith(SpringRunner.class)
@EnableWebSecurity
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK, classes = SpringsecurityApplication.class)
//@Import(SecurityConfig.class)
public class HomeControllerTest {

    private MockMvc mockMvc;
    @Autowired private WebApplicationContext wac;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }

    @Test
    public void testIndexShouldReturnOkAndViewHome() throws Exception {
        mockMvc.perform(get("/index"))
                .andExpect(status().isOk())
                .andExpect(view().name("/home"));
    }

    @Test
    public void testUserShouldReturnOkAndViewUser() throws Exception {
        mockMvc.perform(get("/user"))
                .andExpect(status().isOk())
                .andExpect(view().name("/user"));
    }

    @Test
//    @WithMockUser(username="user", password="password", roles={"USER"})
    public void testAdminShouldReturnOkAndViewAdmin() throws Exception {
//        mockMvc.perform(get("/admin").with(user("user").password("password").roles("USER")))
//                .andExpect(status().isForbidden());
        mockMvc.perform(get("/admin"))
                .andExpect(status().isOk())
                .andExpect(view().name("/admin"));
    }
}

