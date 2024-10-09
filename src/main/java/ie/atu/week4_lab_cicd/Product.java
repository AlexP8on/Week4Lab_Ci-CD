package ie.atu.week4_lab_cicd;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @NotBlank(message= "You must enter name")
    private String name;
    @Min(value=1, message="Must be greater than one")
    private int id;
}
