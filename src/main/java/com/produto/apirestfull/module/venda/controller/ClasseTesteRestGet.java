package com.produto.apirestfull.module.venda.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
public class ClasseTesteRestGet {

	private final CloseableHttpClient httpClient = HttpClients.createDefault();

	public Object buscaDados() throws IOException {
		String url = "http://localhost:8080/carrinho/vendas";
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		// optional default is GET
		con.setRequestMethod("GET");
		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

		StringBuffer response = new StringBuffer();

		in.close();
		// print in String
		System.out.println(response.toString());
		return response.toString();
	}
}