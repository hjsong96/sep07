package com.hadine.entity;

import java.util.List;
import java.util.Map;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Document(collection = "test")
@AllArgsConstructor
@NoArgsConstructor
public class Test {
	private String id;
	private int age;
	private String name;
	private Map<String, String> hobby;
}
