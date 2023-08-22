package com.example.layerdao.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

@EnableAutoConfiguration
@org.springframework.stereotype.Repository
public class Repository {

    @Autowired
    NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    private final String pathFileReq = "req.sql";


    private final String scriptProduct = read(pathFileReq);


    private static String read(String scriptFileName) {
        try (InputStream is = new ClassPathResource(scriptFileName).getInputStream();
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is))) {
            //System.out.println(bufferedReader.lines().collect(Collectors.joining("\n")));
            return bufferedReader.lines().collect(Collectors.joining("\n"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<String> getProduct(String name) {
        SqlParameterSource namedParameters = new MapSqlParameterSource("name", name);
        //String result = namedParameterJdbcTemplate.queryForObject(scriptProduct, namedParameters, String.class);
        List<String> result = namedParameterJdbcTemplate.queryForList(scriptProduct, namedParameters, String.class);
        System.out.println(result);
        return result;
    }
}
