package com.jeonguk.model;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class Person implements Serializable {
	private String firstName;
	private String lastName;
}
