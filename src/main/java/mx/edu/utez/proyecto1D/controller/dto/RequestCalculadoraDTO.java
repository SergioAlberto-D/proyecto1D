package mx.edu.utez.proyecto1D.controller.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RequestCalculadoraDTO {
    private int num1;
    private int num2;

    @NotNull
    @NotBlank(message = "La operacion es obligatoria ")
    private String operacion;
}
