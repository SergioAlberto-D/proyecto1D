package mx.edu.utez.proyecto1D.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseCalculadoraDTO {
    private int resultado;
    private String operacionRealizada;
}
