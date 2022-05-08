package edu.phoenix;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Client {
  private String name;
  private int age;
}
