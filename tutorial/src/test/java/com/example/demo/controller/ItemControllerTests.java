package com.example.demo.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import com.example.demo.TutorialApplication;

@AutoConfigureMockMvc
@SpringBootTest(classes = TutorialApplication.class)
public class ItemControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void init処理が走って200が返る() throws Exception {
        // andDo(print())でリクエスト・レスポンスを表示
        this.mockMvc.perform(get("/items")).andDo(print())
            .andExpect(status().isOk());
    }
}
