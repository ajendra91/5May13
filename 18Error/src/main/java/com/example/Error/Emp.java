package com.example.Error;

import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Emp {


    public int id;
    public String name;
    @NotEmpty(message = "name can not empty")
    @Size(min=2,max=3,message = "2 and 3")
    public String age;
   // @NotEmpty(message = "age can not empty")
}
