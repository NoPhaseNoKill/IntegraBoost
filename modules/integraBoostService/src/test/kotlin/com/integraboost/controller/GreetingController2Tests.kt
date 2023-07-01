package com.integraboost.controller

import com.integraboost.IntegrationTest
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultHandlers
import org.springframework.test.web.servlet.result.MockMvcResultMatchers

@SpringBootTest
@AutoConfigureMockMvc
class GreetingController2Tests: IntegrationTest() {

    @Autowired
    private val mockMvc: MockMvc? = null
    @Test
    @Throws(Exception::class)
    fun noParamGreetingShouldReturnDefaultMessage() {
        println("GreetingController2Tests first() start => " + Thread.currentThread().name)
        Thread.sleep(500)
        mockMvc!!
            .perform(MockMvcRequestBuilders.get("/greeting"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.content").value("Hello, World!"))
        println("GreetingController2Tests first() end => " + Thread.currentThread().name)
    }

    @Test
    @Throws(Exception::class)
    fun paramGreetingShouldReturnTailoredMessage() {
        println("GreetingController2Tests second() start => " + Thread.currentThread().name)

        Thread.sleep(500)

        mockMvc!!
            .perform(MockMvcRequestBuilders.get("/greeting")
                .param("name", "Spring Community"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.content").value("Hello, Spring Community!"))

        println("GreetingController2Tests second() end => " + Thread.currentThread().name)
    }
}
