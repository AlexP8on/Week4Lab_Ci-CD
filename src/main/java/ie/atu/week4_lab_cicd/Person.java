package ie.atu.week4_lab_cicd;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Person {
    @NotBlank(message="You must enter a name") private String name;

    @NotBlank (message="You must enter a title") private String title;

    @PositiveOrZero(message="You must enter a valid id") private int employeeld;

    @PositiveOrZero(message="You must enter a valid age") private int age;

    @Email(message="You must enter a valid email") private String email;

    @NotBlank(message="You must enter a position") private String position;

    @NotBlank(message="You must enter a department") private String depatment;
}
